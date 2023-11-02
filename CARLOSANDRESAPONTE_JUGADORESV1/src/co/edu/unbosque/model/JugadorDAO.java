package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class JugadorDAO {
	
	private ArrayList<JugadorDTO> jugadores;
	
	private BinariosFile bf;
	
	
	public JugadorDAO() {
		
		bf= new BinariosFile();
		jugadores = bf.leerJugadores();
		
	}
	
	public String toString() {
		String jugadoresActuales = "";
		for (int i = 0; i < jugadores.size(); i++) {
			jugadoresActuales += "Jugador " + (i+1) + "\n";
			jugadoresActuales += "Edad: " + jugadores.get(i).getEdad() + "\n";
			jugadoresActuales += "Nombre: " +  jugadores.get(i).getNombre() + "\n";
			jugadoresActuales += "Documento" +  jugadores.get(i).getDocumento() + "\n";
		}
		if (jugadoresActuales.equals("")) {
			jugadoresActuales += "No se han registrado jugadores hasta ahora\n";
		}
		return jugadoresActuales;
	}
	
	public void agregarJugador(JugadorDTO jugador) {
		jugadores.add(jugador);
	}
	
	public void obtenerJugador() {
		jugadores= bf.leerJugadores();
	}
	
	public void borrarJugador(int indice) {
		jugadores.remove(indice);
	}
	
	public void registrarJugador() {
		bf.registrarJugadores(jugadores);
	}
	
	public void modificarJugador(int indice, JugadorDTO jugador) {
		jugadores.set(indice, jugador);
	}
	
	public JugadorDTO revisarJugador(int documento) {
		for (int i = 0; i < jugadores.size(); i++) {
			// Revisar si el documento del jugador a modificar existe
			if (jugadores.get(i).getDocumento() == documento) {
				return jugadores.get(i);
			}
		}
		return null;
	}
	
	public int obtenerIndiceJugadorAModificar(int documento) {
		for (int i = 0; i < jugadores.size(); i++) {
			// Revisar si el documento del jugador a modificar existe
			if (jugadores.get(i).getDocumento() == documento) {
				return i;
			}
		}
		return -1;
	}


	public ArrayList<JugadorDTO> getJugador() {
		return jugadores;
	}


	public void setJugador(ArrayList<JugadorDTO> jugador) {
		this.jugadores = jugador;
	}


	public BinariosFile getBf() {
		return bf;
	}


	public void setBf(BinariosFile bf) {
		this.bf = bf;
	}
	
	

}
