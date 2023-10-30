package co.edu.unbosque.controller;

import java.awt.event.*;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View gui;
	private JugadorDAO gestorJugador;
	private JuegoDAO gestorJuego;

	public Controller() {
		
		gui = new View(this);
		gui.setVisible(true);
		
		gestorJugador= new JugadorDAO();
		gestorJuego= new JuegoDAO();
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if(evento.getActionCommand().equals(gui.getMenu().JUGADOR)) {
			gui.getJugador().setVisible(true);
			
			
		}
		
		if(evento.getActionCommand().equals(gui.getMenu().JUEGO)) {
			gui.getJuego().setVisible(true);
			gui.getMenu().setVisible(false);
			
		}
		
		if(evento.getActionCommand().equals(gui.getMenu().TORNEO)) {
			gui.getTorneo().setVisible(true);
			gui.getMenu().setVisible(false);

		}
		
		if(evento.getActionCommand().equals(gui.getMenu().PARTIDA)) {
			gui.getPartida().setVisible(true);
			gui.getMenu().setVisible(false);
		}
		
		
		if(evento.getActionCommand().equals(gui.getJugador().AGREGAR_JUGADOR)){
		String nombre= gui.getJugador().getEntradanombre().getText();
		int documento= Integer.parseInt(gui.getJugador().getEntradoc().getText()); 
		int edad= Integer.parseInt(gui.getJugador().getEntradaedad().getText());
		
		System.out.println(nombre);
		System.out.println(documento);
		System.out.println(edad);
		
		gestorJugador.getJugador().add(new JugadorDTO(nombre, edad, documento));
		
		gestorJugador.registrarJugador();
		
		gui.mostrarMensaje();
		}
		
		if (evento.getActionCommand().equals(gui.getJuego().AGREGAR_JUEGO)) {
			String nombre=gui.getJuego().getEntradaNJuego().getText();
			String tipoJueg= gui.getJuego().getEntradaTipo().getText();
			
			System.out.println(nombre);
			System.out.println(tipoJueg);
			
			gestorJuego.getJuegos().add(new JuegoDTO(nombre, tipoJueg));
			
			gestorJuego.registrarJuego();
			
			gui.mostrarMensaje();
			
		}
		
	
		
	}

}
