package co.edu.unbosque.model;

public class Shazam extends Animal implements Velocidad, Volador  {

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Shazam puede comer ";
	}

	@Override
	public String verVelocidad() {
		// TODO Auto-generated method stub
		return "Shazam puede alcanzar grandes velocidades ";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "Shazam puede despegar con un gran salto";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Shazam puede aterrizar con sus pies";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "shazam puede volar ";
	}

	

}
