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
	private int cdTelefone;
	
	@Column(name="NM_DDD")
	private String nmDDD;
	
	@Column(name="NM_TELEFONE")
	private String nmTelefone;
	
	@Column(name="CD_PESSOA")
	private Pessoa cdPessoa;
	
	@Column(name="CD_TIPO_TELEFONE")
	private Endereco cdTipoTelefone;
	
	
	

	synchronized int getCdTelefone() {
		return cdTelefone;
	}

	synchronized void setCdTelefone(int cdTelefone) {
		this.cdTelefone = cdTelefone;
	}

	synchronized String getNmDDD() {
		return nmDDD;
	}

	synchronized void setNmDDD(String nmDDD) {
		this.nmDDD = nmDDD;
	}

	synchronized String getNmTelefone() {
		return nmTelefone;
	}

	synchronized void setNmTelefone(String nmTelefone) {
		this.nmTelefone = nmTelefone;
	}

	synchronized Pessoa getCdPessoa() {
		return cdPessoa;
	}

	synchronized void setCdPessoa(Pessoa cdPessoa) {
		this.cdPessoa = cdPessoa;
	}

	synchronized Endereco getCdTipoTelefone() {
		return cdTipoTelefone;
	}

	synchronized void setCdTipoTelefone(Endereco cdTipoTelefone) {
		this.cdTipoTelefone = cdTipoTelefone;
	}
}