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
@Table(name="CAB_PESSOA")
@SequenceGenerator(name="seqPessoa", sequenceName="SEQ_PESSOA", allocationSize=1)
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_PESSOA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqPessoa")
	private int cdPessoa;
	
	@Column(name="NOME", length=255, nullable=false)
	private String nome;
	
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	
	
	
	synchronized int getCdPessoa() {
		return cdPessoa;
	}
	synchronized void setCdPessoa(int cdPessoa) {
		this.cdPessoa = cdPessoa;
	}
	synchronized String getNome() {
		return nome;
	}
	synchronized void setNome(String nome) {
		this.nome = nome;
	}
	synchronized String getEmail() {
		return email;
	}
	synchronized void setEmail(String email) {
		this.email = email;
	}
}