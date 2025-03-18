package com.iuritest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iuritest.course.entities.OrderItem;
import com.iuritest.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}