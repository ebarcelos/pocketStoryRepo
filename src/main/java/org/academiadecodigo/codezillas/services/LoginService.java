package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    @Autowired
    private UserService userService;


    public boolean authenticate(User user){
        return userService.getUsers().containsKey(user.getUsername());
    }
}
