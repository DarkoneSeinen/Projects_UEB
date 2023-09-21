package co.edu.unbosque.model;

public class Helicoptero extends Avion implements Velocidad {

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "un helicoptero puede despegar con sus helices";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "un helicoptero puede aterrixar en vertical, ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "un helicoptero puede volar con su helices";
	}

	@Override
	public String verMotor() {
		// TODO Auto-generated method stub
		return "un helicoptero tiene  un motor hecho para el";
	}

	@Override
	public String verVelocidad() {
		// TODO Auto-generated method stub
		return "un helicptero alcanza una velocidad de 278 k/h en promedio";
	}

}
