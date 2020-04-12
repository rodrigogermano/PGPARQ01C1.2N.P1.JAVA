package br.edu.infnet.manutencao.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.manutencao.model.negocio.Solicitacao;
import br.edu.infnet.manutencao.model.repository.ISolicitacaoRepository;

@Service
public class SolicitacaoService {
	
	@Autowired
	private ISolicitacaoRepository repository;
	
	public List<Solicitacao> obterLista(){
		return (List<Solicitacao>)repository.findAll();
	}	
	
	public Optional<Solicitacao> obterPorId(Integer id) {
		return repository.findById(id);
	}	
		
	public void incluir(Solicitacao solicitacao) {
		repository.save(solicitacao);		
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
