package com.cerg.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.cerg.dsvendas.entities.Sale;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SaleDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO seller;

	public SaleDTO(Sale entity) {
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO(entity.getSeller());
	}	
}
