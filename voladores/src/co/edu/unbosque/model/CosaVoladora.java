package co.edu.unbosque.model;

public class CosaVoladora {
	
	Superman superman=new Superman();
	Avion avion=new Avion();
	Ave ave=new Ave();
	
	public String mostrarSuperman() {
		return superman.despegar()+superman.aterrizar()+superman.volar()+superman.escudarBalas()+superman.saltar()+superman.comer();
	}
	
	public String mostrarAvion() {
		return avion.despegar()+avion.aterrizar()+avion.volar();
	}
	
	public String mostrarAve() {
		return ave.despegar()+ave.aterrizar()+ ave.volar()+ave.crearNido()+ave.ponerHuevos()+ave.comer();
	}
 



	

}
