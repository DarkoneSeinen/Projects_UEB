package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public int obtenerOpcion() {
		try {
	        return Integer.parseInt(JOptionPane.showInputDialog(null, "\n>>>>>>BIENVENIDO<<<<<<<< \ndigite uno de los seres \n1.Heroe. \n2.Mortal. \n3.Desterrado \n4.Salir"));
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, " Debe ingresar un número entero válido de 1 a 4.");
	        return obtenerOpcion(); 
	    }
	}
	
	public int seleccionarHeroe() {
		try {
		return Integer.parseInt(JOptionPane.showInputDialog(null,"\ndigite el heroe 1 heroe: \n1.Kira \n2.Astar"));
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "debes ingresar el numero del heroe");
			return seleccionarHeroe();
		}
	}
	
	
	public static void mostarHeroe(String hacerHerencia) {
		JOptionPane.showMessageDialog(null,hacerHerencia);
	}
	
	public static void mostarMortal(String hacerHerencia) {
		JOptionPane.showMessageDialog(null,hacerHerencia);
	}
	
	public static void mostarDest(String hacerHerencia) {
		JOptionPane.showMessageDialog(null,hacerHerencia);
	}
	
	public static void mostrarSalida() {
		JOptionPane.showMessageDialog(null, "gracias por usar el programa");;
	}
	

}
