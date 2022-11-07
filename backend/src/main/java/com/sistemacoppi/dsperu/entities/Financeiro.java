package com.sistemacoppi.dsperu.entities;

import java.time.LocalDate;

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
	
	

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private LocalDate data; 
     
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	
	public Financeiro() {
    }
    

}
