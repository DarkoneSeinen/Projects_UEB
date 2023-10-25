package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton btnjugador, btnjuego, btnpartida, btntorneo;
	
	private String jugador="JUGADOR";
	private String juego="JUEGO";
	private String partida="PARTIDA";
	private String torneo="Torneo";
	
	public PanelMenu() {
		setLayout(new GridLayout(2,2,10,10));
		
		btnjugador =new JButton(jugador);
		btnjugador.setActionCommand(jugador);
		
		btnjuego=new JButton(juego);
		btnjuego.setActionCommand(juego);
		
		btnpartida=new JButton(partida);
		btnpartida.setActionCommand(partida);
		
		btntorneo=new JButton(torneo);
		btntorneo.setActionCommand(torneo);
		
		add(btnjugador);
		add(btnjuego);
		add(btnpartida);
		add(btntorneo);
	}
	
	
	

}
