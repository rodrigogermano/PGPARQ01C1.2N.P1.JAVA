package br.edu.infnet.manutencao.AppManutencao.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.manutencao.AppManutencao.model.negocio.Cliente;
import br.edu.infnet.manutencao.AppManutencao.model.negocio.Solicitacao;


@Service
public class ClienteService {
	
	@Autowired
	private RestTemplate rest;
	
	
	public List<Cliente> obterLista(){
		return (List<Cliente>)rest.getForObject("http://localhost:8080/api/cliente", List.class);
	}	
	
	public Cliente obterPorId(Integer id) {
		return (Cliente)rest.getForObject("http://localhost:8080/api/cliente/" + id, Cliente.class);
	}	
		
	public void incluir(Cliente cliente) {
		rest.postForEntity("http://localhost:8080/api/cliente", cliente, String.class);
	}
	
	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/cliente/{id}", id);
	}
}