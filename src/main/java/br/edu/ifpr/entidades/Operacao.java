package br.edu.ifpr.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Operacao implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false)
	private Double valor;
	@Column(nullable=false)
	private String natureza;
	@ManyToOne
	private Conta conta;
	

	public Operacao() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public int hashCode(){
		return conta.getId();
	}
	
	public boolean equals(Object obj){
		Operacao objetoAcomparar = (Operacao) obj;
		if(objetoAcomparar.getId() != null && objetoAcomparar.getId() != 0 && objetoAcomparar.getId() == this.id)
			return true;
		else
			return false;
	}
}
