package co.edu.unbosque.model;

public class Ave extends Animal implements Volador, Velocidad{

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "un ave puede comer, ";
	}
	
	public String crearNido() {
		return " un ave puede crear su nido, ";
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
		return " un ave puede aterrizar con sus patas, ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return " un ave vuela con sus alas, ";
	}

	@Override
	public String verVelocidad() {
		// TODO Auto-generated method stub
		return "un ave puede alcanzar una velocidad 60 km/h em promedio.";
	}

}
