package br.edu.ifpr.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.edu.ifpr.entidades.Usuario;
import br.edu.ifpr.modelo.dao.DAOUsuario;

@Dependent
public class DAOUsuarioHibernate extends DAOGenericoHibernate<Usuario> implements DAOUsuario,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOUsuarioHibernate(){
		super(Usuario.class);
	}
}
