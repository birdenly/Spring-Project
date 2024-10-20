package com.firstspring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstspring.project.entities.OrderItem;
import com.firstspring.project.entities.pk.OrderItemPK;

//No need for @Respository, JPA already has it
public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK>  {//<OrderItem,Long> - ententy, primary key
    
}