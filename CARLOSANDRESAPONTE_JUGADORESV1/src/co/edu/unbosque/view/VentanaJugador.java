package co.edu.unbosque.view;

import java.awt.*;

import javax.swing.*;

public class VentanaJugador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel documento, nombre, edad;
	private JTextField entradoc, entradanombre, entradaedad;
	private JButton Agregar, Modificar, Borrar;
	
	public final String AGREGAR_JUGADOR="AGREGAR";
	public final String MODIFICAR_JUGADOR="MODIFICAR";
	public final String BORRAR_JUGADOR="BORRAR";

	public VentanaJugador() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setResizable(false);
		setTitle("Jugador");
		setLocationRelativeTo(null); 
		setLayout(new BorderLayout());
		
		setLayout(new GridLayout(5, 3));
		
		documento= new JLabel("Documento");
		entradoc= new JTextField();
		
		nombre= new JLabel("nombre");
		entradanombre= new JTextField();
		
		edad= new JLabel("edad");
		entradaedad= new JTextField();
		
		Agregar= new JButton("AGREGAR");
		Modificar= new JButton("MODIFICAR");
		Borrar= new JButton("BORRAR");
		
		Agregar.setActionCommand(AGREGAR_JUGADOR);
		Modificar.setActionCommand(MODIFICAR_JUGADOR);
		Borrar.setActionCommand(BORRAR_JUGADOR);
		
		
		add(nombre);
		add(entradanombre);
		add(documento);
		add(entradoc);
		add(edad);
		add(entradaedad);
	
		add(Agregar);
		add(Modificar);
		add(Borrar);
		
		

		
	}

	public JLabel getDocumento() {
		return documento;
	}

	public void setDocumento(JLabel documento) {
		this.documento = documento;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JTextField getEntradoc() {
		return entradoc;
	}

	public void setEntradoc(JTextField entradoc) {
		this.entradoc = entradoc;
	}

	public JTextField getEntradanombre() {
		return entradanombre;
	}

	public void setEntradanombre(JTextField entradanombre) {
		this.entradanombre = entradanombre;
	}

	public JTextField getEntradaedad() {
		return entradaedad;
	}

	public void setEntradaedad(JTextField entradaedad) {
		this.entradaedad = entradaedad;
	}

	public JButton getAgregar() {
		return Agregar;
	}

	public void setAgregar(JButton agregar) {
		Agregar = agregar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAGREGAR() {
		return AGREGAR_JUGADOR;
	}

	public JButton getModificar() {
		return Modificar;
	}

	public void setModificar(JButton modificar) {
		Modificar = modificar;
	}

	public JButton getBorrar() {
		return Borrar;
	}

	public void setBorrar(JButton borrar) {
		Borrar = borrar;
	}
	
	
}
