package com.jwt3demo.authenticationdemo.controller;

import com.jwt3demo.authenticationdemo.model.User;
import com.jwt3demo.authenticationdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
         List<User> allUsers = userService.getAllUsers();
         return allUsers;
    }

    @GetMapping("/getCurrentUser")
    public String getCurrentUser(Principal principal){
        return principal.getName();

    }
}
