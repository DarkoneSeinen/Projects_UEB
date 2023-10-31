package co.edu.unbosque.model;

import java.io.Serializable;

public class PartidaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre1;
	private String nombre2;
	
	public PartidaDTO(String nombre1, String nombre2) {
		super();
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
