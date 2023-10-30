package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;

import co.edu.unbosque.model.JuegoDTO;
import co.edu.unbosque.model.JugadorDTO;

public class BinariosFile {
	
	private String ruta = "./data/jugadores.dat";
	private String rutaJuego = "./data/juego.dat";
	private String rutaPartida="./data/partidas.dat";
	private String rutaTorneo= "./data/torneos.dat";

	
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    
    public int registrarJugadores(ArrayList<JugadorDTO> jugador) {
    	
    	try {
    		oos= new ObjectOutputStream(new FileOutputStream(ruta));
    		oos.close();
    	}catch(IOException e){
    		return -1;
    		
    	}
    	
    	return 0;
    	
    }

    public ArrayList<JugadorDTO>leerJugadores(){
    	ArrayList<JugadorDTO> jugador = null;
    	
    	try {
    		ois = new ObjectInputStream(new FileInputStream(ruta));
    		jugador = (ArrayList<JugadorDTO>)ois.readObject();
    		ois.close();
    	}catch(ClassNotFoundException|IOException e) {
    		return null;
    		
    	}
    	return jugador;
    }
    
    //////////////////////////////////////////////////////////////////////////////
    public int registrarJuegos(ArrayList<JuegoDTO> juegos) {
    	
    	try {
    		oos= new ObjectOutputStream(new FileOutputStream(rutaJuego));
    		oos.close();
    	}catch(IOException e){
    		return -1;
    		
    	}
    	
    	return 0;
    	
    }
    
    public ArrayList<JuegoDTO>leerJuegos(){
    	ArrayList<JuegoDTO> juegos = null;
    	
    	try {
    		ois = new ObjectInputStream(new FileInputStream(ruta));
    		juegos = (ArrayList<JuegoDTO>)ois.readObject();
    		ois.close();
    	}catch(ClassNotFoundException|IOException e) {
    		return null;
    		
    	}
    	return juegos;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    
    


}
