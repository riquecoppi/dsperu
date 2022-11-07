package com.sistemacoppi.dsperu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sistemacoppi.dsperu.entities.Financeiro;
import com.sistemacoppi.dsperu.repositories.MensalRepository;

@Service
public class MensalService {
    
	@Autowired
	private MensalRepository repository;
	
	public Page<Financeiro> buscaMensalidades(Pageable page){
	
		return repository.findAll(page);		
	}
}
