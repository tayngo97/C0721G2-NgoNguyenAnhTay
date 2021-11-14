package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @PostMapping("")
    public String calculator(@RequestParam int amount,@RequestParam int rate, Model model) {
            int convert = amount * rate;
            model.addAttribute("convert",convert);
            return "index";
    }

    @GetMapping("")
    public String showGet(){
        return "index";
    }
}
