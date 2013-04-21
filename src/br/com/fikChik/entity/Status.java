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
@Table(name="CAB_STATUS")
@SequenceGenerator(name="seqStatus", sequenceName="SEQ_STATUS", allocationSize=1)
public class Status implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqStatus")
	@Column(name="CD_STATUS")
	private int cdStatus;
	
	@Column(name="DS_STATUS",nullable=false,length=30)
	private String descricao;

	public Status(int cdStatus, String descricao) {
		super();
		this.cdStatus = cdStatus;
		this.descricao = descricao;
	}

	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCdStatus() {
		return cdStatus;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao.length() > 30){
			throw new IllegalArgumentException("insira no máximo 300 caracteres para a descrição do Status");
		}
		this.descricao = descricao;
	}
	
	
	
}
