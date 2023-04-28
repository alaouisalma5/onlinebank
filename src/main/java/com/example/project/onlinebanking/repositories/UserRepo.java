package com.example.project.onlinebanking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.onlinebanking.models.User;

public interface UserRepo extends JpaRepository<User,Long> {
    
}
