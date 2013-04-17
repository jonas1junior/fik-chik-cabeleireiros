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
	private Pessoa codigoPessoa;
	
	@Column(name="CD_SERVICO")
	private Servico codigoServico;
	
	@Column(name="CD_STATUS")
	private Status codigoStatus;
	
	@Column(name="CD_HORARIO")
	private Horario codigoHorario;

	public Agendamento(int codigoAgendamento, Pessoa codigoPessoa,
			Servico codigoServico, Status codigoStatus, Horario codigoHorario) {
		super();
		this.codigoAgendamento = codigoAgendamento;
		this.codigoPessoa = codigoPessoa;
		this.codigoServico = codigoServico;
		this.codigoStatus = codigoStatus;
		this.codigoHorario = codigoHorario;
	}

	public Agendamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigoAgendamento() {
		return codigoAgendamento;
	}


	public Pessoa getCodigoPessoa() {
		return codigoPessoa;
	}

	public void setCodigoPessoa(Pessoa codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}

	public Servico getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(Servico codigoServico) {
		this.codigoServico = codigoServico;
	}

	public Status getCodigoStatus() {
		return codigoStatus;
	}

	public void setCodigoStatus(Status codigoStatus) {
		this.codigoStatus = codigoStatus;
	}

	public Horario getCodigoHorario() {
		return codigoHorario;
	}

	public void setCodigoHorario(Horario codigoHorario) {
		this.codigoHorario = codigoHorario;
	}
	

	
	
	
}
