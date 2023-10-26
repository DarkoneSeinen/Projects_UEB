package co.edu.unbosque.controller;

import java.awt.event.*;

import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View gui;

	public Controller() {
		
		gui = new View(this);
		gui.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if(evento.getActionCommand().equals(gui.getMenu().JUGADOR)) {
			gui.getJugador().setVisible(true);
			gui.getMenu().setVisible(false);

			
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
		
		
		
		
	}

}
