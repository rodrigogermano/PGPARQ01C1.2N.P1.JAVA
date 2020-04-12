package br.edu.infnet.manutencao.AppManutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.manutencao.AppManutencao.model.negocio.Cliente;
import br.edu.infnet.manutencao.AppManutencao.model.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	public String show(Model model) {
		
		return "cliente/novo";
	}
	
	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
	public String novo (
			Model model,
			Cliente cliente) {
		
		service.incluir(cliente);
				
		return  "redirect:home";
	}
	
}
