package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody UserDto user) {
        userService.registerUser(user.getUsername(), user.getPassword(),user.getEmail());
    }

    @PostMapping("/login")
    public void login(@RequestBody UserDto user) {
        userService.verifyUser(user.getEmail(), user.getPassword());
    }



}
