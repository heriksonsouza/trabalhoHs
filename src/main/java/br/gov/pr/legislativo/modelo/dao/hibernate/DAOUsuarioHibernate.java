package br.gov.pr.legislativo.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.gov.pr.legislativo.entidades.Autor;
import br.gov.pr.legislativo.modelo.dao.DAOUsuario;

@Dependent
public class DAOUsuarioHibernate extends DAOGenericoHibernate<Autor> implements DAOUsuario,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOUsuarioHibernate(){
		super(Autor.class);
	}
}
