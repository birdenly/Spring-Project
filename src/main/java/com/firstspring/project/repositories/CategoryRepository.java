package com.firstspring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstspring.project.entities.Category;
//No need for @Respository, JPA already has it
public interface CategoryRepository extends JpaRepository<Category,Long>  {
    
}