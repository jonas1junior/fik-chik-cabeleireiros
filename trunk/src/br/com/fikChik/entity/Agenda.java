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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CAB_AGENDA")
@SequenceGenerator(name = "seqAgenda", sequenceName="SEQ_AGENDA", allocationSize=1)
public class Agenda implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// Define um ID para a entidade
	@Id
	@Column(name="CD_AGENDA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAgenda")
	private int codigoAgenda;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA", nullable=false)
	private Calendar data;
	
	@Column(name="CD_PESSOA")
	private Pessoa codigoPessoa;	
	
	
	public Agenda() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Agenda(int codigoAgenda, Calendar data, Pessoa codigoPessoa) {
		super();
		this.codigoAgenda = codigoAgenda;
		this.data = data;
		this.codigoPessoa = codigoPessoa;
	}


	public int getCodigoAgenda() {
		return codigoAgenda;
	}

	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		this.data = data;
	}


	public Pessoa getCodigoPessoa() {
		return codigoPessoa;
	}


	public void setCodigoPessoa(Pessoa codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}
		

}