package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.dto.VendaSomaDTO;
import com.devsuperior.dsvendas.dto.VendaSucessoDTO;
import com.devsuperior.dsvendas.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {
	
	@Query("select new com.devsuperior.dsvendas.dto.VendaSomaDTO(obj.vendedor, SUM(obj.amount)) from Venda AS obj GROUP BY obj.vendedor")
	public List<VendaSomaDTO> quantidadeDeVendasPorVendedor();
	
	@Query("select new com.devsuperior.dsvendas.dto.VendaSucessoDTO(obj.vendedor, SUM(obj.visited), SUM(obj.deals)) from Venda AS obj GROUP BY obj.vendedor")
	public List<VendaSucessoDTO> sucessoDeVendasPorVendedor();
	
}
