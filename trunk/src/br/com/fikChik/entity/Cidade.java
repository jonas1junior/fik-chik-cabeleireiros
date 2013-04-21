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
	private int codigoCidade;
	
	@Column(name="DS_CIDADE",nullable=false,length=300)
	private String descricaoCidade;
	
	@Column(name="CD_ESTADO")
	private Estado estado;
	

	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cidade(int codigoCidade, String descricaoCidade, Estado estado) {
		super();
		this.codigoCidade = codigoCidade;
		this.descricaoCidade = descricaoCidade;
		this.estado = estado;
	}


	public int getCodigoCidade() {
		return codigoCidade;
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
}
