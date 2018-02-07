package br.edu.ifpr.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false, columnDefinition="CHAR(14)", unique=true)
	private String cpf;
	

	public Pessoa() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int hashCode(){
		return this.nome.charAt(0);
	}
	
	public boolean equals(Object obj){
		Pessoa clienteAcomparar = (Pessoa) obj;
		if(clienteAcomparar.getId() != null && clienteAcomparar.getId() != 0 && clienteAcomparar.getId() == this.id)
			return true;
		else
			return false;
	}
   
}
