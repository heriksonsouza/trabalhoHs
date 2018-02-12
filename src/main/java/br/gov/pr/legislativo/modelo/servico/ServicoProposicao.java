package br.gov.pr.legislativo.modelo.servico;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import br.gov.pr.legislativo.entidades.Proposicao;
import br.gov.pr.legislativo.modelo.dao.DAOProposicao;
import br.gov.pr.legislativo.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoProposicao implements Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOProposicao dao;
	
	@Transacao
	public void salvar(Proposicao proposicao){
		
		try {
			validar(proposicao);
			if(proposicao.getIdProposicao() == null){
				dao.salvar(proposicao);
			}else{
				dao.alterar(proposicao);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<Proposicao> consultar(){
		return dao.consultar();
	}
	
	public void validar(Proposicao proposicao){
		try {
			if(proposicao.getResumo().isEmpty())
				throw new Exception("campo obrigatório!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
