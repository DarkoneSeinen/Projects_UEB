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
	private PanelJugador jugador;
	
;

	public View(Controller control) {
		// TODO Auto-generated constructor stub
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setResizable(false);
		setTitle("Taller");
		setLocationRelativeTo(null); 
		setLayout(new BorderLayout());
		
		menu= new PanelMenu();
		
		add(menu,BorderLayout.CENTER);
		
		
		
	}

	public PanelMenu getMenu() {
		return menu;
	}

	public void setMenu(PanelMenu menu) {
		this.menu = menu;
	}

	public PanelJugador getJugador() {
		return jugador;
	}

	public void setJugador(PanelJugador jugador) {
		this.jugador = jugador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
