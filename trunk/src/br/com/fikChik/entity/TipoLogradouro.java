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
@Table(name="CAB_TIPO_LOGRADOURO")
@SequenceGenerator(name="seqTipoLogradouro", sequenceName="SEQ_TIPO_LOGRADOURO", allocationSize=1)
public class TipoLogradouro implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CD_TIPO_LOGRADOURO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTipoLogradouro")
	private int codigoTipoLogradouro;
	
	@Column(name="DS_TIPO_LOGRADOURO",nullable=false,length=30)
	private String descricao;

	public TipoLogradouro(int codigoTipoLogradouro, String descricao) {
		super();
		this.codigoTipoLogradouro = codigoTipoLogradouro;
		this.descricao = descricao;
	}

	public TipoLogradouro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoTipoLogradouro() {
		return codigoTipoLogradouro;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao.length()>30){
			throw new IllegalArgumentException("Insira no máximo 30 caracteres para a descrição do Tipo de Logradouro");
		}
		this.descricao = descricao;
	}
	
	
	

	
}
