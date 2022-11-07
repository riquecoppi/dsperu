package com.sistemacoppi.dsperu.services;



import java.time.LocalDate;

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
	
	public Page<Financeiro> buscaMensalidades(String minDate, String maxDate, Pageable pageable){
	    
		LocalDate min = LocalDate.parse(minDate);
	 	LocalDate max = LocalDate.parse(maxDate);
	 	
		return repository.buscaParcelas(min, max, pageable);
	 		}
	

	
}
