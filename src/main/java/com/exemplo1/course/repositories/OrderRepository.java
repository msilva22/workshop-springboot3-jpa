package com.exemplo1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo1.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
