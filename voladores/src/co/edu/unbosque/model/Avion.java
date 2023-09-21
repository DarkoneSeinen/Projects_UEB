package co.edu.unbosque.model;

public class Avion extends Vehiculo implements Volador {

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "un avion puede despegar, ";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return " un avion usa sus ruedas para aterrizar, ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return " un avion puede volar";
	}

	

	

}
