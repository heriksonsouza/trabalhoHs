package br.edu.ifpr.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.edu.ifpr.entidades.Cliente;
import br.edu.ifpr.modelo.dao.DAOCliente;
import br.edu.ifpr.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoCliente implements Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOCliente dao;
	
	@Transacao
	public void salvar(Cliente cliente){
		
		try {
			validar(cliente);
			if(cliente.getId() == null){
				dao.salvar(cliente);
			}else{
				dao.alterar(cliente);
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
	
	public List<Cliente> consultar(){
		return dao.consultar();
	}
	
	public void validar(Cliente cliente){
		try {
			if(cliente.getNome().isEmpty())
				throw new Exception("campo obrigatório!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
