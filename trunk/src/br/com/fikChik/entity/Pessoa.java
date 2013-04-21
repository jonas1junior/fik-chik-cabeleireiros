package br.com.fikChik.entity;

import java.io.Serializable;
import java.util.Calendar;

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
	private int codigodPessoa;
	
	@Column(name="NM_PESSOA", length=300, nullable=false)
	private String nome;
	
	@Column(name="EMAIL", nullable=false,length=100)
	private String email;
	
	@Column(name="CPF", nullable=false)
	private int cpf;
	
	@Column(name="RG", nullable=false)
	private String rg;
	
	@Column(name="DT_NASCIMENTO", nullable=false)
	private Calendar dataNascimento;
	
	

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(int codigodPessoa, String nome, String email, int cpf,
			String rg, Calendar dataNascimento) {
		super();
		this.codigodPessoa = codigodPessoa;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	public int getCodigodPessoa() {
		return codigodPessoa;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length()>300){
			throw new IllegalArgumentException("Insira nomáximo 300 caracteres para o nome!");
		}
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.length()>100){
			throw new IllegalArgumentException("Insira nomáximo 100 caracteres para o mail!");
		}
		this.email = email;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	
}