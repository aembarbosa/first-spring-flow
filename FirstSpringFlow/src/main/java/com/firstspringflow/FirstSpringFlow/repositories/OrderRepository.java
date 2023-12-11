package com.firstspringflow.FirstSpringFlow.repositories;

import com.firstspringflow.FirstSpringFlow.entities.Order;
import com.firstspringflow.FirstSpringFlow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
