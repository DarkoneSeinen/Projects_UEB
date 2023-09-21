package co.edu.unbosque.model;

public class JetMilitar extends Avion implements Velocidad{

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return "un jet militar puede depegar con sus propulsores";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "un jet militar puede aterrizar con sus ruedas";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "un jet puede volar";
	}

	@Override
	public String verVelocidad() {
		// TODO Auto-generated method stub
		return "un jet militar puede alcanzar 3000 km/h";
	}

	@Override
	public String verMotor() {
		// TODO Auto-generated method stub
		return "un jet militar tien un motor de ultima tecnologia";
	}
	
	

}
