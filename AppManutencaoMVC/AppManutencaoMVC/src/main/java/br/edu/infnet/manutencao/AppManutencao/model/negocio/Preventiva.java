package br.edu.infnet.manutencao.AppManutencao.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TPreventiva")
@PrimaryKeyJoinColumn(name = "idOrdemDeServico")
public class Preventiva extends OrdemDeServico  {

	private String tarefa;
	
	public Preventiva() {		
	}

	public Preventiva(String tarefa) {
		this();
		this.tarefa = tarefa;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	
	@Override
	public String toString() {	 
		return String.format("Tipo: Preventiva; Engenheiro: %s; Equipamento: %s; Tarefa: %s",
				this.getEngenheiro(),
				this.getTagEquipamento(),
				this.getTarefa());
	}
	
}
