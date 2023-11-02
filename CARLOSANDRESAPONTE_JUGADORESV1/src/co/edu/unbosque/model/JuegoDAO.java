package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class JuegoDAO {
	
	private ArrayList<JuegoDTO> juegos;
	
	private BinariosFile bf;
	
	public JuegoDAO() {
		
		juegos= new ArrayList<JuegoDTO> ();
		bf= new BinariosFile();
		
	}
	
	public String toString() {
		String juegosActuales = "";
		for (int i = 0; i < juegos.size(); i++) {
			juegosActuales += "Juego " + (i+1) + "\n";
			juegosActuales += "Nombre: " + juegos.get(i).getNombre() + "\n";
			juegosActuales += "Tipo de juego: " +  juegos.get(i).getTipojuego() + "\n";
		}
		if (juegosActuales.equals("")) {
			juegosActuales += "No se han registrado juegos hasta ahora\n";
		}
		return juegosActuales;
	}
	
	public int obtenerIndiceJuegoAModificar(String nombre ) {
		for (int i = 0; i < juegos.size(); i++) {
			if (juegos.get(i).getNombre().equals(nombre)) {
				return i;
			}
		}
		return -1;
	}
	
	public void modificarJuego(int indice,JuegoDTO juego) {
		juegos.set(indice, juego);
	}
	
	public JuegoDTO revisarJuego(String nombre) {
		for (int i = 0; i < juegos.size(); i++) {
			if (juegos.get(i).getNombre().equals(nombre)) {
				return juegos.get(i);
			}
		}
		return null;
	}
	
	
	public void borrarJuego(int indice) {
		juegos.remove(indice);
	}
	
	
	
	public void agregarJuego(JuegoDTO juego) {
		juegos.add(juego);
	}

	public void obtenerJuego() {
		juegos= bf.leerJuegos();
	}
	
	public void registrarJuego() {
		bf.registrarJuegos(juegos);
	}

	public ArrayList<JuegoDTO> getJuegos() {
		return juegos;
	}

	public void setJuegos(ArrayList<JuegoDTO> juegos) {
		this.juegos = juegos;
	}

	public BinariosFile getBf() {
		return bf;
	}

	public void setBf(BinariosFile bf) {
		this.bf = bf;
	}
	
	
	

}
