package br.edu.infnet.manutencao.AppManutencao.model.negocio;


public class Usuario {

	private Integer id;
	private String nome;
	private String login;
	private String password;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String login, String password) {
		this();		
		this.nome = nome;
		this.login = login;
		this.password = password;
	}
	
	public Usuario(Integer id, String nome, String login, String password) {
		this();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.password = password;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return String.format("d% - %s", this.getId(), this.getNome());
	} 
	
	
}