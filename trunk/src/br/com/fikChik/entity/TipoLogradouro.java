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
@Table(name="CAB_TIPO_LOGRADOURO")
@SequenceGenerator(name="seqTipoLogradouro", sequenceName="SEQ_TIPO_LOGRADOURO", allocationSize=1)
public class TipoLogradouro implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CD_TIPO_LOGRADOURO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTipoLogradouro")
	private int cdTipoLogradouro;
	
	@Column(name="DS_TIPO_LOGRADOURO")
	private String dsTipoLogradouro;
	
	

	synchronized int getCdTipoLogradouro() {
		return cdTipoLogradouro;
	}

	synchronized void setCdTipoLogradouro(int cdTipoLogradouro) {
		this.cdTipoLogradouro = cdTipoLogradouro;
	}

	synchronized String getDsTipoLogradouro() {
		return dsTipoLogradouro;
	}

	synchronized void setDsTipoLogradouro(String dsTipoLogradouro) {
		this.dsTipoLogradouro = dsTipoLogradouro;
	}
	
}
