package br.edu.infnet.manutencao.AppManutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.manutencao.AppManutencao.model.negocio.Usuario;
import br.edu.infnet.manutencao.AppManutencao.model.service.UsuarioService;

@Controller
@SessionAttributes("user")
public class LoginController {
	
	@Autowired
	private UsuarioService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInit() {
		return this.showLogin();
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showHome(
			Model model,
			Usuario usuario
			) {
		
		
		if(service.IsValid(usuario.getLogin(), usuario.getPassword()))	{
			model.addAttribute("user", usuario.getLogin());
						
			return  "redirect:home";
		}
		else {			
			model.addAttribute("erro", "Usuário invalido!!!");
			return "login";			
		}
	}
	
}