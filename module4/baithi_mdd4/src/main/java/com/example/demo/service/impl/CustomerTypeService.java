package com.example.demo.service.impl;

import com.example.demo.bean.Customer;
import com.example.demo.bean.CustomerType;
import com.example.demo.repo.ICustomerRepo;
import com.example.demo.repo.ICustomerTypeRepo;
import com.example.demo.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepo iCustomerTypeRepo;


    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepo.findAll();
    }
}
