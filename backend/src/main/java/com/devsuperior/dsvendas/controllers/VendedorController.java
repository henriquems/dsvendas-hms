package com.devsuperior.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.VendedorDTO;
import com.devsuperior.dsvendas.service.VendedorService;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorController {
	
	@Autowired
	private VendedorService service;
	
	@GetMapping
	public ResponseEntity<Page<VendedorDTO>> findAll(Pageable pageable){
		Page<VendedorDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
}
