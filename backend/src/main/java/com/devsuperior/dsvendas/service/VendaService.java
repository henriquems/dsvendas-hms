package com.devsuperior.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.VendaDTO;
import com.devsuperior.dsvendas.dto.VendaSomaDTO;
import com.devsuperior.dsvendas.dto.VendaSucessoDTO;
import com.devsuperior.dsvendas.entities.Venda;
import com.devsuperior.dsvendas.repositories.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository repository;
	
	@Transactional(readOnly = true)
	public Page<VendaDTO> findAll(Pageable pageable){
		Page<Venda> result = repository.findAll(pageable);
		return result.map(x -> new VendaDTO(x)); 
	}
	
	@Transactional(readOnly = true)
	public List<VendaSomaDTO> quantidadeDeVendasPorVendedor(){
		return repository.quantidadeDeVendasPorVendedor();
	}
	
	@Transactional(readOnly = true)
	public List<VendaSucessoDTO> sucessoDeVendasPorVendedor(){
		return repository.sucessoDeVendasPorVendedor();
	}
	
}
