package br.com.fikChik.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAB_FUNCIONARIO_SERVICO")
@SequenceGenerator(name="seqFuncionarioServico", sequenceName="SEQ_FUNCIONARIO_SERVICO", allocationSize=1)
public class FuncionarioServico implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_PESSOA", nullable=false)
	private int cdPessoa;
	
	@Column(name="CD_SERVICO", nullable=false)
	private Servico cdServico;
	
	
	
	
	synchronized int getCdPessoa() {
		return cdPessoa;
	}
	
	synchronized void setCdPessoa(int cdPessoa) {
		this.cdPessoa = cdPessoa;
	}
}