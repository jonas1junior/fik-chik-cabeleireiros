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
@Table(name="CAB_AGENDAMENTO")
@SequenceGenerator(name="seqAgendamento", sequenceName="SEQ_AGENDAMENTO", allocationSize=1)
public class Agendamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="CD_AGENDAMENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAgendamento")
	private int codigoAgendamento;
	
	@Column(name="CD_PESSOA")
	private Pessoa pessoa;
	
	@Column(name="CD_SERVICO")
	private Servico servico;
	
	@Column(name="CD_STATUS")
	private Status status;
	
	@Column(name="CD_HORARIO")
	private Horario horario;
	
	
	
	

	public Agendamento(int codigoAgendamento, Pessoa pessoa, Servico servico,
			Status status, Horario horario) {
		super();
		this.codigoAgendamento = codigoAgendamento;
		this.pessoa = pessoa;
		this.servico = servico;
		this.status = status;
		this.horario = horario;
	}

	public Agendamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoAgendamento() {
		return codigoAgendamento;
	}

	public void setCodigoAgendamento(int codigoAgendamento) {
		this.codigoAgendamento = codigoAgendamento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	

	
	
	
}
