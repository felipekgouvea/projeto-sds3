package com.cerg.dsvendas.dto;

import java.io.Serializable;

import com.cerg.dsvendas.entities.Seller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sallerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sallerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}	
}
