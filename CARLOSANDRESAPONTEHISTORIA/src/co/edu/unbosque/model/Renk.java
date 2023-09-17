package co.edu.unbosque.model;

public class Renk extends Desterrado {

	@Override
	public String arrastrar() {
		return "se arrastra de un lugar a otro";
		// TODO Auto-generated method stub
	}

	@Override
	public String verEdad() {
		// TODO Auto-generated method stub
		super.edad=56;
		try{
			if(super.edad>1500) {
				throw new MiexcepcionNum("la edad de Renk no es mayor a 56 años");
			}
			return "la edad de Renk es:"+super.edad+" años";
		}
			catch(MiexcepcionNum e) {
				return " ocurrio una excepcion";
			}
	}	

	@Override
	public String medir() {
		// TODO Auto-generated method stub
		super.estaura=67.9;
		try {
			if(super.estaura<1) {
				throw new MiexcepcionDou(" no es la estatura de Renk");
			}
			return "la estaura de Renk es: "+super.estaura+" metros";

		}catch(MiexcepcionDou e) {
			return "ocurrio una excepcion";
			
		}
	}

	@Override
	public String vercolor() {
		// TODO Auto-generated method stub
		super.ojos="verde";
		try {
			if(super.ojos!="verde") {
				throw new MiexcepcionString("el color de ojos es azul");
			}
			return "el color de ojos de Renk es: "+super.ojos;

		}catch(MiexcepcionString e){
			return" courrrio una excepcion";
			
		}	
	}

	@Override
	public String veralma() {
		// TODO Auto-generated method stub
		super.alma="falsa";
		try {
			if(super.alma!="falsa") {
				throw new MiexcepcionString("el alma de Renk es falsa(no autentica)");
			}
			return "el es rechazado por Kublakan por lo tanto su alma es "+super.alma+"(no autentica)";

		}catch(MiexcepcionString e){
			return" courrrio una excepcion";
			
		}
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "habita el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "no siente a nadie, solo a si mismo";
	}
	
	@Override
	public String vivir() {
		// TODO Auto-generated method stub
		return " al ser un desterrado vive exactamente 1500 años";
	}
	
	public String hacerHerencia() {
		return "Renk es una de los seres mas tristes, "+this.veralma()+"\n"+this.habitar()+this.sentir()+"\n"+this.verEdad()+", "+this.medir()+"\n"+this.vercolor()+this.vivir();
	}

}
