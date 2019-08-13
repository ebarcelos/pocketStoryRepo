package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    private Map<String, User> users;


    public Map<String, User> getUsers() {
        return users;
    }
}
