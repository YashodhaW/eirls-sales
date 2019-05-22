package com.yashodha.eirlssales.controller;

import com.yashodha.eirlssales.model.User;
import com.yashodha.eirlssales.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional getUser(@PathVariable int id) {
        return userRepo.findById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userRepo.save(user);

    }
}
