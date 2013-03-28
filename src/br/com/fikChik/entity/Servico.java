package br.com.fikChik.entity;

import java.io.Serializable;
import java.sql.Date;

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
	private int cdServico;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TEMPO")
	private Date tempo;
	
	@Column(name="PRECO")
	private float preco;
	
	
	
	synchronized int getCdServico() {
		return cdServico;
	}
	
	synchronized void setCdServico(int cdServico) {
		this.cdServico = cdServico;
	}
	
	synchronized String getDescricao() {
		return descricao;
	}
	
	synchronized void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	synchronized Date getTempo() {
		return tempo;
	}
	
	synchronized void setTempo(Date tempo) {
		this.tempo = tempo;
	}
	
	synchronized float getPreco() {
		return preco;
	}
	
	synchronized void setPreco(float preco) {
		this.preco = preco;
	}
}