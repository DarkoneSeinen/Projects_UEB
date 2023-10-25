package co.edu.unbosque.controller;

import co.edu.unbosque.view.View;

public class Controller {
	
	private View gui;

	public Controller() {
		
		gui = new View(this);
		gui.setVisible(true);
		
		// Agregar escuchadores de eventos
//		BinariosFile gestor = new BinariosFile();
////		gestor.escribirEmpleado(new EmpleadoDTO(1, "Empleado1", 46556.5654));
//		gestor.leerEmpleado();
		
	}

}
