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
@Table(name="CAB_FUNCIONARIO")
@SequenceGenerator(name="seqFuncionario", sequenceName="SEQ_FUNCIONARIO", allocationSize=1)
public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_PESSOA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqFuncionario")
	private Pessoa pessoa;
	// verificar a herança
	
	
	
}