package br.gov.pr.legislativo.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.gov.pr.legislativo.entidades.Autor;
import br.gov.pr.legislativo.modelo.dao.DAOAutor;

@Dependent
public class DAOAutorHibernate extends DAOGenericoHibernate<Autor> implements DAOAutor,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOAutorHibernate(){
		super(Autor.class);
	}
}
