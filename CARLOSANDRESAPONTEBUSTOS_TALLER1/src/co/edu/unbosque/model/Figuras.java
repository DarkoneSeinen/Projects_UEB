package co.edu.unbosque.model;

public class Figuras implements Circulo,Cuadrado{
	
	private double diametro;
	private double lado;

	@Override
	public double calcularareaC() {
		// TODO Auto-generated method stub
		
		return lado*lado;
	}

	@Override
	public double calcularperimetroC() {
		// TODO Auto-generated method stub
		return lado*4;
	}

	@Override
	public double calcularareaCirc() {
		// TODO Auto-generated method stub
		
		double radio= diametro/2;
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public double calcularperimetroCirc() {
		// TODO Auto-generated method stub
		return diametro*Math.PI;
	}

	//////////////////////////////////////////////////////////////////////////////////
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	

	
	
	
}
