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
@Table(name="CAB_CLIENTE")
@SequenceGenerator(name="seqCliente", sequenceName="SEQ_CLIENTE", allocationSize=1)
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_PESSOA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqCliente")
	// verificar a herança
	
	private Pessoa pessoa;
}