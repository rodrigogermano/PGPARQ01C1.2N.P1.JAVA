package br.edu.infnet.manutencao.AppManutencao.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.manutencao.AppManutencao.model.negocio.Solicitacao;

@Service
public class SolicitacaoService {
	
	@Autowired
	private RestTemplate rest;
	
	public List<Solicitacao> obterLista(){
		return (List<Solicitacao>)rest.getForObject("http://localhost:8080/api/solicitacao", List.class);
	}	
	
	public Solicitacao obterPorId(Integer id) {
		return (Solicitacao)rest.getForObject("http://localhost:8080/api/solicitacao/" + id, Solicitacao.class);
	}	
		
	public Solicitacao incluir(Solicitacao solicitacao) {
		return (Solicitacao)rest.postForEntity("http://localhost:8080/api/solicitacao", solicitacao, Solicitacao.class).getBody();
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/solicitacao/{id}", id);
	}
}