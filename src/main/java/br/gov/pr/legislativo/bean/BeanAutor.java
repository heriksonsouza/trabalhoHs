package br.gov.pr.legislativo.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.gov.pr.legislativo.entidades.Autor;
import br.gov.pr.legislativo.modelo.servico.ServicoAutor;

@Named
@SessionScoped
public class BeanAutor implements Serializable{
	private static final long serialVersionUID = 1L;
	private Autor autor = new Autor();
	
	@Inject
	private ServicoAutor servico;
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String salvar(){
		servico.salvar(autor);
		return "index";

	}
}
