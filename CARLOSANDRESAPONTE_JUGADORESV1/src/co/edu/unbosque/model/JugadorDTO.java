package co.edu.unbosque.model;

import java.io.Serializable;

public class JugadorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int edad;
	private int documento;
	
	
	public JugadorDTO(String nombre, int edad, int documento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.documento = documento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getDocumento() {
		return documento;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	



	

}
