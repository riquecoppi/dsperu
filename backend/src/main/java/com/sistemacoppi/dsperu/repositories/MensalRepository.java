package com.sistemacoppi.dsperu.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sistemacoppi.dsperu.entities.Financeiro;

public interface MensalRepository extends JpaRepository<Financeiro, Long> {
	
	@Query("SELECT obj FROM Financeiro obj WHERE obj.data BETWEEN :min AND :max")
	Page<Financeiro>buscaParcelas(LocalDate min, LocalDate max, Pageable pageable);
	 
   
}
