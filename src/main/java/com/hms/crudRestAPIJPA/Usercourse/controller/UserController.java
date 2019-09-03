package com.hms.crudRestAPIJPA.Usercourse.controller;

import com.hms.crudRestAPIJPA.Usercourse.domain.User;
import com.hms.crudRestAPIJPA.Usercourse.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserDao repository;

    // Get All Users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    //Get User By id
    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable(value = "id") Long userId) {
        return repository.findById(userId);
    }

    // Create a new Note
    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return repository.save(user);
    }

    // Update a Note
    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable(value = "id") Long userId ) {

        Optional<User> user = repository.findById(userId);
        return repository.delete( User user);
    }

}
