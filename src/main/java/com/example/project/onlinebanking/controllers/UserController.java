package com.example.project.onlinebanking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.onlinebanking.models.User;
import com.example.project.onlinebanking.repositories.UserRepoService;

@RestController("")
public class UserController {

    private final UserRepoService userRepoService;

    @Autowired
    public UserController(UserRepoService userRepoService){
        this.userRepoService = userRepoService;
    }
    
    @GetMapping(value = "/{id}", produces = "application/json")
    public User getUser(@PathVariable long id){
        return userRepoService.getUserById(id);
    }

    @PostMapping("/signup")
    public void createUser(@RequestBody User user){
        userRepoService.createUser(user);
    }
}
