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
		view.mostarShazam(cosa.mostrarShazam());
		view.mostarJet(cosa.mostarJet());
		view.mostarHelicoptero(cosa.mostarHelicoptero());
		view.mostarHidro(cosa.mostrarHidroplano());
		view.mostarAve(cosa.mostrarAve());
	}

}
