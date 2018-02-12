package br.gov.pr.legislativo.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.gov.pr.legislativo.entidades.Proposicao;
import br.gov.pr.legislativo.modelo.servico.ServicoProposicao;

@Named
@SessionScoped
public class BeanProposicao implements Serializable {
	private static final long serialVersionUID = 1L;
	private Proposicao proposicao = new Proposicao();

	@Inject
	private ServicoProposicao servico;

	public Proposicao getProposicao() {
		return proposicao;
	}

	public void setProposicao(Proposicao proposicao) {
		this.proposicao = proposicao;
	}

	public String salvar() {
		servico.salvar(proposicao);
		return "index";

	}
}
