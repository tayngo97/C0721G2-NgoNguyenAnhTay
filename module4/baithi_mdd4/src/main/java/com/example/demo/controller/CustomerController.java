package com.example.demo.controller;

import com.example.demo.bean.Customer;
import com.example.demo.bean.CustomerType;
import com.example.demo.service.ICustomerService;
import com.example.demo.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerServicel;

    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @ModelAttribute("customer_type")
    private List<CustomerType> customerTypes() {
        return iCustomerTypeService.findAll();
    }

    @GetMapping("")
    public String show(String keyword, Model model, Pageable pageable) {
        if (keyword != null) {
            model.addAttribute("customers", iCustomerServicel.findByKeyWord(keyword, pageable));
        } else model.addAttribute("customers", iCustomerServicel.findAllCustomer(pageable));
        return "customer/list";
    }


    @GetMapping("create")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping("save")
    public String save(@ModelAttribute("customer") Customer customer) {
        this.iCustomerServicel.save(customer);
        return "redirect:/customer/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", iCustomerServicel.findById(id).get());
        return "customer/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("customer") Customer customer) {
        iCustomerServicel.remove(customer.getId());
        return "redirect:/customer/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("customer", iCustomerServicel.findById(id).get());
        return "customer/detail";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", iCustomerServicel.findById(id));
        return "customer/edit";
    }

}
