package com.example.furama.controller;


import com.example.furama.model.customer.Customer;
import com.example.furama.model.customer.CustomerType;
import com.example.furama.model.service.RentType;
import com.example.furama.model.service.ServiceType;
import com.example.furama.model.service.Services;
import com.example.furama.reponsitory.service.IRentTypeRepository;
import com.example.furama.reponsitory.service.ServiceTypeRepository;
import com.example.furama.service.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("service")
public class ServiceController {
    @Autowired
    private IServiceService iServiceService;

    @Autowired
    IRentTypeRepository iRentTypeRepository;

    @Autowired
    ServiceTypeRepository serviceTypeRepository;

    @ModelAttribute("rentType")
    public Iterable<RentType> rentTypes() {
        return iRentTypeRepository.findAll();
    }

    @ModelAttribute("serviceType")
    public Iterable<ServiceType> serviceTypes() {
        return serviceTypeRepository.findAll();
    }

    @GetMapping("")
    public String show(Model model){
        model.addAttribute("services",this.iServiceService.findAll());
        return "service/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("services", new Services());
        return "service/create";
    }

    @PostMapping("/save")
    public String luu(@ModelAttribute("services") Services services, Model model,
                      RedirectAttributes redirectAttributes){
        iServiceService.save(services);
        redirectAttributes.addFlashAttribute("msg","Add new successful");
        return "redirect:/service/";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("services") Services services, Model model,
                      RedirectAttributes redirectAttributes){
        iServiceService.save(services);
        redirectAttributes.addFlashAttribute("msg","Edit successful");
        return "redirect:/service/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") Integer id, Model model) {
        System.out.println(id);
        model.addAttribute("service", iServiceService.findById(id).get());
        return "service/detail";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("service", iServiceService.findById(id).get());
        return "service/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("service") Services services, Model model) {
        iServiceService.remove(services.getId());
        return "redirect:/service/";
    }

    @PostMapping("search")
    public String search(@RequestParam("name") String name, Model model) {
        List<Services> services = iServiceService.searchByName(name);
        if (services.size() == 0) {
            model.addAttribute("msg", "Not found");
        } else {
            model.addAttribute("services", services);
            model.addAttribute("msg", "Result : " + services.size() + " customer");
        }
        return "service/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("service", iServiceService.findById(id));
        return "service/edit";
    }



//    @PostMapping("/save1")
//    public String luu(@ModelAttribute("services")Services services,Model model) {
//        iServiceService.save(services);
//        model.addAttribute("msg","Add new successful");
//        return "service/list";
//    }
}
