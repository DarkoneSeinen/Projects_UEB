package co.edu.unbosque.controller;

import co.edu.unbosque.model.CosaVoladora;
import co.edu.unbosque.view.View;

public class Controller {
	
	private CosaVoladora cosa;
	private View view;
	
	public Controller() {
		cosa= new CosaVoladora();
		view=new View();
		
		funcionar();
	}
	
	public void funcionar(){
		view.mostarSuper(cosa.mostrarSuperman());
		view.mostarAve(cosa.mostrarAve());
		view.mostarAvion(cosa.mostrarAvion());
	}

}
