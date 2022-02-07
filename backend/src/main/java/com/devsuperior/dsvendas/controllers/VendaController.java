package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.VendaDTO;
import com.devsuperior.dsvendas.dto.VendaSomaDTO;
import com.devsuperior.dsvendas.dto.VendaSucessoDTO;
import com.devsuperior.dsvendas.service.VendaService;

@RestController
@RequestMapping(value = "/vendas")
public class VendaController {
	
	@Autowired
	private VendaService service;
	
	@GetMapping
	public ResponseEntity<Page<VendaDTO>> findAll(Pageable pageable){
		Page<VendaDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/total-vendas-por-vendedor")
	public ResponseEntity<List<VendaSomaDTO>> quantidadeDeVendasPorVendedor(){
		List<VendaSomaDTO> list = service.quantidadeDeVendasPorVendedor();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/sucesso-vendas-por-vendedor")
	public ResponseEntity<List<VendaSucessoDTO>> sucessoDeVendasPorVendedor(){
		List<VendaSucessoDTO> list = service.sucessoDeVendasPorVendedor();
		return ResponseEntity.ok(list);
	}
	
}
