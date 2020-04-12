package br.edu.infnet.manutencao.AppManutencao.viewmodel;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PreditivaViewModel {

	
	private Integer solicitacaoId;	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;
	private String engenheiro;
	private String tagEquipamento;
	private Boolean analiseDeVibracao;
	private Boolean ultrassom;
	private Boolean inspecaoVisual;
	
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
	public Boolean getAnaliseDeVibracao() {
		return analiseDeVibracao;
	}
	public void setAnaliseDeVibracao(Boolean analiseDeVibracao) {
		this.analiseDeVibracao = analiseDeVibracao;
	}
	public Boolean getUltrassom() {
		return ultrassom;
	}
	public void setUltrassom(Boolean ultrassom) {
		this.ultrassom = ultrassom;
	}
	public Boolean getInspecaoVisual() {
		return inspecaoVisual;
	}
	public void setInspecaoVisual(Boolean inspecaoVisual) {
		this.inspecaoVisual = inspecaoVisual;
	}
	
	
	
}
