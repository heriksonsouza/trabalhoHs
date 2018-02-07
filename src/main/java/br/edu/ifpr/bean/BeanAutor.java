package br.edu.ifpr.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpr.entidades.Cliente;
import br.edu.ifpr.modelo.servico.ServicoCliente;

@Named
@SessionScoped
public class BeanCliente implements Serializable{
	private static final long serialVersionUID = 1L;
	private Cliente cliente = new Cliente();
	@Inject
	private ServicoCliente servico;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String savlar(){
		servico.salvar(cliente);
		return "index";

	}
}
