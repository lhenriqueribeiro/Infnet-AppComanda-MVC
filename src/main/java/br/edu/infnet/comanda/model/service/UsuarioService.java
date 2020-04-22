package br.edu.infnet.comanda.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.comanda.model.negocio.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private RestTemplate rest;
	
	@SuppressWarnings("unchecked")
	public List<Usuario> obterLista(){
		return (List<Usuario>)rest.getForObject("http://localhost:8080/api/usuario", List.class);
	}
	
	public boolean obterUsuario(Usuario usuario) {
		return rest.postForEntity("http://localhost:8080/api/usuario/isvalid", usuario, Boolean.class).getBody();
	}
	
	public void incluir(Usuario usuario) {
		rest.postForEntity("http://localhost:8080/api/usuario", usuario, String.class);
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/usuario/{id}", id);
	}

	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}
 