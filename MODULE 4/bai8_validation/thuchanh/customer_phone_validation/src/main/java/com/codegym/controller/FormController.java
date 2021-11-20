package com.codegym.controller;

import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller(value = "form_")
public class FormController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/")
    public String checkValidation(@Valid @ModelAttribute("user") User user,Model model,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/index";
        } else model.addAttribute("user", user);
        return "/result";
    }

}
