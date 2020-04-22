package br.edu.infnet.comanda.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.comanda.model.negocio.Bebida;

@Service
public class BebidaService {

	@Autowired
	private RestTemplate rest;
	
	@SuppressWarnings("unchecked")
	public List<Bebida> obterLista(){
		return (List<Bebida>)rest.getForObject("http://localhost:8080/api/bebida", List.class);
	}
	
	@SuppressWarnings("unchecked")
	public Optional<Bebida> obterPorId(Integer id) {
		return (Optional<Bebida>)rest.getForObject("http://localhost:8080/api/bebida", Optional.class);
	}
	
	public void incluir(Bebida bebida) {
		rest.postForEntity("http://localhost:8080/api/bebida", bebida, String.class);
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/bebida/{id}", id);
	}

	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
 