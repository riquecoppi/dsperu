package com.sistemacoppi.dsperu.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_financeiro")
public class Financeiro {
	
	@EmbeddedId
	private FinanceiroPK id = new FinanceiroPK();
	
    private Double valorPago;
    
    public Financeiro() {
    }
    
    public void setAluno(Aluno aluno) {
    	id.setAluno(aluno);
    }
    
    public void setPerueiro(Perueiro perueiro) {
    	id.setPerueiro(perueiro);
    }

	public FinanceiroPK getId() {
		return id;
	}

	public void setId(FinanceiroPK id) {
		this.id = id;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
    
    

}
