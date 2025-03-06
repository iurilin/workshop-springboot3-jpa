package com.iuritest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iuritest.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
