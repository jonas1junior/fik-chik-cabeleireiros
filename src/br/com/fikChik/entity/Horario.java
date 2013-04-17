package br.com.fikChik.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fikChik.Enum.Ocupado;


@Entity
@Table(name="CAB_HORARIO")
@SequenceGenerator(name="seqHorario", sequenceName="SEQ_HORARIO", allocationSize=1)
public class Horario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqHorario")
	@Column(name="CD_HORARIO")
	private int codigoHorario;
	
	@Column(name="OCUPADO")
	private Ocupado ocupado;
	
	@Column(name="HORARIO")
	private Calendar horario;
	
	@Column(name="CD_AGENDA")
	private Agenda agenda;

	public Horario(int codigoHorario, Ocupado ocupado, Calendar horario,
			Agenda agenda) {
		super();
		this.codigoHorario = codigoHorario;
		this.ocupado = ocupado;
		this.horario = horario;
		this.agenda = agenda;
	}

	public Horario() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getCodigoHorario() {
		return codigoHorario;
	}


	public Ocupado getOcupado() {
		return ocupado;
	}

	public void setOcupado(Ocupado ocupado) {
		this.ocupado = ocupado;
	}

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
	
}