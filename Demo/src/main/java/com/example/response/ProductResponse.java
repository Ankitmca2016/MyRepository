package com.example.response;

import com.example.entity.product;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductResponse {

	private long id;

	@JsonProperty("productname")
	private String productname;

	private Long price;

	private Long quantitysold;
	
	public ProductResponse (product product) {
		this.id = product.getId();
		this.productname = product.getProductname();
		this.price = product.getPrice();
		this.quantitysold = product.getQuantitysold();
	}

}
