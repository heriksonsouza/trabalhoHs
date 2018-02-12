package br.gov.pr.legislativo.modelo.dao.hibernate;

import java.io.Serializable;
import br.gov.pr.legislativo.entidades.TipoProposicao;
import br.gov.pr.legislativo.modelo.dao.DAOTipoProposicao;

public class DAOTipoProposicaoHibernate extends DAOGenericoHibernate<TipoProposicao> implements DAOTipoProposicao, Serializable {
	private static final long serialVersionUID = 1L;

	public DAOTipoProposicaoHibernate(){
		super(TipoProposicao.class);
	}
}
