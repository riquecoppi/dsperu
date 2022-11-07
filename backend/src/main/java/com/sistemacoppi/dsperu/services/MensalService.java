package com.sistemacoppi.dsperu.services;



import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

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
	    
		LocalDate hoje = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		
		LocalDate min = minDate.equals("") ? hoje.minusDays(150) : LocalDate.parse(minDate);
	 	LocalDate max = maxDate.equals("") ? hoje : LocalDate.parse(maxDate);
	 	
		return repository.buscaParcelas(min, max, pageable);
	 		}
	

	
}
