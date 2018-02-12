package br.gov.pr.legislativo.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.gov.pr.legislativo.entidades.TipoProposicao;
import br.gov.pr.legislativo.modelo.servico.ServicoTipoProposicao;

@Named
@SessionScoped
public class BeanTipoProposicao implements Serializable {
	private static final long serialVersionUID = 1L;
	private TipoProposicao tpproposicao = new TipoProposicao();

	@Inject
	private ServicoTipoProposicao servico;

	public TipoProposicao getTipoProposicao() {
		return tpproposicao;
	}

	public void setTipoProposicao(TipoProposicao tpproposicao) {
		this.tpproposicao = tpproposicao;
	}

	public String salvar() {
		servico.salvar(tpproposicao);
		return "index";

	}
}