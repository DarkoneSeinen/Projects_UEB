package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.*;

import java.util.Random;

public class Composer {
	
	private int versos;
	private int estrofas;
	
	private String nombre;

	
	
	String[]nombres ={"mami","bebe","plincess","mami"};
	String[]verbos ={"yo quielo","yo puedo","vengo a","voy a"};
	String[]acciones ={"encendelte","amalte","ligal","jugal"};
	String[]adjetivo= {"suave","lento","lapido","fuelte"};
	String[]dia= {"hasta que salga el sol","toda la noche","hasta el amanecel","todo el dia"};
	String[]actitud= {"sin anestesia","sin complomiso","feis to feis","sin miedo."};
	
	public static int obtenerRandom(int rango) {
        Random random = new Random();
        return random.nextInt(rango);
    }
	
    public static String mostrarCancion(String[]nombres,String[]adjetivo, String[]verbos, String[]acciones,String[]dia, String[]actitud, int versos, int estrofas) {
		
    	
    	String reguetton ="";
    	
		for( int i =0;i<=(estrofas-1);i++) {//for para estrofas
		
		reguetton+="///////////////////////////////estrofa "+(i+1)+"////////////////////////////////////////"+"\n";
			
		for(int j=0;j<=(versos-1);j++) {// for para el versos
			
		int nombreRandom = obtenerRandom(nombres.length);
		int verboRandom = obtenerRandom(verbos.length);
		int accionRandom = obtenerRandom(acciones.length);
		int adjetivoRandom = obtenerRandom(adjetivo.length);
		int diaRandom = obtenerRandom(dia.length);
		int actitudRandom = obtenerRandom(actitud.length);
		
		String versoFinal=nombres[nombreRandom]+" "+verbos[verboRandom]+" "+acciones[accionRandom]+" "+adjetivo[adjetivoRandom]+" "+dia[diaRandom]+" "+actitud[actitudRandom]+"\n";
        reguetton+=versoFinal;
		
		}
	}
		return reguetton+"\n";
	
	
	}
    //////////////////////Properties/////////////////////////////////
    public String gestionarPropiedades() {
		Propiedades prop= new Propiedades();
		
		prop.escribirPropiedades(nombre, estrofas, estrofas);
		return"propiedades del proyecto: "+"\n"+prop.leerPropiedades();
		
	}
   
    
    ///////////////// file/////////////////////////////////////////////////
    
    FileInformation archivo=new FileInformation();
    
    public void crearArchivos() {
	
		archivo.setArchivoData("c:\\data\\"+nombre+".txt");
		archivo.escibirArchivo(mostrarCancion(nombres, adjetivo, verbos, acciones, dia, actitud, versos, estrofas));
	
     }
    
    public String obtenerArchivos() {
		String contenido = " ";
		
		 	archivo.setArchivoData("c:\\data\\"+nombre+".txt");
		 	contenido +=archivo.leerArchivo()+"\n";
		
		return contenido;
	}
    
  
    
    
    
    
	///////getters y setters/////

	public int getVersos() {
		return versos;
	}

	public void setVersos(int versos) {
		this.versos = versos;
	}

	public int getEstrofas() {
		return estrofas;
	}

	public void setEstrofas(int estrofas) {
		this.estrofas = estrofas;
	}

	public String[] getNombres() {
		return nombres;
	}

	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}

	public String[] getVerbos() {
		return verbos;
	}

	public void setVerbos(String[] verbos) {
		this.verbos = verbos;
	}

	public String[] getAcciones() {
		return acciones;
	}

	public void setAcciones(String[] acciones) {
		this.acciones = acciones;
	}

	public String[] getAdjetivo() {
		return adjetivo;
	}

	public void setAdjetivo(String[] adjetivo) {
		this.adjetivo = adjetivo;
	}

	public String[] getDia() {
		return dia;
	}

	public void setDia(String[] dia) {
		this.dia = dia;
	}

	public String[] getActitud() {
		return actitud;
	}

	public void setActitud(String[] actitud) {
		this.actitud = actitud;
	}
	public String getNombreArchivo() {
		return nombre;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombre = nombreArchivo;
	}
	

	
	


	
	
	
	
	
	
	
	
	
	
	

    


	
	
	
	
	
}
