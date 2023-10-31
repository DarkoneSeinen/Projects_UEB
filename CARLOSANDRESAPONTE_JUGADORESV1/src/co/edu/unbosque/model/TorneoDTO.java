package co.edu.unbosque.model;

import java.io.Serializable;

public class TorneoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ganador;
	private int partida;
	
	
	public TorneoDTO(String ganador, int partida) {
		super();
		this.ganador = ganador;
		this.partida = partida;
	}


	public String getGanador() {
		return ganador;
	}


	public void setGanador(String ganador) {
		this.ganador = ganador;
	}


	public int getPartida() {
		return partida;
	}


	public void setPartida(int partida) {
		this.partida = partida;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
