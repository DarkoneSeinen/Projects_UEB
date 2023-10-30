package co.edu.unbosque.view;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VentanaJuego extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel nombreJuego, tipoJuego;
	private JTextField entradaNJuego, entradaTipo;
	private JButton agregar;
	
	public final String AGREGAR_JUEGO="AGREGAR_JUEGO";

	
	public VentanaJuego() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setResizable(false);
		setTitle("Juego");
		setLocationRelativeTo(null); 
		setLayout(new BorderLayout());
		
		setLayout(new GridLayout(3, 2));
		
		nombreJuego= new JLabel("Nombre del juego: ");
		entradaNJuego= new JTextField();
		
		tipoJuego= new JLabel("tipo de juego");
		entradaTipo= new JTextField();
		
		agregar= new JButton("AGREGAR_JUEGO");
		
		add(nombreJuego);
		add(entradaNJuego);
		add(tipoJuego);
		add(entradaTipo);
		
		add(agregar);
		
		agregar.setActionCommand(AGREGAR_JUEGO);
		
	}

	public JLabel getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(JLabel nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public JLabel getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(JLabel tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public JTextField getEntradaNJuego() {
		return entradaNJuego;
	}

	public void setEntradaNJuego(JTextField entradaNJuego) {
		this.entradaNJuego = entradaNJuego;
	}

	public JTextField getEntradaTipo() {
		return entradaTipo;
	}

	public void setEntradaTipo(JTextField entradaTipo) {
		this.entradaTipo = entradaTipo;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
