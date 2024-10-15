package com.firstspring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstspring.project.ententies.User;

public interface UserRepository extends JpaRepository<User,Long>  {//<User,Long> - ententy, primary key
    
}