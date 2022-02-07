package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Vendedor;

public class VendaSucessoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nomeVendedor;
	private Long totalVisitas;
	private Long totalNegociosFechados;
	
	public VendaSucessoDTO() {
	}

	public VendaSucessoDTO(Vendedor vendedor, Long totalVisitas, Long totalNegociosFechados) {
		this.nomeVendedor = vendedor.getName();
		this.totalVisitas = totalVisitas;
		this.totalNegociosFechados = totalNegociosFechados;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Long getTotalVisitas() {
		return totalVisitas;
	}

	public void setTotalVisitas(Long totalVisitas) {
		this.totalVisitas = totalVisitas;
	}

	public Long getTotalNegociosFechados() {
		return totalNegociosFechados;
	}

	public void setTotalNegociosFechados(Long totalNegociosFechados) {
		this.totalNegociosFechados = totalNegociosFechados;
	}
		
}
