package com.exemplo1.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo1.course.entities.OrderItem;
import com.exemplo1.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}