package br.edu.ifpr.entidades;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import javax.persistence.*;

@Entity
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;   
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false)
	private Double saldo;
	@ManyToOne
	private Cliente cliente;
	

	public Conta() {
		super();
	} 
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}   
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int hashCode(){
		return cliente.getId();
	}
	
	public boolean equals(Object obj){
		Conta objetoAcomparar = (Conta) obj;
		if(objetoAcomparar.getId() != null && objetoAcomparar.getId() != 0 && objetoAcomparar.getId() == this.id)
			return true;
		else
			return false;
	}
   
}
