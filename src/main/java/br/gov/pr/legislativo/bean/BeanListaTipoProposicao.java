package br.gov.pr.legislativo.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.gov.pr.legislativo.entidades.TipoProposicao;
import br.gov.pr.legislativo.modelo.servico.ServicoTipoProposicao;

@Named
@RequestScoped
public class BeanListaTipoProposicao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private TipoProposicao tpproposicao = new TipoProposicao();
	@Inject
	private ServicoTipoProposicao servico;
	private List<TipoProposicao> lista;

	@PostConstruct
	public void carregar() {
		lista = servico.consultar();
	}

	public TipoProposicao getTipoProposicao() {
		return tpproposicao;
	}

	public void setTipoProposicao(TipoProposicao tpproposicao) {
		this.tpproposicao = tpproposicao;
	}

	public List<TipoProposicao> getLista() {
		return lista;
	}

	public void setLista(List<TipoProposicao> lista) {
		this.lista = lista;
	}

	public void excluir() {
		servico.excluir(tpproposicao.getIdTipoProposicao());
		lista = servico.consultar();
	}

	public void salvar() {
		servico.salvar(tpproposicao);
	}
}
