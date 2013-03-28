package br.com.fikChik.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAB_ESTADO")
@SequenceGenerator(name = "seqAgenda", sequenceName="SEQ_ESTADO", allocationSize=1)
public class Estado implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_ESTADO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqEstado")
	private int cdEstado;
	
	@Column(name="DESCRICAO", nullable=false)
	private String descricao;
	
	@Column(name="SIGLA")
	private String sigla;

	synchronized int getCdEstado() {
		return cdEstado;
	}

	synchronized void setCdEstado(int cdEstado) {
		this.cdEstado = cdEstado;
	}

	synchronized String getDescricao() {
		return descricao;
	}

	synchronized void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	synchronized String getSigla() {
		return sigla;
	}

	synchronized void setSigla(String sigla) {
		this.sigla = sigla;
	}
}