package co.edu.unbosque.model;

import java.io.Serializable;

public class JuegoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String tipojuego;
	
	
	public JuegoDTO(String nombre, String tipojuego) {
		super();
		this.nombre = nombre;
		this.tipojuego = tipojuego;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipojuego() {
		return tipojuego;
	}


	public void setTipojuego(String tipojuego) {
		this.tipojuego = tipojuego;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
