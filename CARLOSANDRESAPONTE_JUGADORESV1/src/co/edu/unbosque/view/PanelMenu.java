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
	
	public String JUGADOR="JUGADOR";
	private String JUEGO="JUEGO";
	private String PARTIDA="PARTIDA";
	private String TORNEO="TORNEO";
	
	public PanelMenu() {
		setLayout(new GridLayout(2,2,10,10));
		
		btnjugador =new JButton(JUGADOR);
		btnjugador.setActionCommand(JUGADOR);
		
		btnjuego=new JButton(JUEGO);
		btnjuego.setActionCommand(JUEGO);
		
		btnpartida=new JButton(PARTIDA);
		btnpartida.setActionCommand(PARTIDA);
		
		btntorneo=new JButton(TORNEO);
		btntorneo.setActionCommand(TORNEO);
		
		add(btnjugador);
		add(btnjuego);
		add(btnpartida);
		add(btntorneo);
	}

	public JButton getBtnjugador() {
		return btnjugador;
	}

	public void setBtnjugador(JButton btnjugador) {
		this.btnjugador = btnjugador;
	}

	public JButton getBtnjuego() {
		return btnjuego;
	}

	public void setBtnjuego(JButton btnjuego) {
		this.btnjuego = btnjuego;
	}

	public JButton getBtnpartida() {
		return btnpartida;
	}

	public void setBtnpartida(JButton btnpartida) {
		this.btnpartida = btnpartida;
	}

	public JButton getBtntorneo() {
		return btntorneo;
	}

	public void setBtntorneo(JButton btntorneo) {
		this.btntorneo = btntorneo;
	}

	public String getJugador() {
		return JUGADOR;
	}

	public void setJugador(String jugador) {
		this.JUGADOR = jugador;
	}

	public String getJuego() {
		return JUEGO;
	}

	public void setJuego(String juego) {
		this.JUEGO = juego;
	}

	public String getPartida() {
		return PARTIDA;
	}

	public void setPartida(String partida) {
		this.PARTIDA = partida;
	}

	public String getTorneo() {
		return TORNEO;
	}

	public void setTorneo(String torneo) {
		this.TORNEO = torneo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
