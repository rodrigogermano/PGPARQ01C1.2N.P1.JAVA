package br.edu.infnet.manutencao.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.infnet.manutencao.model.negocio.Solicitacao;
import br.edu.infnet.manutencao.model.service.SolicitacaoService;

@RestController
@RequestMapping("/api/solicitacao")
public class SolicitacaoController {
	
	@Autowired
	private SolicitacaoService service;	

	@GetMapping 
	public List<Solicitacao> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Solicitacao> obterPorId(@PathVariable Integer id) throws JsonProcessingException {		
		

		Solicitacao s = service.obterPorId(id).get();
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(s);
		
		System.out.println(json);
		
		return service.obterPorId(id); 
	}	
	
	@PostMapping
	public Solicitacao incluir(@RequestBody Solicitacao solicitacao) {
		
		service.incluir(solicitacao);
		
		return solicitacao;
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}
	
}
