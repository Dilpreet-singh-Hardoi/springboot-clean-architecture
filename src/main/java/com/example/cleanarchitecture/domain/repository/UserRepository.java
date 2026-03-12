package com.example.cleanarchitecture.domain.repository;

import com.example.cleanarchitecture.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA handles CRUD automatically
}
