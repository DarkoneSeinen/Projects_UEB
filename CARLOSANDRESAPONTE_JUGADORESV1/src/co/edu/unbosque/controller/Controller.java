package co.edu.unbosque.controller;

import java.awt.event.*;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View gui;
	private JugadorDAO gestorJugador;
	private JuegoDAO gestorJuego;
	private PartidaDAO gestorPartida;
	private TorneoDAO gestorTorneo;

	public Controller() {
		
		gui = new View(this);
		gui.setVisible(true);
		
		gestorJugador= new JugadorDAO();
		gestorJuego= new JuegoDAO();
		gestorPartida= new PartidaDAO();
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		/////////////////////JUGADOR//////////////////////////////////////////
		if(evento.getActionCommand().equals(gui.getMenu().JUGADOR)) {
			gui.getJugador().setVisible(true);
			
			
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
		
		
		//////////////////////////////////JUEGO//////////////////////////////////
		if(evento.getActionCommand().equals(gui.getMenu().JUEGO)) {
			gui.getJuego().setVisible(true);
			gui.getMenu().setVisible(false);
			
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
		
		//////////////////////////////////////PARTIDAS//////////////////////////////////
		if(evento.getActionCommand().equals(gui.getMenu().PARTIDA)) {
			gui.getPartida().setVisible(true);
			gui.getMenu().setVisible(false);
		}
		
		if(evento.getActionCommand().equals(gui.getPartida().AGREGAR_PARTIDA)) {
			String nombre1=gui.getPartida().getEntradaj1().getText();
			String nombre2=gui.getPartida().getEntradaj2().getText();
			
			System.out.println(nombre1);
			System.out.println(nombre2);
			
			gestorPartida.getPartidas().add(new PartidaDTO(nombre1,nombre2));
			
			gestorPartida.registrarPartidas();;
			
		}
		
		
		/////////////////////////////////////TORNEO//////////////////////////////////
		
		if(evento.getActionCommand().equals(gui.getMenu().TORNEO)) {
			gui.getTorneo().setVisible(true);
			gui.getMenu().setVisible(false);

		}
		
		if(evento.getActionCommand().equals(gui.getTorneo().AGREGAR_TORNEO)) {
			String ganador=gui.getTorneo().getEntradaGanador().getText();
			int partida=Integer.parseInt(gui.getTorneo().getEntradaPartida().getText());
			
			System.out.println(ganador);
			System.out.println(partida);
			
			gestorTorneo.getTorneos().add(new TorneoDTO(ganador,partida));

			gestorTorneo.registrarTorneo();
		}
		
	
		
	}

}
