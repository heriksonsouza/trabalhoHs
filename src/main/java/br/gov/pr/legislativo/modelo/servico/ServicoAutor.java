package br.gov.pr.legislativo.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import br.gov.pr.legislativo.entidades.Autor;
import br.gov.pr.legislativo.modelo.dao.DAOAutor;
import br.gov.pr.legislativo.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoAutor implements Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOAutor dao;
	
	@Transacao
	public void salvar(Autor autor){
		
		try {
			validar(autor);
			if(autor.getIdAutor() == null){
				dao.salvar(autor);
			}else{
				dao.alterar(autor);
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
	
	public List<Autor> consultar(){
		return dao.consultar();
	}
	
	public void validar(Autor autor){
		try {
			if(autor.getNome().isEmpty())
				throw new Exception("campo obrigatório!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
