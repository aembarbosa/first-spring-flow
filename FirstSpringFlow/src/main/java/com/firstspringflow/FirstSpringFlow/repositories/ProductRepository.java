package com.firstspringflow.FirstSpringFlow.repositories;

import com.firstspringflow.FirstSpringFlow.entities.Category;
import com.firstspringflow.FirstSpringFlow.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
