package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import com.codegym.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private UserService userService = new UserServiceImpl();

    @GetMapping("/user")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        return "/index";
    }

    @PostMapping("/validateUser")
    public String checkValid(@Validated @ModelAttribute("user") User user, BindingResult bindingResult,Model model){
        if (bindingResult.hasFieldErrors()){
            return "/index";
        }
        userService.save(user);
        model.addAttribute("user",user);
        return "/result";
    }
}
