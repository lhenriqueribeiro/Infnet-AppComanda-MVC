package br.edu.infnet.comanda.model.negocio;

import java.util.List;

public abstract class Cardapio {

	private Integer idCardapio;
	private String descricao;
    private List<Comanda> Comandas;
    
	public Cardapio() {
	}
	
	public Cardapio(Integer idCardapio, String descricao) {
		this();
		this.idCardapio = idCardapio;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s", this.getIdCardapio(), this.getDescricao());
	}
	
	public Integer getIdCardapio() {
		return idCardapio;
	}
	public void setIdCardapio(Integer idCardapio) {
		this.idCardapio = idCardapio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Comanda> getComandas() {
		return Comandas;
	}
	public void setComandas(List<Comanda> comandas) {
		Comandas = comandas;
	}

}