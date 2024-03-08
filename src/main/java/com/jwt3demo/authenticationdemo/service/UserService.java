package com.jwt3demo.authenticationdemo.service;

import com.jwt3demo.authenticationdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService(){
        userList.add(new User(UUID.randomUUID().toString(),"Shashikant", "Shashi@abc"));
        userList.add(new User(UUID.randomUUID().toString(),"Ahiransh", "Ahi@abc"));
        userList.add(new User(UUID.randomUUID().toString(),"Rachna", "Rachna@abc"));
        userList.add(new User(UUID.randomUUID().toString(),"Deva", "Deva@abc"));
    }

    public List<User> getAllUsers(){
        return this.userList;
    }


}
