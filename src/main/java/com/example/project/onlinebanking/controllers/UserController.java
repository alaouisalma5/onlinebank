package com.example.project.onlinebanking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import com.example.project.onlinebanking.models.User;
import com.example.project.onlinebanking.repositories.UserRepoService;

@Controller
public class UserController {

    private final UserRepoService userRepoService;

    @Autowired
    public UserController(UserRepoService userRepoService){
        this.userRepoService = userRepoService;
    }

    @RequestMapping("/getUser")
    public User getUser(){
        throw new UnsupportedOperationException("Not implemented");
    }

    @RequestMapping("/createUser")
    public void createUser(){
        throw new UnsupportedOperationException("Not implemented");
    }
}
