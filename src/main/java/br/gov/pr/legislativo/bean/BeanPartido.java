package br.gov.pr.legislativo.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.gov.pr.legislativo.entidades.Partido;
import br.gov.pr.legislativo.modelo.servico.ServicoPartido;

@Named
@SessionScoped
public class BeanPartido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Partido partido = new Partido();

	@Inject
	private ServicoPartido servico;

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public String salvar() {
		servico.salvar(partido);
		return "index";

	}
}
