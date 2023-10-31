package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VentanaTorneo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel partida,ganador;
	private JTextField entradaPartida, EntradaGanador;
	private JButton agregar, modificar, borrar;
	
	public final String AGREGAR_TORNEO="AGREGAR_TORNEO";
	public final String MODIFICAR_TORNEO="MODIFICAR_TORNEO";
	public final String BORRAR_TORNEO="BORRAR_TORNEO";
	
	public VentanaTorneo(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setResizable(false);
		setTitle("Torneo");
		setLocationRelativeTo(null); 
		setLayout(new BorderLayout());
		
		setLayout(new GridLayout(4, 3));
		
		partida= new JLabel("Partida");
		entradaPartida= new JTextField();
		
		ganador = new JLabel("ganador");
		EntradaGanador=new JTextField();
		
		agregar=new JButton("AGREGAR_TORNEO");
		modificar= new JButton("MODIFICAR_TORNEO");
		borrar=new JButton("BORRAR_TORNEO");
		
		add(partida);
		add(entradaPartida);
		add(ganador);
		add(EntradaGanador);
		
		add(agregar);
		add(modificar);
		add(borrar);
		
		agregar.setActionCommand(AGREGAR_TORNEO);
		modificar.setActionCommand(MODIFICAR_TORNEO);
		borrar.setActionCommand(BORRAR_TORNEO);
	}

	public JLabel getPartida() {
		return partida;
	}

	public void setPartida(JLabel partida) {
		this.partida = partida;
	}

	public JLabel getGanador() {
		return ganador;
	}

	public void setGanador(JLabel ganador) {
		this.ganador = ganador;
	}

	public JTextField getEntradaPartida() {
		return entradaPartida;
	}

	public void setEntradaPartida(JTextField entradaPartida) {
		this.entradaPartida = entradaPartida;
	}

	public JTextField getEntradaGanador() {
		return EntradaGanador;
	}

	public void setEntradaGanador(JTextField entradaGanador) {
		EntradaGanador = entradaGanador;
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
