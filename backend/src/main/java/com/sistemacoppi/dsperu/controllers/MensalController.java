package com.sistemacoppi.dsperu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemacoppi.dsperu.entities.Financeiro;
import com.sistemacoppi.dsperu.services.MensalService;

@RestController
@RequestMapping(value = "/mensalidades")
public class MensalController {
	
	@Autowired
	private MensalService service;
	
	@GetMapping
	public Page<Financeiro> buscaMensalidades(Pageable page){
		return service.buscaMensalidades(page);
	}

}
