package com.cerg.dsvendas.dto;

import java.io.Serializable;

import com.cerg.dsvendas.entities.Seller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String saleName;
	private Double sum;
	
	public SaleSumDTO(Seller seller, Double sum) {
		super();
		this.saleName = seller.getName();
		this.sum = sum;
	}	
}
