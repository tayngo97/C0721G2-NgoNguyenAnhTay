package com.codegym.controller;

import com.codegym.model.ToKhaiYTe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToKhaiYteController {
    @GetMapping("/show")
    public String show(Model model){
        String[] gender = {"Nam","Nu"};
        String[] quoctich = {"Vietnam","Lao","Campuchia"};
        String[] thongTinDiLai = {"Tau bay","Tau Thuyen","O to","Khac"};
        String[] namSinh = {"1990","1991","1992","1993"};
        String[] thanhPho = {"Đa nang","Quang nam","Hue","Quang tri"};
        String[] quan = {"Ngu Hanh son","Lien chieu","Son tra","Cam le"};
        String[] xa = {"My An","Hoa hai","Khue my"};


        model.addAttribute("xa",xa);
        model.addAttribute("quan",quan);
        model.addAttribute("thanhPho",thanhPho);
        model.addAttribute("namSinh",namSinh);
        model.addAttribute("gender",gender);
        model.addAttribute("quoctich",quoctich);
        model.addAttribute("thongTinDiLai",thongTinDiLai);
        model.addAttribute("tokhaiyte",new ToKhaiYTe());
        return "show";
    }
}
