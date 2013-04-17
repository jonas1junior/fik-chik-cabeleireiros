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
@Table(name="CAB_CIDADE")
@SequenceGenerator(name="seqCidade", sequenceName="SEQ_CIDADE",allocationSize=1)
public class Cidade implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqCidade")
	@Column(name="CD_CIDADE")
	private int codigodCidade;
	
	@Column(name="DE_CIDADE",nullable=false,length=300)
	private String descricaoCidade;
	
	@Column(name="CD_ESTADO")
	private Estado codigoEstado;
	

	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cidade(int codigodCidade, String descricaoCidade, Estado codigoEstado) {
		super();
		this.codigodCidade = codigodCidade;
		this.descricaoCidade = descricaoCidade;
		this.codigoEstado = codigoEstado;
	}


	public int getCodigodCidade() {
		return codigodCidade;
	}


	public String getDescricaoCidade() {
		return descricaoCidade;
	}

	public void setDescricaoCidade(String descricaoCidade) {
		if(descricaoCidade.length() > 300){
			throw new IllegalArgumentException("Insira no máximo 300 Caracteres na Descrição da Cidade");
		}
		this.descricaoCidade = descricaoCidade;
	}

	public Estado getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(Estado codigoEstado) {
		this.codigoEstado = codigoEstado;
	}
	
	
	
}
