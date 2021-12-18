package com.example.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateProductRequest {
	
	@JsonProperty("productname")
	private String productname;

	private Long price;

	private Long quantitysold;

}
