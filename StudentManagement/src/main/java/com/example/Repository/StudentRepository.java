package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Students;

public interface StudentRepository extends JpaRepository<Students, Integer> {
	
}
