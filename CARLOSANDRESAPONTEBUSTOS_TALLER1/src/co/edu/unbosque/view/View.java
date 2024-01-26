package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public Menu menu;
	
	

	public View(Controller control) {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setResizable(false);
		
		setTitle("Taller de repaso");
		setLocationRelativeTo(null); 
		setLayout(new BorderLayout());
		
		

		
		
		
		
        menu= new Menu();
      
        
		menu.getBtncirculo().addActionListener(control);
		menu.getBtncuadrado().addActionListener(control);
		
		
		add(menu,BorderLayout.CENTER);

		
	}
	public int obtenerDiamentro() {
		try {
	        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el diamtero del circulo"));
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null," debe ser un numero");
	        return obtenerDiamentro(); 
	    }
		

	}
	
	public int obtenerLado() {
	    try {
	        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el lado del cuadrado"));
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Debe ser un número");
	        return obtenerLado(); 
	    }
	}


	
	public void mostrarMensaje(String mensaje) {
		 JOptionPane.showMessageDialog(null,mensaje);
	}


///////////////////////////////////////getter y settters//////////////////////////////////////////



	public Menu getMenu() {
		return menu;
	}



	public void setMenu(Menu menu) {
		this.menu = menu;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
