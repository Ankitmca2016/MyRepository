package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.product;
import com.example.request.CreateProductRequest;
import com.example.response.ProductResponse;
import com.example.service.ProductService;

@RestController
@RequestMapping("/api/product/")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("MaxSold")
	public List<ProductResponse> getAllProducts () {
		List<product> productList = productService.getAllProducts();
		List<ProductResponse> productResponseList = new ArrayList<ProductResponse>();
		
		productList.stream().forEach(Product -> {
			productResponseList.add(new ProductResponse(Product));
		});
		
		return productResponseList;
	}
	
	@PostMapping("save")
	public ProductResponse createProduct (@RequestBody CreateProductRequest createProductRequest) {
		product product = productService.createProduct(createProductRequest);
		
		return new ProductResponse(product);
	}
}
