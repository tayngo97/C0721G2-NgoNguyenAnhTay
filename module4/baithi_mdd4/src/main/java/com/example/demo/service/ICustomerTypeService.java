package com.example.demo.service;

import com.example.demo.bean.Customer;
import com.example.demo.bean.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
