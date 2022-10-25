package com.sistemacoppi.dsperu.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class FinanceiroPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "perueiro_id")
	private Perueiro perueiro;
	
	public FinanceiroPK() {
		
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Perueiro getPerueiro() {
		return perueiro;
	}

	public void setPerueiro(Perueiro perueiro) {
		this.perueiro = perueiro;
	}
	
	

}
