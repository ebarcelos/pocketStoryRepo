package org.academiadecodigo.codezillas.controller;

import org.academiadecodigo.codezillas.services.LoginService;
import org.academiadecodigo.codezillas.services.StoryService;
import org.academiadecodigo.codezillas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private StoryService storyService;
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = {"/list"})
    public String listStories(Model model) {
        model.addAttribute("customers", userService.getUsers());
        return "userList ";
    }

}
