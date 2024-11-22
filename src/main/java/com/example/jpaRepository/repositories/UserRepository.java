package com.example.jpaRepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaRepository.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
