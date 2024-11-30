package com.example.rentalvideo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rentalvideo.models.User;
import com.example.rentalvideo.services.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	@Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody @Valid User user) {
        return userService.registerUser(user);
    }
}
