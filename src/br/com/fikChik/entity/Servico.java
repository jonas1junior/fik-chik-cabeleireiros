package br.com.fikChik.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CAB_SERVICO")
@SequenceGenerator(name="seqServico", sequenceName="SEQ_SERVICO", allocationSize=1)
public class Servico implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_SERVICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqServico")
	private int codigoServico;
	
	@Column(name="DS_SERVICO",nullable=false,length=300)
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TEMPO",nullable=false)
	private Calendar tempo;
	
	@Column(name="PRECO",nullable=false)
	private double preco;

	
	public Servico(int codigoServico, String descricao, Calendar tempo,
			double preco) {
		super();
		this.codigoServico = codigoServico;
		this.descricao = descricao;
		this.tempo = tempo;
		this.preco = preco;
	}


	public Servico() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCodigoServico() {
		return codigoServico;
	}



	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		if(descricao.length() > 300){
			throw new IllegalArgumentException("Insira no máximo 300 caracteres para a descrição do servico!");
		}
		this.descricao = descricao;
	}


	public Calendar getTempo() {
		return tempo;
	}


	public void setTempo(Calendar tempo) {
		this.tempo = tempo;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}