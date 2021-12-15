package com.example.demo.controller;


import com.example.demo.bean.MaSuatChieu;
import com.example.demo.bean.PhimChieu;
import com.example.demo.service.IMaSuatChieuService;
import com.example.demo.service.IPhimChieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class MaSuatChieuController {
    @Autowired
    IMaSuatChieuService maSuatChieuService;

    @Autowired
    IPhimChieuService iPhimChieuService;

    @ModelAttribute("phimchieus")
    private Iterable<PhimChieu> phimChieus() {
        return iPhimChieuService.findAll();
    }

    @GetMapping("phimchieu")
    public String show(Model model) {
        model.addAttribute("masuatchieu", maSuatChieuService.findAll());
        return "list_phim";
    }

    @GetMapping("create")
    public String showCreate(Model model) {
        model.addAttribute("suatchieu", new MaSuatChieu());
        return "create";
    }

    @PostMapping("save")
    public String save(@ModelAttribute("suatchieu") MaSuatChieu maSuatChieu, BindingResult bindingResult, Model model) {
        new MaSuatChieu().validate(maSuatChieu, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("phimchieus", iPhimChieuService.findAll());
            return "create";
        } else maSuatChieuService.save(maSuatChieu);
        return "redirect:/phimchieu";
    }

    @GetMapping("phimchieu/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("masuatchieus", maSuatChieuService.findById(id).get());
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("masuatchieus") MaSuatChieu maSuatChieu) {
        maSuatChieuService.remove(maSuatChieu.getId());
        return "redirect:/phimchieu";
    }

}
