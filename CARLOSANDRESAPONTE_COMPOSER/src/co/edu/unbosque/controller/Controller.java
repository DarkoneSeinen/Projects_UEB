package co.edu.unbosque.controller;

import co.edu.unbosque.model.Composer;
import co.edu.unbosque.view.*;

public class Controller {
	
	private Composer composer;
	private View view;
	
	public Controller() {
		composer=new Composer();
		view= new View();
		
		funcionar();
	}
	
	public void funcionar() {
		boolean ciclo=true;
		
		while(ciclo) {
			switch(view.obtenerOpcion()) {
			case 1:
				composer.setEstrofas(view.obtenerN_estrofas());
				composer.setVersos(view.obtenerN_versos());
				composer.setNombreArchivo(view.obtenerNombreArchivo());
				composer.crearArchivos();
				
				
				break;
				
			case 2:{
				view.mostrarCancion(composer.obtenerArchivos());
				composer.gestionarPropiedades();
				break;
			}
			case 3:{
				view.mostrarSeleccionArchivo();
				break;
			}
			
			case 4:{
				ciclo=false;
				view.mostarSalida();
				
			}
			
			}
		}
			
			
		
		
	}

}


