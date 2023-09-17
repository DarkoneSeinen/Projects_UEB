package co.edu.unbosque.model;

public class Astar extends Heroes {

	@Override
	public String crearFuego() {
		// TODO Auto-generated method stub
		return "Astar puede crear fuego";
	}

	@Override
	public String detenerTiempo() {
		// TODO Auto-generated method stub
		return "Astar puede detener el tiempo";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Astar puede volar";
	}

	@Override
	public String verEdad() {
		// TODO Auto-generated method stub
		super.edad=45;
		try {
			if(super.edad<40) {
				throw new MiexcepcionNum("la edad de Astar supera los 40 años");
			}
			return "la edad de Astar es:"+super.edad+" años";

		}catch(MiexcepcionNum e) {
			
			return "ocurrio una excepcion";
		}
	}

	@Override
	public String medir() {
		// TODO Auto-generated method stub
		super.estaura=3.0;
		try {
			if(super.estaura<3.0) {
				throw new MiexcepcionDou("la estatura que dio KublaKan a los Heroes es 3 mestros");
			}
			return "la estatura de Astar es: "+super.estaura+" metros";

		}catch(MiexcepcionDou e) {
			return "ocuurrio una excepcion";
		}
	}

	@Override
	public String vercolor() {
		// TODO Auto-generated method stub
		super.ojos="rojo";
		try {
			if(super.ojos!="rojo") {
				throw new MiexcepcionString("el color de ojo es rojo");
			}
			return "el colo de ojos de Astar es: "+super.ojos;

		}catch(MiexcepcionString e){
			return" courrrio una excepcion";
			
		}
	}

	@Override
	public String veralma() {
		// TODO Auto-generated method stub
		super.alma="verdadera";
		try {
			if(super.alma!="verdadera") {
				throw new MiexcepcionString("el alma de Astar es verdadera");
			}
			return "el alma de Astar: "+super.alma;

		}catch(MiexcepcionString e){
			return" courrrio una excepcion";
		}
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Astar al ser heroe habita el norte del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Astar como heroe se sentia a si mismo y a seres de otros planetas";
	}
	
	public String hacerHerencia() {
		return "\nEl heroe se llama Astar, protege al planeta, "+this.verEdad()+"\n"+this.volar()+" , "+this.detenerTiempo()+" , "+this.crearFuego()
		+"\n "+this.medir()+"\n"+this.sentir()+"\n"+this.veralma();
	}
	
	

}
