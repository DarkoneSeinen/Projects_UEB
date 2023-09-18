package co.edu.unbosque.view;

import javax.swing.*;
import java.io.*;

public class View {
	public int obtenerOpcion() {
		try {
	        return Integer.parseInt(JOptionPane.showInputDialog(null, "\n>>>>>>>>>>>BIENVENIDO<<<<<<<<<<<<<<<< \ndigite una de las opciones \n1.Digita el numero de versos y estrofas de la cancion. \n2.Crear cancion. \n3.Seleccionar cancion. \n4.Salir"));
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, " Debe ingresar un número entero válido de 1 a 4.");
	        return obtenerOpcion(); 
	    }
	}
	
	public int obtenerN_versos() {
		try {
	        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de versos a crear en cada estrofa"));
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, " Debe ingresar un numero entero");
	        return obtenerOpcion(); 
	    }
	}
	
	public int obtenerN_estrofas() {
		try {
	        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de estrofas a crear"));
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero");
	        return obtenerOpcion(); 
	    }
	}
	
	
	public String obtenerNombreArchivo() {
		return JOptionPane.showInputDialog(null, "Digite el nombre que desea ponerle al archivo"); 
	}
	
	public static void mostrarCancion(String mostrarCancion) {
		JOptionPane.showMessageDialog(null,"tu cancion es: \n"+mostrarCancion+"\n"+">>>>>>>>>tu cancion ha diso guardada en C://data<<<<<<<<<<<");
	}
	
	public static void mostarSalida() {
		JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
	}
	
	///////////////////////////////////JFileChooser///////////////////////////
	
	private JFileChooser fileChooser;

    public View() {
        fileChooser = new JFileChooser();
    }

    public void mostrarSeleccionArchivo() {
    	int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                // Leer el contenido del archivo
                BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                StringBuilder fileContent = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    fileContent.append(line).append("\n");
                }
                reader.close();

                // Mostrar el contenido del archivo en un JOptionPane
                JOptionPane.showMessageDialog(null, "Contenido del archivo:\n" + fileContent.toString());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
	

    
	
	
}
