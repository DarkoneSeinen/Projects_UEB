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
