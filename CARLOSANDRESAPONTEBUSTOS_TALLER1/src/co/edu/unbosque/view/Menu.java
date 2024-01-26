package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Menu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JButton btncirculo, btncuadrado;
	
	public String CUADRADO="CUADRADO";
	public String CIRCULO="CIRCULO";
    JLabel texto = new JLabel("Elija una de las 2 figuras para hallar perimetro y area");

	
	
	public Menu() {
		
		setLayout(new GridLayout(3,1));
		TitledBorder border = BorderFactory.createTitledBorder("Bienvenido");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		btncirculo =new JButton(CIRCULO);
		btncirculo.setActionCommand(CIRCULO);
		
		btncuadrado =new JButton(CUADRADO);
		btncuadrado.setActionCommand(CUADRADO);
		
		add(texto);
		add(btncirculo);
		add(btncuadrado);
	}
	
	
    ////////////////////////////////////////////////getters y setters/////////////////////////////////////////////////////
	public JButton getBtncirculo() {
		return btncirculo;
	}

	public void setBtncirculo(JButton btncirculo) {
		this.btncirculo = btncirculo;
	}

	public JButton getBtncuadrado() {
		return btncuadrado;
	}

	public void setBtncuadrado(JButton btncuadrado) {
		this.btncuadrado = btncuadrado;
	}

	public String getCUADRADO() {
		return CUADRADO;
	}

	public void setCUADRADO(String cUADRADO) {
		CUADRADO = cUADRADO;
	}

	public String getCIRCULO() {
		return CIRCULO;
	}

	public void setCIRCULO(String cIRCULO) {
		CIRCULO = cIRCULO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
