package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.product;

@Repository
public interface ProductRepository extends JpaRepository<product, Long> {

	@Query(value = "select * from products where quantitysold = (select max(quantitysold) from products)", nativeQuery = true)
	List<product> getMaxsold();

}
