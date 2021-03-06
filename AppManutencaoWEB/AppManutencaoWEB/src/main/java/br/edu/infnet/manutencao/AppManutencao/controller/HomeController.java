package br.edu.infnet.manutencao.AppManutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.manutencao.AppManutencao.model.service.SolicitacaoService;

@Controller
@SessionAttributes("user")
public class HomeController {
	
	@Autowired
	private SolicitacaoService service;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String show(Model model) {		
		
		model.addAttribute("solicitacaoLista", service.obterLista());
		
		return "home";
	}
	
}
