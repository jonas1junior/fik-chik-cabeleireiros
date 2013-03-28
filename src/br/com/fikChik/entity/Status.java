package br.com.fikChik.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAB_STATUS")
@SequenceGenerator(name="seqStatus", sequenceName="SEQ_STATUS", allocationSize=1)
public class Status implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CD_STATUS")
	private int cdStatus;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	
	synchronized int getCdStatus() {
		return cdStatus;
	}
	synchronized void setCdStatus(int cdStatus) {
		this.cdStatus = cdStatus;
	}
	synchronized String getDescricao() {
		return descricao;
	}
	synchronized void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
