package com.example.demo.resource;


import com.example.demo.model.CustomerType;
import com.example.demo.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/customertype")
public class CustomerTypeResource {

    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping("/all")
    public ResponseEntity<List<CustomerType>> getAllCustomers () {
        List<CustomerType> customers = customerTypeService.findAllCustomerTypes();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}
