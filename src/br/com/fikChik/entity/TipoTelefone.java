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
	private int codigoTipoTelefone;
	
	@Column(name="DS_TIPO_TELEFONE", nullable=false,length=50)
	private String descricaoTipoTelefone;
	
	

	public TipoTelefone() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TipoTelefone(int codigoTipoTelefone, String descricaoTipoTelefone) {
		super();
		this.codigoTipoTelefone = codigoTipoTelefone;
		this.descricaoTipoTelefone = descricaoTipoTelefone;
	}



	public int getCodigoTipoTelefone() {
		return codigoTipoTelefone;
	}



	public String getDescricaoTipoTelefone() {
		return descricaoTipoTelefone;
	}



	public void setDescricaoTipoTelefone(String descricaoTipoTelefone) {
		if(descricaoTipoTelefone.length()>50){
			throw new IllegalArgumentException("Insira no máximo 50 caracteres para a descrição do tipo de telefone");
		}
		this.descricaoTipoTelefone = descricaoTipoTelefone;
	}
	
	

	
	
}
