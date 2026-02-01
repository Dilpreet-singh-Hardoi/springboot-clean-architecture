package com.example.cleanarchitecture.domain.repository;

import com.example.cleanarchitecture.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA handles CRUD automatically
}
