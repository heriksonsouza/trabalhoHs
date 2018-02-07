package br.gov.pr.legislativo.entidades;

import java.io.Serializable;
import javax.persistence.*;

import br.gov.pr.legislativo.entidades.Autor;


@Entity
public class Administrador extends Autor implements Serializable {
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Autor usuario;
	
	public Autor getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Autor usuario) {
		this.usuario = usuario;
	}
   
}
