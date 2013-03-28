package br.com.fikChik.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAB_CIDADE")
@SequenceGenerator(name="seqCidade", sequenceName="SEQ_CIDADE",allocationSize=1)
public class Cidade implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="CD_CIDADE")
	private int cdCidade;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Column(name="CD_ESTADO")
	private Estado cdEstado;
	
	
	synchronized int getCdCidade() {
		return cdCidade;
	}
	synchronized void setCdCidade(int cdCidade) {
		this.cdCidade = cdCidade;
	}
	synchronized String getDescricao() {
		return descricao;
	}
	synchronized void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	synchronized Estado getCdEstado() {
		return cdEstado;
	}
	synchronized void setCdEstado(Estado cdEstado) {
		this.cdEstado = cdEstado;
	}
}
