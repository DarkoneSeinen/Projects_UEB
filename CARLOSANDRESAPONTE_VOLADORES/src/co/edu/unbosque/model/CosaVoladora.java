package co.edu.unbosque.model;

public class CosaVoladora {
	
	Superman superman=new Superman();
	Shazam shazam= new Shazam();
	
	Ave ave=new Ave();
	
	JetMilitar jet=new JetMilitar();
	Hidroplano hidro= new Hidroplano();
	Helicoptero choper= new Helicoptero();
	
	public String mostrarSuperman() {
		return superman.comer()+"\n"+superman.escudarBalas()+"\n"+superman.saltar()+"\n"+superman.despegar()+"\n"+superman.aterrizar()+"\n"+
	           superman.volar()+"\n"+superman.verMuerte()+"\n"+superman.verVelocidad();
	}
	
	public String mostrarShazam() {
		return shazam.comer()+"\n"+shazam.verVelocidad()+"\n"+shazam.despegar()+"\n"+shazam.aterrizar()+"\n"+shazam.volar();
	}
	
	
	public String mostrarAve() {
		return ave.comer()+"\n"+ave.crearNido()+"\n"+ave.ponerHuevos()+"\n"+ave.despegar()+"\n"+ave.aterrizar()+"\n"+ave.volar()+"\n"+
	           ave.verVelocidad();
	}
	
	public String mostarJet() {
		return jet.despegar()+"\n"+jet.aterrizar()+"\n"+jet.volar()+"\n"+jet.verVelocidad()+"\n"+jet.verMotor();
	}
	
	public String mostrarHidroplano() {
		return hidro.despegar()+"\n"+hidro.aterrizar()+"\n"+hidro.volar()+"\n"+hidro.verVelocidad()+"\n"+hidro.verMotor();
	}
	
	public String mostarHelicoptero() {
		return choper.despegar()+"\n"+choper.aterrizar()+"\n"+choper.volar()+choper.verVelocidad()+"\n"+choper.verMotor();
	}
	
	
 



	

}
