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
@Table(name="CAB_ENDERECO")
@SequenceGenerator(name = "seqEndereco", sequenceName="SEQ_ENDERECO", allocationSize=1)
public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="CD_ENDERECO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqEndereco")
	private int codigoEndereco;
	
	@Column(name="NM_LOGRADOURO",nullable=false,length=300)
	private String nomeLogradouro;
	
	@Column(name="CEP",nullable=false)
	private int cep;
	
	@Column(name="CD_TIPO_LOGRADOURO")
	private TipoLogradouro tipoLogradouro;
	
	@Column(name="CD_BAIRRO")
	private Bairro bairro;
	

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(int codigoEndereco, String nomeLogradouro, int cep,
			TipoLogradouro tipoLogradouro, Bairro bairro) {
		super();
		this.codigoEndereco = codigoEndereco;
		this.nomeLogradouro = nomeLogradouro;
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.bairro = bairro;
	}

	public int getCodigoEndereco() {
		return codigoEndereco;
	}

	public String getNomeLogradouro() {
		return nomeLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {
		if(nomeLogradouro.length() > 300){
			throw new IllegalArgumentException("Insirá no máximo 300 caracteres para o nome do Logradouro");
		}
		this.nomeLogradouro = nomeLogradouro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	
	
}