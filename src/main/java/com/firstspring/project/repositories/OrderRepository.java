package com.firstspring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstspring.project.ententies.Order;
//No need for @Respository, JPA is already has it
public interface OrderRepository extends JpaRepository<Order,Long>  {//<User,Long> - ententy, primary key
    
}