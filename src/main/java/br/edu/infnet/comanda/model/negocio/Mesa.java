package br.edu.infnet.comanda.model.negocio;

public class Mesa {

	private Integer idMesa;
	private String descricao;
	
	public Mesa() {
	}
	public Mesa(Integer idMesa, String descricao) {
		this();
		this.idMesa = idMesa;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s", this.getIdMesa(), this.getDescricao());
	}
	

	public Integer getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}