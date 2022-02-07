package com.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.VendedorDTO;
import com.devsuperior.dsvendas.entities.Vendedor;
import com.devsuperior.dsvendas.repositories.VendedorRepository;

@Service
public class VendedorService {
	
	@Autowired
	private VendedorRepository repository;
	
	@Transactional(readOnly = true)
	public Page<VendedorDTO> findAll(Pageable pageable){
		Page<Vendedor> result = repository.findAll(pageable);
		return result.map(x -> new VendedorDTO(x)); 
	}
	
}
