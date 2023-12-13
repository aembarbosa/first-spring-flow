package com.firstspringflow.FirstSpringFlow.repositories;

import com.firstspringflow.FirstSpringFlow.entities.Category;
import com.firstspringflow.FirstSpringFlow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
