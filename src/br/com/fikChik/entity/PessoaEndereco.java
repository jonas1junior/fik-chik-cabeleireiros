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
@Table(name="CAB_PESSOA_ENDERECO")
@SequenceGenerator(name = "seqPessoaEndereco", sequenceName="SEQ_PESSOA_ENDERECO", allocationSize=1)
public class PessoaEndereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="NR_ENDERECO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqPessoaEndereco")
	private int nrEndereco;
	
	@Column(name="DS_COMPLEMENTO")
	private String dsComplemento;
	
	@Column(name="CD_PESSOA")
	private Pessoa cdPessoa;
	
	@Column(name="NR_ENDERECO")
	private Endereco cdEndereco;
	
	
	
	synchronized int getNrEndereco() {
		return nrEndereco;
	}
	synchronized void setNrEndereco(int nrEndereco) {
		this.nrEndereco = nrEndereco;
	}
	synchronized String getDsComplemento() {
		return dsComplemento;
	}
	synchronized void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}
	synchronized Pessoa getCdPessoa() {
		return cdPessoa;
	}
	synchronized void setCdPessoa(Pessoa cdPessoa) {
		this.cdPessoa = cdPessoa;
	}
	synchronized Endereco getCdEndereco() {
		return cdEndereco;
	}
	synchronized void setCdEndereco(Endereco cdEndereco) {
		this.cdEndereco = cdEndereco;
	}
}