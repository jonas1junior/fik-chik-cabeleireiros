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
@Table(name="CAB_TIPO_TELEFONE")
@SequenceGenerator(name="seqTipoTelefone", sequenceName="SEQ_TIPO_TELEFONE", allocationSize=1)
public class TipoTelefone implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@Column(name="CD_TIPO_TELEFONE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTipoTelefone")
	private int cdTipoTelefone;
	
	@Column(name="DS_TIPO_TELEFONE")
	private String dsTipoTelefone;
	
	

	synchronized int getCdTipoTelefone() {
		return cdTipoTelefone;
	}

	synchronized void setCdTipoTelefone(int cdTipoTelefone) {
		this.cdTipoTelefone = cdTipoTelefone;
	}

	synchronized String getDsTipoTelefone() {
		return dsTipoTelefone;
	}

	synchronized void setDsTipoTelefone(String dsTipoTelefone) {
		this.dsTipoTelefone = dsTipoTelefone;
	}
	
}
