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
@SequenceGenerator(name="seqAgendamentor", sequenceName="SEQ_AGENDAMENTO", allocationSize=1)
public class Agendamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="CD_AGENDAMENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAgendamentor")
	private int cdAgendamento;
	
	@Column(name="CD_PESSOA")
	private Pessoa cdPessoa;
	
	@Column(name="CD_SERVICO")
	private Servico cdServico;
	
	@Column(name="CD_STATUS")
	private Status cdStatus;
	
	@Column(name="CD_HORARIO")
	private Horario cdHorario;
	
	
	
	synchronized int getCdAgendamento() {
		return cdAgendamento;
	}
	synchronized void setCdAgendamento(int cdAgendamento) {
		this.cdAgendamento = cdAgendamento;
	}
	synchronized Pessoa getCdPessoa() {
		return cdPessoa;
	}
	synchronized void setCdPessoa(Pessoa cdPessoa) {
		this.cdPessoa = cdPessoa;
	}
	synchronized Servico getCdServico() {
		return cdServico;
	}
	synchronized void setCdServico(Servico cdServico) {
		this.cdServico = cdServico;
	}
	synchronized Status getCdStatus() {
		return cdStatus;
	}
	synchronized void setCdStatus(Status cdStatus) {
		this.cdStatus = cdStatus;
	}
	synchronized Horario getCdHorario() {
		return cdHorario;
	}
	synchronized void setCdHorario(Horario cdHorario) {
		this.cdHorario = cdHorario;
	}
	static synchronized long getSerialversionuid() {
		return serialVersionUID;
	}
}
