package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;


public class Propiedades {
	
	private Properties prop= new Properties();
	
	private String archivoprop="c://data//archivo.properties";
	
	public int escribirPropiedades(String nombre, int versos, int estrofas) {
		
		try {
			prop.setProperty("NombreProyecto","CARLOSANDRESAPONTE_COMPOSER");
			prop.setProperty("NombreArchivo",""+nombre+".properties");
			prop.setProperty("NumeroEstrofas",""+estrofas);
			prop.setProperty("NumeroVersos",""+versos);
			prop.store(new FileOutputStream(archivoprop),null);
			
		}catch(IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea="";
		try {
			prop.load(new FileInputStream(archivoprop));
			
			prop.list(System.out);
			
			linea+="nombre del poryecto: "+prop.getProperty("NombreProyecto")+"\n";
			linea+="nombre del archivo: "+prop.getProperty("NombreArchivo")+"\n";
			linea+="numero de versos: "+prop.getProperty("NumeroVersos")+"\n";	
			linea+="numero de estrofas: "+prop.getProperty("NumeroEstrofas")+"\n";


			
		}catch(IOException e) {
			return null;
			
		}
		return linea;
	}

}
