package com.example.securelogin.controller;

import com.example.securelogin.model.User;
import com.example.securelogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.PostConstruct;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostConstruct
    public void createUser() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin123");
        userService.save(user);
    }
}
