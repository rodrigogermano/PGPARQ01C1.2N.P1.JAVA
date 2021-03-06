package br.edu.infnet.manutencao.AppManutencao.model.negocio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TSolicitacao")
public class Solicitacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String equipe;
	private String placaDoCarro;
	private Integer turno;
	
	@OneToOne(
			fetch = FetchType.EAGER,
			cascade = CascadeType.DETACH
			)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	@OneToMany(
			mappedBy = "solicitacao",
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL
			)
	@JsonManagedReference
	private List<OrdemDeServico> ordensDeServico;
	
	
	public Solicitacao() {		
	}
	
	public Solicitacao(Integer id, String equipe, Cliente cliente) {
		this();
		setId(id);
		setEquipe(equipe);
		setCliente(cliente);
	}
	
	public Solicitacao(String equipe, String placaDoCarro, Cliente cliente, Integer turno) {
		this();		
		setEquipe(equipe);
		setCliente(cliente);
		setPlacaDoCarro(placaDoCarro);
		setTurno(turno);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	

	public List<OrdemDeServico> getOrdensDeServico() {
		return ordensDeServico;
	}

	public void setOrdensDeServico(List<OrdemDeServico> ordensDeServico) {
		this.ordensDeServico = ordensDeServico;
	}	

	public String getPlacaDoCarro() {
		return placaDoCarro;
	}

	public void setPlacaDoCarro(String placaDoCarro) {
		this.placaDoCarro = placaDoCarro;
	}

	
	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {	 
		return String.format("Solicitacao #%d - Equipe: %s", this.getId(), this.getEquipe());
	}
	
}
