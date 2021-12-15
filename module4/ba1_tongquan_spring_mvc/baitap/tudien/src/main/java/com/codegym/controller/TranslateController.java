package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TranslateController {
    @PostMapping("")
    public String translate(@RequestParam String voca, Model model){
        String[] arr = {"Xin chao","Tam biet","Chao buoi sang"};
        String translateVoca = null;

        switch (voca){
            case "hello": translateVoca = arr[0]; break;
            case "goodbye": translateVoca = arr[1]; break;
            case "good morning": translateVoca = arr[2]; break;
            default: translateVoca = "not found";
        }

        model.addAttribute("englishVoca",translateVoca);
        return "index";
    }



    @GetMapping("")
    public String show(){
        return "index";
    }
}
