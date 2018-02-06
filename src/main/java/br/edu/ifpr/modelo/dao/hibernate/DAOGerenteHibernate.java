package br.edu.ifpr.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.edu.ifpr.entidades.Gerente;
import br.edu.ifpr.modelo.dao.DAOGerente;

@Dependent
public class DAOGerenteHibernate extends DAOGenericoHibernate<Gerente> implements DAOGerente,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOGerenteHibernate(){
		super(Gerente.class);
	}
}
