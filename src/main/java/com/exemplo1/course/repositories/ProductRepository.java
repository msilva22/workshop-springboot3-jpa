package com.exemplo1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo1.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
