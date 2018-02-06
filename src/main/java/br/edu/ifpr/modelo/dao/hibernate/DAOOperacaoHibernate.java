package br.edu.ifpr.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.edu.ifpr.entidades.Operacao;
import br.edu.ifpr.modelo.dao.DAOOperacao;

@Dependent
public class DAOOperacaoHibernate extends DAOGenericoHibernate<Operacao> implements DAOOperacao,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOOperacaoHibernate(){
		super(Operacao.class);
	}
}
