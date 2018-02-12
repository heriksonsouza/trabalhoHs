package br.gov.pr.legislativo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Partido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPartido")
	private Integer idPartido;
	@Column(nullable = false)
	private String siglaPartido;
	private String nome;
	public Integer getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(Integer idPartido) {
		this.idPartido = idPartido;
	}
	public String getSiglaPartido() {
		return siglaPartido;
	}
	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
