package br.edu.infnet.manutencao.AppManutencao.model.negocio;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Corretiva.class, name = "Corretiva"),
        @JsonSubTypes.Type(value = Preditiva.class, name = "Preditiva"),
        @JsonSubTypes.Type(value = Preventiva.class, name = "Preventiva")})
public abstract class OrdemDeServico {
	
	private Integer id;
	private Date data;
	private String engenheiro;
	private String tagEquipamento;
		
	@JsonBackReference
	private Solicitacao solicitacao;
	
	public OrdemDeServico() {		
	}
	
	public OrdemDeServico(Date data, String engenheiro, Solicitacao solicitacao, String tagEquipamento) {
		this();
		this.setData(data);
		this.setEngenheiro(engenheiro);
		this.setSolicitacao(solicitacao);
		this.setTagEquipamento(tagEquipamento);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}

	public String getEngenheiro() {
		return engenheiro;
	}
	
	public void setEngenheiro(String engenheiro) {
		this.engenheiro = engenheiro;
	}
	

	public Solicitacao getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}
	
	

	public String getTagEquipamento() {
		return tagEquipamento;
	}

	public void setTagEquipamento(String tagEquipamento) {
		this.tagEquipamento = tagEquipamento;
	}

	@Override
	public String toString() {	 
		return String.format("Ordem $d referente ao equipamento: %s", this.getId(), this.getTagEquipamento());	
	}
	
}
