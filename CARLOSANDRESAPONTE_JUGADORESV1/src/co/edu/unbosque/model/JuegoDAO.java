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
