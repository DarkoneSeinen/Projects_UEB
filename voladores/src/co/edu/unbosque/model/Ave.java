package co.edu.unbosque.model;

public class Ave extends Animal implements Volador{

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "un ave puede comer, ";
	}
	
	public String crearNido() {
		return " un ave puede cerar su nido, ";
	}

	public String ponerHuevos() {
		return " un ave puede poner huevos, ";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return " un ave puede despegar, ";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return " un ave puede aterizar con sus patas, ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return " un ave vuela con sus alas";
	}

}
