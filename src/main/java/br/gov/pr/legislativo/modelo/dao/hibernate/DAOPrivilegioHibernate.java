package br.gov.pr.legislativo.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.gov.pr.legislativo.entidades.Privilegio;
import br.gov.pr.legislativo.modelo.dao.DAOPrivilegio;

@Dependent
public class DAOPrivilegioHibernate extends DAOGenericoHibernate<Privilegio> implements DAOPrivilegio,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOPrivilegioHibernate(){
		super(Privilegio.class);
	}
}
