package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {


    private Map<String, User> users;

    public Map<String, User> getUsers() {
        return users;
    }
    private UserService userController;

    public LoginService(){
        init();
    }

    private void init() {
        users = new HashMap<>();
        User user = new User();
        user.setUsername("tiago");
        user.setNickname("Tiaguimm");
        user.setPassword("0000");

        User user1 = new User();
        user1.setUsername("Mox");
        user1.setNickname("BiggusDickus");
        user1.setPassword("111");

        User user2 = new User();
        user2.setUsername("Tomas");
        user2.setNickname("Marandi");
        user2.setPassword("000");

        users.put(user.getUsername(),user);
        users.put(user1.getUsername(),user1);
        users.put(user2.getUsername(),user2);
    }

    public boolean authenticate(User user){
        return users.containsKey(user.getUsername());
    }
}
