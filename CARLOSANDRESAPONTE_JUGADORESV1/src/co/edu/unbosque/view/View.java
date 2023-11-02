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
		jugador.getModificar().addActionListener(control);
		jugador.getBorrar().addActionListener(control);
		
		
		////juegos//////////////////////
		juego.getAgregar().addActionListener(control);
		juego.getModificar().addActionListener(control);
		juego.getBorrar().addActionListener(control);
		
		////partidas/////////////////////
		partida.getAgregar().addActionListener(control);
		partida.getModificar().addActionListener(control);
		partida.getBorrar().addActionListener(control);
	
		
		////torneo/////////////////////////////////
		torneo.getAgregar().addActionListener(control);
		torneo.getModificar().addActionListener(control);
		torneo.getBorrar().addActionListener(control);
	
		
		add(menu,BorderLayout.CENTER);
		
		
		
	}
	
	public void mostrarMensaje(String mensaje) {
		 JOptionPane.showMessageDialog(null,mensaje);
	}
	
	public int obtenerDocumento() {
		String entrada = JOptionPane.showInputDialog(null, "Digite el documento del jugador", "Documento", JOptionPane.QUESTION_MESSAGE);
		int documento = 0;
		try {
			documento = Integer.parseInt(entrada);
		} catch (NumberFormatException e) {
			mostrarMensaje("La entrada no es válida");
		}
		return documento;
	}
	
	public String obtenerNombreJuego() {
		String nombre = JOptionPane.showInputDialog(null, "Digite el nombre del juego");
		return nombre;
	}
	
	public int obtenerParida() {
		String entrada = JOptionPane.showInputDialog(null, "Digite la partida que desea buscar", "Partida", JOptionPane.QUESTION_MESSAGE);
		int partidaTorneo = 0;
		try {
			partidaTorneo = Integer.parseInt(entrada);
		} catch (NumberFormatException e) {
			mostrarMensaje("La entrada no es válida");
		}
		return partidaTorneo;
	}
	public String obtenerNombrePartida() {
		String nombre = JOptionPane.showInputDialog(null, "Digite el 1 nombre ingresado");
		return nombre;
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
