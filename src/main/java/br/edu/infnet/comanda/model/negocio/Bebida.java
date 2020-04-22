package br.edu.infnet.comanda.model.negocio;

public class Bebida extends Cardapio {

	private String nivel;
	private Cardapio cardapio;
	
	public Bebida() {
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s", super.toString(), this.getNivel());
	}
	
	public Bebida(String nivel) {
		this();
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public Cardapio getCardapio() {
		return cardapio;
	}
	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
}