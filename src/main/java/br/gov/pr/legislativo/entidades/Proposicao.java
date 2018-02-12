package br.gov.pr.legislativo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Proposicao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProposicao;
	@Column(nullable = false)
	private Integer numeroProposicao;
	private Integer numeroProjeto;
	@Column(nullable = false)
	private String resumo;
	private String observacao;
	@Column(length = 4)
	private Integer ano;

	@ManyToOne
	@JoinColumn(name = "idTipoProposicao")
	private TipoProposicao tipoProposicao;

	@ManyToOne
	@JoinColumn(name = "idAutor")
	private Autor autor;

	public Integer getIdProposicao() {
		return idProposicao;
	}

	public void setIdProposicao(Integer idProposicao) {
		this.idProposicao = idProposicao;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public TipoProposicao getTipoProposicao() {
		return tipoProposicao;
	}

	public void setTipoProposicao(TipoProposicao tipoProposicao) {
		this.tipoProposicao = tipoProposicao;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Integer getNumeroProposicao() {
		return numeroProposicao;
	}

	public void setNumeroProposicao(Integer numeroProposicao) {
		this.numeroProposicao = numeroProposicao;
	}

	public Integer getNumeroProjeto() {
		return numeroProjeto;
	}

	public void setNumeroProjeto(Integer numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}

}