package br.gov.pr.legislativo.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.gov.pr.legislativo.entidades.Administrador;
import br.gov.pr.legislativo.modelo.dao.DAOAdministrador;

@Dependent
public class DAOGerenteHibernate extends DAOGenericoHibernate<Administrador> implements DAOAdministrador,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOGerenteHibernate(){
		super(Administrador.class);
	}
}
