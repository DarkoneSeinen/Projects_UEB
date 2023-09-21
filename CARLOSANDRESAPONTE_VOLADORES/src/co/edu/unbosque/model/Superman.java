package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Volador, Velocidad{

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return " Superman come, ";
	}

	public String saltar() {
		return " Superman hace un super salto, ";
	}

	public String escudarBalas() {
		return " Superman es inmuen a las balas, ";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return " superman puede depsgar con un gran salto, ";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return " superman puede aterrizar con los pies, ";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return " superman puede volar, ";
	}

	@Override
	public String verMuerte() {
		// TODO Auto-generated method stub
		return "Superman puede morir por la kryptonita, " ;
	}

	@Override
	public String verVelocidad() {
		// TODO Auto-generated method stub
		return "Su perman puede alcanzar la velcidad del sonido.";
	}

}
