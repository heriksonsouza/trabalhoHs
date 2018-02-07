package br.edu.ifpr.entidades;

import br.edu.ifpr.entidades.Pessoa;
import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Gerente extends Pessoa implements Serializable {
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
