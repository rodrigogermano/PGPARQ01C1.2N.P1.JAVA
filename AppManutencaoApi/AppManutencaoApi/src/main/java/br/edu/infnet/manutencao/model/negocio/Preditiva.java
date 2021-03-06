package br.edu.infnet.manutencao.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TPreditiva")
@PrimaryKeyJoinColumn(name = "idOrdemDeServico")
public class Preditiva extends OrdemDeServico {
	
	private Boolean analiseDeVibracao;
	private Boolean ultrassom;
	private Boolean inspecaoVisual;
	
	public Preditiva() {
	}	
	
	public Preditiva(Boolean analiseDeVibracao, Boolean ultrassom, Boolean inspecaoVisual) {
		this();
		this.analiseDeVibracao = analiseDeVibracao;
		this.ultrassom = ultrassom;
		this.inspecaoVisual = inspecaoVisual;
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
	
	@Override
	public String toString() {	 
		return String.format("An�lise de vibra��o: %b, Ultrassom: %b e Inspe��o visual: %b", 
				this.getAnaliseDeVibracao(),
				this.getUltrassom(),
				this.getInspecaoVisual());	
	}
}
