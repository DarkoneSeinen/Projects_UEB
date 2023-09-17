package co.edu.unbosque.controller;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.View;

public class Controller {
	private Kira kira;
	private Astar astar;
	private Andres andres;
	private Renk renk;
	
	private View view;
	
	public Controller() {
		kira= new Kira();
		astar=new Astar();
		andres=new Andres();
		renk=new Renk();
		
		view=new View();
		
		funcionar();
		
	}
	
	public void funcionar() {
		
		switch(view.obtenerOpcion()) {
		
		case 1:
			int heroeselecc=view.seleccionarHeroe();
			
			if(heroeselecc==1) {
			
			    view.mostarHeroe(kira.hacerHerencia());
			    
			    }if(heroeselecc==2) {
				
				view.mostarHeroe(astar.hacerHerencia());
			  
			}else {
				System.out.println("no es un heroe");
			}
		break;
		
		case 2:
			
			view.mostarMortal(andres.hacerHerencia());
			
			break;
		
		case 3:
			
			
			view.mostarDest(renk.hacerHerencia());
			break;
			
		case 4:
			view.mostrarSalida();
			break;
			
		default:
			System.out.println("opcion no valida");
		
		}
	}

}
