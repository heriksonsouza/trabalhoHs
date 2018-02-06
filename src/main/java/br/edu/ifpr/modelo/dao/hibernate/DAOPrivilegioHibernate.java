package br.edu.ifpr.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.edu.ifpr.entidades.Privilegio;
import br.edu.ifpr.modelo.dao.DAOPrivilegio;

@Dependent
public class DAOPrivilegioHibernate extends DAOGenericoHibernate<Privilegio> implements DAOPrivilegio,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOPrivilegioHibernate(){
		super(Privilegio.class);
	}
}
