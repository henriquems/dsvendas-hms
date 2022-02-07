package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Vendedor;

public class VendedorDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public VendedorDTO() {
	}
	
	public VendedorDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public VendedorDTO(Vendedor seller) {
		id = seller.getId();
		name = seller.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
