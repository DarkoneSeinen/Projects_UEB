package co.edu.unbosque.model;

public class Kira extends Heroes {

	@Override
	public String crearFuego() {
		return "Kira puede crear fuego";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String detenerTiempo() {
		return "kira puede detener el tiempo";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String volar() {
		return "Kira puede volar";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String medir() {
		// TODO Auto-generated method stub

		super.estaura=3.0;
		try {
			if(super.estaura<1) {
				throw new MiexcepcionDou(" no es la estatura de Kira");
			}
			return "la estatura de el heroe Kira es: "+super.estaura+" metros";

		}catch(MiexcepcionDou e) {
			return "ocurrio una excepcion";
			
		}
		
	}

	@Override
	public String vercolor() {
		super.ojos="azul";
		try {
			if(super.ojos!="azul") {
				throw new MiexcepcionString("el color de ojos es azul");
			}
			return "el colo de ojos de Kira es: "+super.ojos;

		}catch(MiexcepcionString e){
			return" courrrio una excepcion";
			
		}		// TODO Auto-generated method stub
		
	}

	@Override
	public String veralma() {
		super.alma="verdadera";
		try {
			if(super.alma!="verdadera") {
				throw new MiexcepcionString("el alma de Kira es verdadera");
			}
			return "el alma de Kira es: "+super.alma;

		}catch(MiexcepcionString e){
			return" courrrio una excepcion";
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public String habitar() {
		return "Kira al ser heroe habita el norte del planeta";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String sentir() {
		return "Kira como heroe se sentia a si mismo y a seres de otros planetas";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String verEdad() {
		// TODO Auto-generated method stub
		super.edad=23;
		try{
			if(super.edad<23) {
				throw new MiexcepcionNum("la edad de Kira no es menor a 23 años");
			}
			return "la edad de Kira es:"+super.edad+" años";
		}
			catch(MiexcepcionNum e) {
				return " ocurrio una excepcion";
			}
	}
	
	
	public String hacerHerencia() {
		return "\nEl heroe se llama kira, protege al planeta, "+this.verEdad()+"\n"+this.volar()+" , "+this.detenerTiempo()+" , "+this.crearFuego()
		+"\n "+this.medir()+"\n"+this.sentir()+", "+this.veralma()+", "+this.vercolor();
	}
	
	

}
