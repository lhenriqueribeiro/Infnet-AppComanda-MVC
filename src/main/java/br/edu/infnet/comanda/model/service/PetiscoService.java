package br.edu.infnet.comanda.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.comanda.model.negocio.Petisco;

@Service
public class PetiscoService {
	
	@Autowired
	private RestTemplate rest;
	
	@SuppressWarnings("unchecked")
	public List<Petisco> obterLista(){
		return (List<Petisco>)rest.getForObject("http://localhost:8080/api/petisco", List.class);
	}
	
	@SuppressWarnings("unchecked")
	public Optional<Petisco> obterPorId(Integer id) {
		return (Optional<Petisco>)rest.getForObject("http://localhost:8080/api/petisco", Optional.class);
	}
	
	public void incluir(Petisco petisco) {
		rest.postForEntity("http://localhost:8080/api/petisco", petisco, String.class);
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