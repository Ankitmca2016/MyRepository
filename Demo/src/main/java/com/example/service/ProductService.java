package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.product;
import com.example.repository.ProductRepository;
import com.example.request.CreateProductRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<product> getAllProducts () {
		//return productRepository.findAll();
		log.debug("Getting Max Sold"  + productRepository.getMaxsold().size());
		return productRepository.getMaxsold();
	}
	
	public product createProduct (CreateProductRequest createProductRequest) {
		product product = new product(createProductRequest);
		
		product = productRepository.save(product);
		return product;
	}
}
