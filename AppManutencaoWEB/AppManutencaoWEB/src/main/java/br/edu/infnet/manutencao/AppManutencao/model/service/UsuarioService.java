package br.edu.infnet.manutencao.AppManutencao.model.service;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	public Boolean IsValid(String login, String senha) {		
		
		if(login.equalsIgnoreCase(senha))
			return true;
		
		return false;
		
	}
}
