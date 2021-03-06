package br.gov.pr.legislativo.entidades;

import java.io.Serializable;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;

@Entity
public class TipoProposicao implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoProposicao;
	@Column(nullable = false)
	private String nomeTipo;

	public Integer getIdTipoProposicao() {
		return idTipoProposicao;
	}

	public void setIdTipoProposicao(Integer idTipoProposicao) {
		this.idTipoProposicao = idTipoProposicao;
	}

	public String getNomeTipo() {
		return nomeTipo;
	}

	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}

}
