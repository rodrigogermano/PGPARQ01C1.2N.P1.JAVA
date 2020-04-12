package br.edu.infnet.manutencao.AppManutencao.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TCorretiva")
@PrimaryKeyJoinColumn(name = "idOrdemDeServico")
public class Corretiva extends OrdemDeServico {
	
	private Double codigoDoErro;
	
	public Corretiva() {
	}

	public Corretiva(Double codigoDoErro) {
		this();
		this.codigoDoErro = codigoDoErro;
	}

	public Double getCodigoDoErro() {
		return codigoDoErro;
	}

	public void setCodigoDoErro(Double codigoDoErro) {
		this.codigoDoErro = codigoDoErro;
	}
	
	@Override
	public String toString() {	
		return String.format("Tipo: Corretiva; Engenheiro: %s; Equipamento: %s; Erro: %f",
				this.getEngenheiro(),
				this.getTagEquipamento(),
				this.getCodigoDoErro());
	}
}
