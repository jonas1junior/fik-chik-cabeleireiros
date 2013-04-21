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
@Table(name="CAB_TELEFONE")
@SequenceGenerator(name = "seqTelefone", sequenceName="SEQ_TELEFONE", allocationSize=1)
public class Telefone implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@Column(name="CD_TELEFONE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTelefone")
	private int codigoTelefone;
	
	@Column(name="NM_DDD",nullable=false)
	private String numeroDDD;
	
	@Column(name="NM_TELEFONE",nullable=false)
	private String numeroTelefone;
	
	@Column(name="CD_PESSOA")
	private Pessoa pessoa;
	
	@Column(name="CD_TIPO_TELEFONE")
	private TipoTelefone tipoTelefone;

	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telefone(int codigoTelefone, String numeroDDD,
			String numeroTelefone, Pessoa pessoa, TipoTelefone tipoTelefone) {
		super();
		this.codigoTelefone = codigoTelefone;
		this.numeroDDD = numeroDDD;
		this.numeroTelefone = numeroTelefone;
		this.pessoa = pessoa;
		this.tipoTelefone = tipoTelefone;
	}

	public int getCodigoTelefone() {
		return codigoTelefone;
	}

	public String getNumeroDDD() {
		return numeroDDD;
	}

	public void setNumeroDDD(String numeroDDD) {
		this.numeroDDD = numeroDDD;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
	
	

	
}