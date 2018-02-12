package br.gov.pr.legislativo.modelo.servico;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import br.gov.pr.legislativo.entidades.TipoProposicao;
import br.gov.pr.legislativo.modelo.dao.DAOTipoProposicao;
import br.gov.pr.legislativo.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoTipoProposicao {

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOTipoProposicao dao;
	
	@Transacao
	public void salvar(TipoProposicao tpproposicao){
		
		try {
			validar(tpproposicao);
			if(tpproposicao.getIdTipoProposicao() == null){
				dao.salvar(tpproposicao);
			}else{
				dao.alterar(tpproposicao);
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
	
	public List<TipoProposicao> consultar(){
		return dao.consultar();
	}
	
	public void validar(TipoProposicao tpproposicao){
		try {
			if(tpproposicao.getNomeTipo().isEmpty())
				throw new Exception("campo obrigatório!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}