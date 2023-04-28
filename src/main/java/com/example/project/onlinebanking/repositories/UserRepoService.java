package com.example.project.onlinebanking.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.onlinebanking.models.User;

@Service
public class UserRepoService{

    private final UserRepo userRepo;

    @Autowired
    public UserRepoService(UserRepo userRepo){
        this.userRepo = userRepo;
    }
    
    public User getUserById(Long id){
        return userRepo.getReferenceById(id);
    }

    public void createUser(User user){
        userRepo.save(user);
    }

}
