package org.academiadecodigo.codezillas.controller;

import org.academiadecodigo.codezillas.model.User;
import org.academiadecodigo.codezillas.services.LoginService;
import org.academiadecodigo.codezillas.services.StoryService;
import org.academiadecodigo.codezillas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SessionAttributes("user")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private StoryService storyService;
    @Autowired
    private UserService userService;


    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String loginPage(Model model) {
        model.addAttribute("user", new User());


        return "login";
    }

    @ModelAttribute("user")
    public User stUpUser(User user){
        return user;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login/verify" ,params = "action=save")
    public String loginVerify(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes){

        if (loginService.authenticate(user)){

            User realUser =userService.getUsers().get(user.getUsername());
            stUpUser(realUser);
            redirectAttributes.addFlashAttribute(realUser);
            return "redirect:/user/storyboard";
        }

            return "redirect:/user/login";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/storyboard")
    public String homePage(@SessionAttribute("user") User user, Model model){
        if(user.getUsername() == null){
            return "redirect:/user/login";
        }
        return "storyboard";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/logout")
    public String logout(){
        stUpUser(null);
        return "redirect:/user/login";
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{user}/profile")
    public String profilePage(@SessionAttribute("user") User user){

        return "profile";
    }


}
