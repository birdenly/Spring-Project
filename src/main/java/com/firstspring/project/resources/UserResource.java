package com.firstspring.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstspring.project.ententies.User;



@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping()
    public ResponseEntity<User> findAll(){

        User u = new User(1L, "maria", "maria@gmail", "99432423", "12345");
        return ResponseEntity.ok().body(u);
    }
}
