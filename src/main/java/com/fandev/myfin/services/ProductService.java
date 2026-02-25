package com.fandev.myfin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fandev.myfin.entities.Product;
import com.fandev.myfin.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		
		List<Product> products = productRepository.findAll();
		return products;
	}
	
	public Product findById(Long id) {
		
		Optional<Product> opProduct = productRepository.findById(id);
		return opProduct.get();
	}
}
