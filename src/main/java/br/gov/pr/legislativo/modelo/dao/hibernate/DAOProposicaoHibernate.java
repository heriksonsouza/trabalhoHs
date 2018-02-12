package br.gov.pr.legislativo.modelo.dao.hibernate;

import java.io.Serializable;
import br.gov.pr.legislativo.entidades.Proposicao;
import br.gov.pr.legislativo.modelo.dao.DAOProposicao;

public class DAOProposicaoHibernate extends DAOGenericoHibernate<Proposicao> implements DAOProposicao,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOProposicaoHibernate(){
		super(Proposicao.class);
	}
}
