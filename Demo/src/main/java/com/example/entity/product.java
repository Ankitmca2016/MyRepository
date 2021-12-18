package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.request.CreateProductRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "products")
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "productname")
	private String productname;

	@Column(name = "price")
	private Long price;

	@Column(name = "quantitysold")
	private Long quantitysold;

	public product(CreateProductRequest createProductRequest) {
		this.productname = createProductRequest.getProductname();
		this.price = createProductRequest.getPrice();
		this.quantitysold = createProductRequest.getQuantitysold();
	}
}
