package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VentanaPartida extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jugador1, jugador2;
	private JTextField  entradaj1, entradaj2;
	private JButton agregar, modificar, borrar;
	
	public final String AGREGAR_PARTIDA="AGREGAR_PARTIDA";
	public final String MODIFICAR_PARTIDA="MODIFICAR_PARTIDA";
	public final String BORRAR_PARTIDA="BORRAR_PARTIDA";
	
	public VentanaPartida() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setResizable(false);
		setTitle("Partido");
		setLocationRelativeTo(null); 
		setLayout(new BorderLayout());
		
		setLayout(new GridLayout(4, 3));
		
		jugador1= new JLabel("Nombre del jugador 1: ");
		entradaj1= new JTextField();
		
		jugador2= new JLabel("Nombre del jugador 2:");
		entradaj2= new JTextField();
		
		agregar= new JButton("AGREGAR_PARTIDA");
		modificar= new JButton("MODIFICAR_PARTIDA");
		borrar=new JButton("BORRAR_PARTIDA");
		
		add(jugador1);
		add(entradaj1);
		add(jugador2);
		add(entradaj2);
		
		add(agregar);
		add(modificar);
		add(borrar);
		
		agregar.setActionCommand(AGREGAR_PARTIDA);
		modificar.setActionCommand(MODIFICAR_PARTIDA);
		borrar.setActionCommand(BORRAR_PARTIDA);
	}

	public JLabel getJugador1() {
		return jugador1;
	}

	public void setJugador1(JLabel jugador1) {
		this.jugador1 = jugador1;
	}

	public JLabel getJugador2() {
		return jugador2;
	}

	public void setJugador2(JLabel jugador2) {
		this.jugador2 = jugador2;
	}

	public JTextField getEntradaj1() {
		return entradaj1;
	}

	public void setEntradaj1(JTextField entradaj1) {
		this.entradaj1 = entradaj1;
	}

	public JTextField getEntradaj2() {
		return entradaj2;
	}

	public void setEntradaj2(JTextField entradaj2) {
		this.entradaj2 = entradaj2;
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

	public JButton getModificar() {
		return modificar;
	}

	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}

	public String getAGREGAR_PARTIDA() {
		return AGREGAR_PARTIDA;
	}

	public String getMODIFICAR_PARTIDA() {
		return MODIFICAR_PARTIDA;
	}

	public String getBORRAR_PARTIDA() {
		return BORRAR_PARTIDA;
	}
	
	
	

}
