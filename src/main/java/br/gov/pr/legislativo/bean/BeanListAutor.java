package br.gov.pr.legislativo.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.gov.pr.legislativo.entidades.Autor;
import br.gov.pr.legislativo.modelo.servico.ServicoAutor;

@Named
@ViewScoped
public class BeanListAutor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Autor autor = new Autor();
	@Inject
	private ServicoAutor servico;
	private List<Autor> lista;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
	}

	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public List<Autor> getLista() {
		return lista;
	}

	public void setLista(List<Autor> lista) {
		this.lista = lista;
	}

	public void excluir(){
		servico.excluir(autor.getIdAutor());
		lista = servico.consultar();
	}

	public void salvar(){
		servico.salvar(autor);
	}
}
