package br.edu.infnet.comanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.comanda.model.negocio.Usuario;
import br.edu.infnet.comanda.model.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public String isValid(Usuario usuario) {
		boolean isValid = service.obterUsuario(usuario);
		if (isValid) {
			return "home";
		}
		return "login";
	}
		
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	public String obterLista(Model model) {
		model.addAttribute("usuariosLista", service.obterLista());
		return "usuario/lista";
	}
	
	@RequestMapping(value = "/usuario/incluir", method = RequestMethod.POST)
	public String incluir(Model model, Usuario usuario) {
		
		service.incluir(usuario);
		
		return this.obterLista(model);
	}
	
	@RequestMapping(value = "/usuario/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		
		service.excluir(id);
		
		return this.obterLista(model);
	}

	public UsuarioService getService() {
		return service;
	}

	public void setService(UsuarioService service) {
		this.service = service;
	}
}
