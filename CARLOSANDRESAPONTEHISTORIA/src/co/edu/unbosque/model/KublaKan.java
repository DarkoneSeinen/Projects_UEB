package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected int edad;
	protected double estaura;
	protected String ojos;
	protected String alma;
	
	
	public abstract String verEdad();
	public abstract String medir();
	public abstract String vercolor();
	public abstract String veralma();
	public abstract String habitar();
	public abstract String sentir();
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstaura() {
		return estaura;
	}
	public void setEstaura(double estaura) {
		this.estaura = estaura;
	}
	public String getOjos() {
		return ojos;
	}
	public void setOjos(String ojos) {
		this.ojos = ojos;
	}
	public String getAlma() {
		return alma;
	}
	public void setAlma(String alma) {
		this.alma = alma;
	}


	
	

}
