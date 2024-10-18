package com.firstspring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstspring.project.entities.Product;
//No need for @Respository, JPA already has it
public interface ProductRepository extends JpaRepository<Product,Long>  {
    
}