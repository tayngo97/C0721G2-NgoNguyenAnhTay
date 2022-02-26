package com.example.demo.service;

import com.example.demo.model.CustomerType;
import com.example.demo.repo.CustomerTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService {
    @Autowired
    private CustomerTypeRepo customerTypeRepo;

    public List<CustomerType> findAllCustomerTypes() {
        return customerTypeRepo.findAll();
    }
}
