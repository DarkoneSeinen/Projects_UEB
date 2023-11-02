package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class PartidaDAO {
	
	private ArrayList<PartidaDTO> partidas;
	
	private BinariosFile bf;

    public PartidaDAO() {
		
		partidas= new ArrayList<PartidaDTO> ();
		bf= new BinariosFile();

	}
    public String toString() {
		String partidasActuales = "";
		for (int i = 0; i < partidas.size(); i++) {
			partidasActuales += "Juego " + (i+1) + "\n";
			partidasActuales += "Nombre 1: " + partidas.get(i).getNombre1() + "\n";
			partidasActuales += "Nombre 2: " +  partidas.get(i).getNombre2() + "\n";
		}
		if (partidasActuales.equals("")) {
			partidasActuales += "No se han registrado partidas hasta ahora\n";
		}
		return partidasActuales;
	}
    
    public int obtenerIndicePartidaAModificar(String nombre ) {
		for (int i = 0; i < partidas.size(); i++) {
			if (partidas.get(i).getNombre1().equals(nombre)) {
				return i;
			}
		}
		return -1;
	}
    
    public void modificarPartida(int indice,PartidaDTO partida) {
		partidas.set(indice, partida);
	}
    
    public PartidaDTO revisarPartida(String nombre) {
		for (int i = 0; i < partidas.size(); i++) {
			if (partidas.get(i).getNombre1().equals(nombre)) {
				return partidas.get(i);
			}
		}
		return null;
	}
    
	public void borrarPartida(int indice) {
		partidas.remove(indice);
	}
	public void agregarPartida(PartidaDTO partida) {
		partidas.add(partida);
	}
	
	public void obtenerPartida() {
		partidas= bf.leerPartidas();
	}
	
	public void registrarPartidas() {
		bf.registrarPartidas(partidas);
	}

	public ArrayList<PartidaDTO> getPartidas() {
		return partidas;
	}

	public void setPartidas(ArrayList<PartidaDTO> partidas) {
		this.partidas = partidas;
	}

	public BinariosFile getBf() {
		return bf;
	}

	public void setBf(BinariosFile bf) {
		this.bf = bf;
	}
	
	
	



}
