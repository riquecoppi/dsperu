package com.sistemacoppi.dsperu.entities;

import java.util.Date;

//import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_financeiro")
public class Financeiro {
	
	

	
	//@EmbeddedId
    //private FinanceiroPK id = new FinanceiroPK();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private Date data; 
     
    @ManyToOne
    private Aluno aluno; 
    
    public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}



	public Financeiro() {
    }
    

}
