package com.sistemacoppi.dsperu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemacoppi.dsperu.entities.Financeiro;

public interface MensalRepository extends JpaRepository<Financeiro, Long> {

}
