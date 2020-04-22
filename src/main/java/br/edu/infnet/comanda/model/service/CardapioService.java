package br.edu.infnet.comanda.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.comanda.model.negocio.Cardapio;

@Service
public class CardapioService {
	
	@Autowired
	private RestTemplate rest;
	
	@SuppressWarnings("unchecked")
	public List<Cardapio> obterLista(){
		return (List<Cardapio>)rest.getForObject("http://localhost:8080/api/cardapio", List.class);
	}
	
	@SuppressWarnings("unchecked")
	public Optional<Cardapio> obterPorId(Integer id) {
		return (Optional<Cardapio>)rest.getForObject("http://localhost:8080/api/cardapio", Optional.class);
	}
	
	public void incluir(Cardapio cardapio) {
		rest.postForEntity("http://localhost:8080/api/cardapio", cardapio, String.class);
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/cardapio/{id}", id);
	}

	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}