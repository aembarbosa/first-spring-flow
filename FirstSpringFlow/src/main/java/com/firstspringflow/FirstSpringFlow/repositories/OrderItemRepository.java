package com.firstspringflow.FirstSpringFlow.repositories;

import com.firstspringflow.FirstSpringFlow.entities.OrderItem;
import com.firstspringflow.FirstSpringFlow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
