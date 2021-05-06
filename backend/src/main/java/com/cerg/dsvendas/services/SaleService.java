package com.cerg.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cerg.dsvendas.dto.SaleDTO;
import com.cerg.dsvendas.dto.SellerDTO;
import com.cerg.dsvendas.entities.Sale;
import com.cerg.dsvendas.repositorys.SaleRepository;
import com.cerg.dsvendas.repositorys.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> list = saleRepository.findAll(pageable); 
		return list.map(x -> new SaleDTO(x));
	}

}
