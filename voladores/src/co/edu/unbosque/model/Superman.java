package co.edu.unbosque.model;

public class Superman extends Animal implements Volador{

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return " Superman come xd, y caga, ";
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
		return " superman puede volar";
	}

}
