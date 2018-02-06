package br.edu.ifpr.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.edu.ifpr.entidades.Conta;
import br.edu.ifpr.modelo.dao.DAOConta;

@Dependent
public class DAOContaHibernate extends DAOGenericoHibernate<Conta> implements DAOConta,Serializable{

	private static final long serialVersionUID = 1L;
	
	public DAOContaHibernate(){
		super(Conta.class);
	}
}
