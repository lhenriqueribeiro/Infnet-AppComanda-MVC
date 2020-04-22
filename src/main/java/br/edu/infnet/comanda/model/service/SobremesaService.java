package br.edu.infnet.comanda.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.comanda.model.negocio.Sobremesa;

@Service
public class SobremesaService {
	
	@Autowired
	private RestTemplate rest;
	
	@SuppressWarnings("unchecked")
	public List<Sobremesa> obterLista(){
		return (List<Sobremesa>)rest.getForObject("http://localhost:8080/api/sobremesa", List.class);
	}
	
	@SuppressWarnings("unchecked")
	public Optional<Sobremesa> obterPorId(Integer id) {
		return (Optional<Sobremesa>)rest.getForObject("http://localhost:8080/api/sobremesa", Optional.class);
	}
	
	public void incluir(Sobremesa sobremesa) {
		rest.postForEntity("http://localhost:8080/api/sobremesa", sobremesa, String.class);
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/petisco/{id}", id);
	}

	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}