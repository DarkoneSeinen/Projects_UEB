package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.*;
import co.edu.unbosque.model.*;

public class Controller implements ActionListener {
	
	private View gui;
	private Figuras model;

	public Controller() {
		
		gui = new View(this);
		gui.setVisible(true);
		
		model = new Figuras();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
	    
		if(evento.getActionCommand().equals(gui.getMenu().CIRCULO)) {
			model.setDiametro(gui.obtenerDiamentro());
			gui.mostrarMensaje("el perimetro del circulo es: "+model.calcularperimetroCirc()+" y el area es: "+model.calcularareaCirc());

		}
		
		if(evento.getActionCommand().equals(gui.getMenu().CUADRADO)) {
		
			model.setLado(gui.obtenerLado());
			gui.mostrarMensaje("el perimetro del cuadrado es: "+model.calcularperimetroC()+" y el area es: "+model.calcularareaC());

		}
		
	}
		


}
