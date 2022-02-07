package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Vendedor;

public class VendaSomaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nomeVendedor;
	private Double soma;
	
	public VendaSomaDTO() {
	}

	public VendaSomaDTO(Vendedor vendedor, Double soma) {
		this.nomeVendedor = vendedor.getName();
		this.soma = soma;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Double getSoma() {
		return soma;
	}

	public void setSoma(Double soma) {
		this.soma = soma;
	}

}
