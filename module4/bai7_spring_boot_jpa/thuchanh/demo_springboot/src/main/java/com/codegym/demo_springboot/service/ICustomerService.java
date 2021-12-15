package com.codegym.demo_springboot.service;

import com.codegym.demo_springboot.bean.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService extends IGeneralService<Customer>{
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
