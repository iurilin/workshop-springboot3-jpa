package com.iuritest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iuritest.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
