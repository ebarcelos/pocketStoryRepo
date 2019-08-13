package org.academiadecodigo.codezillas.controller;

import org.academiadecodigo.codezillas.model.User;
import org.academiadecodigo.codezillas.services.LoginService;
import org.academiadecodigo.codezillas.services.StoryService;
import org.academiadecodigo.codezillas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;

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

    @RequestMapping(method = RequestMethod.POST, path = "/login/verify" ,params = "action=save")
    public String login(@ModelAttribute("user") User user, Model model){

        if (loginService.authenticate(user)){
            model.addAttribute(user);
            return "redirect:/user/dashboard";
        }

            return "redirect:/user/login";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/dashboard")
    public String homePage(Model model){

        return "dashboard";

    }
}
