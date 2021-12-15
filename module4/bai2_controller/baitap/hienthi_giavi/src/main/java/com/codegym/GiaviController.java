package com.codegym;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GiaviController {

    @GetMapping("")
    public String get(){
        return "giavi";
    }

    @PostMapping("/giavi1")
    public String getGiavi(@RequestParam String giavi, Model model){
        if (giavi == null){
            model.addAttribute("msg","Not found");
            return "giavi";
        }
        model.addAttribute("giavi1",giavi);
        return "giavi";
    }


}
