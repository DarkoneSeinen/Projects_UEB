package co.edu.unbosque.model.persistence;

import java.io.*;

import co.edu.unbosque.model.Composer;


public class FileInformation  {
	
	
    private String archivoData="c://data//archivo.txt";
	
	public int escibirArchivo(String dato) {
		File f= new File(this.archivoData);
		
		try {
			FileWriter fw= new FileWriter(f);
			PrintWriter pw= new PrintWriter(fw);
			
			pw.println(dato);
			
			fw.close();// cerrar el archivo
			
		
		}catch(IOException e) {
			return -1;
		}
		return 0;
		
	}
	
	public String leerArchivo() {
		
		String linea="";
		String cadena="";
		
		File f= new File(this.archivoData);
		try {
			FileReader fr= new FileReader(f);//crea un flujo desde f
			BufferedReader br= new BufferedReader(fr);//permite la lectura
			linea=br.readLine();// toma el valor de la primera  linea
			
			while(linea!=null) {
				cadena+= linea+"\n";
				linea=br.readLine();
			}
			
			fr.close();
			
		}catch(IOException e) {
			 return null;
		}
		
		return cadena;
	}
///////////////////////////////////////////////////
	public String getArchivoData() {
		return archivoData;
	}

	public void setArchivoData(String archivoData) {
		this.archivoData = archivoData;
	}

	
	
	
}
