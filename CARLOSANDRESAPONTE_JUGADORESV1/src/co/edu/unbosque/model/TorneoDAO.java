package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class TorneoDAO {
	
	private ArrayList<TorneoDTO> torneos;
	
	private BinariosFile bf;

	 public TorneoDAO() {
			
			torneos= new ArrayList<TorneoDTO> ();
			bf= new BinariosFile();

		}
	    
		public void agregarTorneo(TorneoDTO torneo) {
			torneos.add(torneo);
		}
		
		public void obtenerTorneo() {
			torneos= bf.leerTorneos();
		}
		
		public void registrarTorneo() {
			bf.registrarTorneos(torneos);
		}

		public ArrayList<TorneoDTO> getTorneos() {
			return torneos;
		}

		public void setTorneos(ArrayList<TorneoDTO> torneos) {
			this.torneos = torneos;
		}

		public BinariosFile getBf() {
			return bf;
		}

		public void setBf(BinariosFile bf) {
			this.bf = bf;
		}
		
		

}
