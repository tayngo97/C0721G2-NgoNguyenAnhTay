package com.codegym.controller;


import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "email/")
public class EmailController {


    @GetMapping("")
    public String show(Model model){
        String[] languages = new String[]{"English","Chinese","Japanese","Korean"};
        int[] pageSize = {5,10,15,25,50,100};
        boolean[] filter = {true,false};
        model.addAttribute("languages",languages);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("filter",filter);
        model.addAttribute("email",new Email());
       return "show";
    }

    @PostMapping("")
    public String update(@ModelAttribute("email") Email email,Model model){
        model.addAttribute("email",email);
        return "update";
    }

}
