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
@Table(name="CAB_ENDERECO")
@SequenceGenerator(name = "seqEndereco", sequenceName="SEQ_ENDERECO", allocationSize=1)
public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="CD_ENDERECO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqEndereco")
	private int cdEndereco;
	
	@Column(name="NM_LOGRADOURO")
	private String nmLogradouro;
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="CD_TIPO_LOGRADOURO")
	private TipoLogradouro cdTipoLogradouro;
	
	@Column(name="CD_BAIRRO")
	private Bairro cdBairro;
	
	
	
	synchronized int getCdEndereco() {
		return cdEndereco;
	}

	synchronized void setCdEndereco(int cdEndereco) {
		this.cdEndereco = cdEndereco;
	}

	synchronized String getNmLogradouro() {
		return nmLogradouro;
	}

	synchronized void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}

	synchronized String getCpf() {
		return cpf;
	}

	synchronized void setCpf(String cpf) {
		this.cpf = cpf;
	}

	synchronized TipoLogradouro getCdTipoLogradouro() {
		return cdTipoLogradouro;
	}

	synchronized void setCdTipoLogradouro(TipoLogradouro cdTipoLogradouro) {
		this.cdTipoLogradouro = cdTipoLogradouro;
	}

	synchronized Bairro getCdBairro() {
		return cdBairro;
	}

	synchronized void setCdBairro(Bairro cdBairro) {
		this.cdBairro = cdBairro;
	}
}