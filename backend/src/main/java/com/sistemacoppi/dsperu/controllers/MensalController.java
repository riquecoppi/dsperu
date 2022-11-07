package com.sistemacoppi.dsperu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Financeiro> buscaMensalidades(){
		return service.buscaMensalidades();
	}

}
