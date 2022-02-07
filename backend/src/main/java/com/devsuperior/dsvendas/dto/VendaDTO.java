package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Venda;

public class VendaDTO {
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	private VendedorDTO vendedor;
	
	public VendaDTO() {
	}

	public VendaDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, VendedorDTO vendedor) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.vendedor = vendedor;
	}
	
	public VendaDTO(Venda venda) {
		id = venda.getId();
		visited = venda.getVisited();
		deals = venda.getDeals();
		amount = venda.getAmount();
		date = venda.getDate();
		vendedor = new VendedorDTO(venda.getVendedor());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public VendedorDTO getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorDTO vendedor) {
		this.vendedor = vendedor;
	}
	
}
