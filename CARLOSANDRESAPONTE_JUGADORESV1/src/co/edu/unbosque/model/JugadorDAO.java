package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class JugadorDAO {
	
	private ArrayList<JugadorDTO> jugadores;
	
	private BinariosFile bf;
	
	
	public JugadorDAO() {
		
		jugadores= new ArrayList<JugadorDTO> ();
		bf= new BinariosFile();

		
	}
	
	public void agregarJugador(JugadorDTO jugador) {
		jugadores.add(jugador);
	}
	
	public void obtenerJugador() {
		jugadores= bf.leerJugadores();
	}
	
	public void registrarJugador() {
		bf.registrarJugadores(jugadores);
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
