package br.gov.pr.legislativo.bean;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.gov.pr.legislativo.entidades.Partido;
import br.gov.pr.legislativo.modelo.servico.ServicoPartido;

@Named
@RequestScoped
public class BeanListPartido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Partido partido = new Partido();
	
	@Inject
	private ServicoPartido servico;
	private List<Partido> lista;

	@PostConstruct
	public void carregar() {
		lista = servico.consultar();
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public List<Partido> getLista() {
		return lista;
	}

	public void setLista(List<Partido> lista) {
		this.lista = lista;
	}

	public void excluir() {
		servico.excluir(partido.getIdPartido());
		lista = servico.consultar();

	}

	public void salvar() {
		servico.salvar(partido);
	}
}