package br.edu.ifpr.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.edu.ifpr.entidades.Cliente;
import br.edu.ifpr.modelo.dao.DAOCliente;

@Dependent
public class DAOClienteHibernate extends DAOGenericoHibernate<Cliente> implements DAOCliente,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOClienteHibernate(){
		super(Cliente.class);
	}
}
