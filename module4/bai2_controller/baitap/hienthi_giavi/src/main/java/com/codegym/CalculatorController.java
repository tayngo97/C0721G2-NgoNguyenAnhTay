package com.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String show(){
        return "calculator";
    }

    @PostMapping("/calculator1")
    public String showResult(@RequestParam int number1, @RequestParam int number2, @RequestParam String tinhtoan, Model model){
        int result = 0;
            switch (tinhtoan){
                case "cong": result = number1 + number2;break;
                case "tru": result = number1 - number2;break;
                case "nhan": result = number1 * number2;break;
                case "chia": result = number1 / number2;break;
            }
            model.addAttribute("number1",number1);
            model.addAttribute("number2",number2);
            model.addAttribute("result",result);
            return "calculator";
    }
}
