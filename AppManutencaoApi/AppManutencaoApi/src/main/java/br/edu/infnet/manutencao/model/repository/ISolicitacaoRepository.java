package br.edu.infnet.manutencao.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.manutencao.model.negocio.Solicitacao;

@Repository
public interface ISolicitacaoRepository extends CrudRepository<Solicitacao, Integer> {

}
