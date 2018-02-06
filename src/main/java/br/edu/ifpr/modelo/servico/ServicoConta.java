package br.edu.ifpr.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.edu.ifpr.entidades.Conta;
import br.edu.ifpr.modelo.dao.DAOConta;
import br.edu.ifpr.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoConta implements Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOConta dao;
	
	@Transacao
	public void salvar(Conta conta){
		
		try {
			dao.salvar(conta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Conta> consultar(){
		return dao.consultar();
	}
}
