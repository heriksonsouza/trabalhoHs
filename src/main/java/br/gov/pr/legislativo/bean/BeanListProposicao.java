package br.gov.pr.legislativo.bean;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.gov.pr.legislativo.entidades.Proposicao;
import br.gov.pr.legislativo.modelo.servico.ServicoProposicao;

@Named
@RequestScoped
public class BeanListProposicao implements Serializable {

	private static final long serialVersionUID = 1L;
	private Proposicao proposicao = new Proposicao();
	
	@Inject
	private ServicoProposicao servico;
	private List<Proposicao> lista;

	@PostConstruct
	public void carregar() {
		lista = servico.consultar();
	}

	public Proposicao getProposicao() {
		return proposicao;
	}

	public void setProposicao(Proposicao proposicao) {
		this.proposicao = proposicao;
	}

	public List<Proposicao> getLista() {
		return lista;
	}

	public void setLista(List<Proposicao> lista) {
		this.lista = lista;
	}

	public void excluir() {
		servico.excluir(proposicao.getIdProposicao());
		lista = servico.consultar();

	}

	public void salvar() {
		servico.salvar(proposicao);
	}
}
