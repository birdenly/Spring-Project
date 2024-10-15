package com.firstspring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstspring.project.ententies.User;
//No need for @Respository, JPA is already has it
public interface UserRepository extends JpaRepository<User,Long>  {//<User,Long> - ententy, primary key
    
}