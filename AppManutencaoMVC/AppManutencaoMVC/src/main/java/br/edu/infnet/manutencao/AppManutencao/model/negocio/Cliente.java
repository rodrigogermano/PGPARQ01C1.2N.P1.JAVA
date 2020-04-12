package br.edu.infnet.manutencao.AppManutencao.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TCliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	public Cliente() {}
	
	public Cliente(String nome, String endereco, String telefone, String email) {
		this();
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setEmail(email);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
	@Override
	public String toString() {	 
		return String.format("Cliente: $d - $s; Endereco: $s; Contato: (Tel = $s, Email = $s);", 
				this.getId(), 
				this.getNome(), 
				this.getEndereco(), 
				this.getTelefone(), 
				this.getEmail());
	}
	
	
}
