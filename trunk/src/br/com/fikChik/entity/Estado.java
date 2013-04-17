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
@SequenceGenerator(name = "seqEstado", sequenceName="SEQ_ESTADO", allocationSize=1)
public class Estado implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_ESTADO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqEstado")
	private int codigoEstado;
	
	@Column(name="DS_ESTADO", nullable=false,length=100)
	private String descricaoEstado;
	
	@Column(name="SIGLA",nullable=false,length=2)
	private String siglaEstado;
	

	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Estado(int codigoEstado, String descricaoEstado, String siglaEstado) {
		super();
		this.codigoEstado = codigoEstado;
		this.descricaoEstado = descricaoEstado;
		this.siglaEstado = siglaEstado;
	}
	

	public int getCodigoEstado() {
		return codigoEstado;
	}


	public String getDescricaoEstado() {
		return descricaoEstado;
	}

	public void setDescricaoEstado(String descricaoEstado) {
		if(descricaoEstado.length() > 100){
			throw new IllegalArgumentException("Insira no máximo 100 caracteres para a descricao do Estado");
		}
		this.descricaoEstado = descricaoEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		if(siglaEstado.length() > 100){
			throw new IllegalArgumentException("Insira no máximo 2 caracteres para a descricao da sigla do Estadp");
		}
		this.siglaEstado = siglaEstado;
	}

	
}