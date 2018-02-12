package br.gov.pr.legislativo.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.gov.pr.legislativo.entidades.Partido;
import br.gov.pr.legislativo.modelo.dao.DAOPartido;
import br.gov.pr.legislativo.modelo.dao.hibernate.Transacao;

public class ServicoPartido implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOPartido dao;

	@Transacao
	public void salvar(Partido partido) {

		try {
			validar(partido);
			if (partido.getIdPartido() == null) {
				dao.salvar(partido);
			} else {
				dao.alterar(partido);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Transacao
	public boolean excluir(Integer id) {
		return dao.excluir(id);
	}

	public List<Partido> consultar() {
		return dao.consultar();
	}

	public void validar(Partido partido) {
		try {
			if (partido.getNome().isEmpty())
				throw new Exception("campo obrigatório!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}