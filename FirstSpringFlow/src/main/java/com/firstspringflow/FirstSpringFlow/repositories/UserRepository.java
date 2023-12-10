package com.firstspringflow.FirstSpringFlow.repositories;

import com.firstspringflow.FirstSpringFlow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
