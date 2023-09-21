package co.edu.unbosque.model;

public class Hidroplano extends Avion implements Velocidad{

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "un hidroplano puede despegar depsues de cierto tiempo en el agua, ";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "un hidriplano puede aterrizar en el agua con sus flotadores, ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "un hidroplano puede volar, ";
	}

	@Override
	public String verVelocidad() {
		// TODO Auto-generated method stub
		return "un hidroplano puede alcanzar 140 km/h en promedio";
	}

	@Override
	public String verMotor() {
		// TODO Auto-generated method stub
		return "un hidroplano tiene un motor resistente al agua. ";
	}

}
