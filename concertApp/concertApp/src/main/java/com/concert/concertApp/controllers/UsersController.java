package com.concert.concertApp.controllers;

import com.concert.concertApp.entities.User;
import com.concert.concertApp.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UsersController {

    private UserRepository userRepo;

    UsersController(UserRepository userRepository){
        userRepo = userRepository;
    }

    @GetMapping("/fetch")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/fetch/email")
    public User getUserByEmail(String email) {
        return userRepo.fetchByEmail(email);
    }

}
