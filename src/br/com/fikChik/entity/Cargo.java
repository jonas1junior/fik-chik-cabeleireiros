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
@Table(name="CAB_CARGO")
@SequenceGenerator(name="seqCargo",sequenceName="SEQ_CARGO",allocationSize=1)
public class Cargo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqCargo")
	@Column(name="CD_CARGO")
	private int codigoCargo;
	
	@Column(name="DS_CARGO",nullable=false,length=200)
	private String descricao;

	
	public Cargo(int codigoCargo, String descricao) {
		super();
		this.codigoCargo = codigoCargo;
		this.descricao = descricao;
	}

	
	public Cargo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getCodigoCargo() {
		return codigoCargo;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao.length()>200){
			throw new IllegalArgumentException("Insira no maximo 200 caracteres para a descrição do cargo!");
		}
		this.descricao = descricao;
	}
	
	

}
