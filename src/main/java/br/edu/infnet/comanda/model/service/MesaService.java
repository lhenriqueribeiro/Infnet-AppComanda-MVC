package br.edu.infnet.comanda.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.comanda.model.negocio.Mesa;

@Service
public class MesaService {
	
	@Autowired
	private RestTemplate rest;
	
	@SuppressWarnings("unchecked")
	public List<Mesa> obterLista(){
		return (List<Mesa>)rest.getForObject("http://localhost:8080/api/mesa", List.class);
	}
	
	@SuppressWarnings("unchecked")
	public Optional<Mesa> obterPorId(Integer id) {
		return (Optional<Mesa>)rest.getForObject("http://localhost:8080/api/mesa", Optional.class);
	}
	
	public void incluir(Mesa mesa) {
		rest.postForEntity("http://localhost:8080/api/mesa", mesa, String.class);
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/mesa/{id}", id);
	}

	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}