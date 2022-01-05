package com.example.furama.controller;


import com.example.furama.model.customer.Customer;
import com.example.furama.model.customer.CustomerType;
import com.example.furama.service.customer.ICustomerService;
import com.example.furama.service.customer.ICustomerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @Autowired
    ICustomerType customerType;

    @ModelAttribute("customerType")
    public Iterable<CustomerType> customerType() {
        return customerType.findAll();
    }

    @GetMapping("/customer")
    public String show(Optional<String> name,
                       Model model,
                       @PageableDefault(size = 12) Pageable pageable) {
        if (!name.isPresent()){
            Iterable<Customer> customers = customerService.findAllCustomer(pageable);
            model.addAttribute("customer", customers);
        } else  model.addAttribute("customer",customerService.findCustomerByName(name.get(),pageable));
        return "customer/list_customer";
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/create1";
    }

    @PostMapping("save")
    public String save(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model) {
        new Customer().validate(customer, bindingResult);
        System.out.println(customer);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerType", customerType.findAll());
            return "customer/create1";
        } else customerService.save(customer);
        return "redirect:/customer";
    }


    @GetMapping("customer/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "customer/edit1";
    }

    @GetMapping("customer/{id}/view")
    public String view(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id).get());
        return "customer/detail1";
    }

    @GetMapping("customer/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id).get());
        return "customer/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("customer") Customer customer, Model model) {
        customerService.remove(customer.getId());
        return  "redirect:/customer";
    }

}
