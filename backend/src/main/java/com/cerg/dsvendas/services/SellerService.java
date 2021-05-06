package com.cerg.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cerg.dsvendas.dto.SellerDTO;
import com.cerg.dsvendas.entities.Seller;
import com.cerg.dsvendas.repositorys.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional
	public List<SellerDTO> findAll(){
		List<Seller> list = sellerRepository.findAll(); 
		return list.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
