package br.edu.infnet.manutencao.AppManutencao.viewmodel;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PreventivaViewModel {

	private Integer solicitacaoId;	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;
	private String engenheiro;
	private String tagEquipamento;
	private String tarefa;
	public Integer getSolicitacaoId() {
		return solicitacaoId;
	}
	public void setSolicitacaoId(Integer solicitacaoId) {
		this.solicitacaoId = solicitacaoId;
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
	public String getTagEquipamento() {
		return tagEquipamento;
	}
	public void setTagEquipamento(String tagEquipamento) {
		this.tagEquipamento = tagEquipamento;
	}
	public String getTarefa() {
		return tarefa;
	}
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	
	
}