package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;


public class Propiedades {
	
	private Properties prop= new Properties();
	
	private String archivoprop="c://data//archivo.properties";
	
	public int escribirPropiedades() {
		
		try {
			prop.setProperty("NombreProyecto","CARLLOSANDRESAPONTE_COMPOSER");
			prop.setProperty("NombreArchivo","CARLLOSANDRESAPONTE_COMPOSER.properties");
			prop.setProperty("NombreCodigoFuente","CARLOSANDRESAPONTE_COMPOSER.Java");
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
			linea+="nombre de la clase Java: "+prop.getProperty("NombreCodigoFuente")+"\n";


			
		}catch(IOException e) {
			return null;
			
		}
		return linea;
	}

}
