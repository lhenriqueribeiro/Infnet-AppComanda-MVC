package br.edu.infnet.comanda.model.negocio;

import java.util.List;

public class Comanda {

	private Integer idComanda;
	private String descricao;
	private Mesa mesa;
	private List<Cardapio> cardapios;
    
	public Comanda() {
	}
	
	public Comanda(Integer id, String descricao) {
		this();
		this.idComanda = id;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s", 
				this.getIdComanda(), 
				this.getDescricao());
	}

	public Integer getIdComanda() {
		return idComanda;
	}
	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public List<Cardapio> getCardapios() {
		return cardapios;
	}
	public void setCardapios(List<Cardapio> cardapios) {
		this.cardapios = cardapios;
	}
}
