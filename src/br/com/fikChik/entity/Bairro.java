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
@Table(name="CAB_BAIRRO")
@SequenceGenerator(name="seqBairro", sequenceName="SEQ_BAIRRO", allocationSize=1)
public class Bairro implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="CD_BAIRRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqBairro")
	private int codigoBairro;
	
	@Column(name="DS_BAIRRO",nullable=false,length=100)
	private String descricaoBairro;
	
	@Column(name="CD_CIDADE")
	private Cidade cidade;

	
	public Bairro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bairro(int codigoBairro, String descricaoBairro,
			Cidade cidade) {
		super();
		this.codigoBairro = codigoBairro;
		this.descricaoBairro = descricaoBairro;
		this.cidade = cidade;
	}


	public int getCodigoBairro() {
		return codigoBairro;
	}


	public String getDescricaoBairro() {
		return descricaoBairro;
	}


	public void setDescricaoBairro(String descricaoBairro) {
		if(descricaoBairro.length() > 100){
			throw new IllegalArgumentException("Insira no máximo 100 caracteres para a Descrição do Bairro");
		}
		this.descricaoBairro = descricaoBairro;
	}


	public Cidade getCodigoCidade() {
		return cidade;
	}


	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	
	
}