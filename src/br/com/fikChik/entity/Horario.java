package br.com.fikChik.entity;

import java.io.Serializable;

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
	private int cdHorario;
	
	@Column(name="OCUPADO")
	private Ocupado ocupado;
	
	
	
	synchronized int getCdHorario() {
		return cdHorario;
	}
	
	synchronized void setCdHorario(int cdHorario) {
		this.cdHorario = cdHorario;
	}
	
	synchronized Ocupado getOcupado() {
		return ocupado;
	}
	
	synchronized void setOcupado(Ocupado ocupado) {
		this.ocupado = ocupado;
	}
}