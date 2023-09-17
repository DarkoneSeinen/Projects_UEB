package co.edu.unbosque.model;

public class Andres extends Mortal {

	@Override
	public String aprender() {
		// TODO Auto-generated method stub
		return "Andres es un mortal, por lo que puede aduirir conocimiento";
	}

	@Override
	public String hacerFamilia() {
		// TODO Auto-generated method stub
		return "al ser mortal puede hacer una familia";
	}

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "al ser mortal puede ejercer cualquier profesion";
	}

	@Override
	public String verEdad() {
		// TODO Auto-generated method stub
		super.edad=18;
		try{
			if(super.edad<18) {
				throw new MiexcepcionNum("la edad de andres no menor a 18 años");
			}
			return "la edad de Andres es:"+super.edad+" años";
		}
			catch(MiexcepcionNum e) {
				return " ocurrio una excepcion";
			}
	}

	@Override
	public String medir() {
		// TODO Auto-generated method stub
		super.estaura=1.70;
		try {
			if (super.estaura>2.0) {
				throw new MiexcepcionDou("la estatura de andres no es mayor a 2 metros");
			}
			return "la estatura de Andres es: "+super.estaura+" metros";

		}catch(MiexcepcionDou e) {
			return "ocurrio una excepcion";
			
		}
	}

	@Override
	public String vercolor() {
		// TODO Auto-generated method stub
		super.ojos="violeta";
		try {
			if(super.ojos!="violeta") {
				throw new MiexcepcionString("los ojos de los mortales son violeta");
			}
		return "al ser mortal Andres posee ojos de color "+super.ojos;
		}catch(MiexcepcionString e) {
			return" ocurrio una excepcion";
		}
	}

	@Override
	public String veralma() {
		// TODO Auto-generated method stub
		super.alma="verdadera";
		return "el alma de Andres es: ";
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Andres al ser mortal habita el este del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "por ser mortal Andres solo puede sentir la presencia de otros mortales";
	}
	
	public String hacerHerencia() {
		return "el mortal se llama Andres trabaja por el planeta, "+this.verEdad()+" años,"+this.veralma()+"\n"+this.aprender()+"\n"+this.hacerFamilia()+"\n"+this.trabajar()+"\n"+this.vercolor()+
				", porque Kublakan penso que asi que reconoceria con los demas, "+"\n"+this.habitar()+", "+this.sentir();
	}
	

}
