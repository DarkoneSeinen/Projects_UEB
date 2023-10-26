package co.edu.unbosque.view;
import java.awt.*;
import javax.swing.*;


import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelMenu menu;
	private VentanaJugador jugador;
	private VentanaJuego juego;
	private VentanaTorneo torneo;
	private VentanaPartida partida;
	
	public View(Controller control) {
		// TODO Auto-generated constructor stub
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setResizable(false);
		setTitle("Taller");
		setLocationRelativeTo(null); 
		setLayout(new BorderLayout());
		
		menu= new PanelMenu();
		
		menu.getBtnjugador().addActionListener(control);
		jugador = new VentanaJugador();
		
		menu.getBtnjuego().addActionListener(control);
		juego= new VentanaJuego();
		
		menu.getBtntorneo().addActionListener(control);
		torneo=new VentanaTorneo();
		
		menu.getBtnpartida().addActionListener(control);
		partida=new VentanaPartida();
		
		///jugador//////////////////
		jugador.getAgregar().addActionListener(control);
		
	
		
		add(menu,BorderLayout.CENTER);
		
		
		
	}

	public PanelMenu getMenu() {
		return menu;
	}

	public void setMenu(PanelMenu menu) {
		this.menu = menu;
	}

	public VentanaJugador getJugador() {
		return jugador;
	}

	public void setJugador(VentanaJugador jugador) {
		this.jugador = jugador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public VentanaJuego getJuego() {
		return juego;
	}

	public void setJuego(VentanaJuego juego) {
		this.juego = juego;
	}

	public VentanaTorneo getTorneo() {
		return torneo;
	}

	public void setTorneo(VentanaTorneo torneo) {
		this.torneo = torneo;
	}

	public VentanaPartida getPartida() {
		return partida;
	}

	public void setPartida(VentanaPartida partida) {
		this.partida = partida;
	}
	
	
	

}
