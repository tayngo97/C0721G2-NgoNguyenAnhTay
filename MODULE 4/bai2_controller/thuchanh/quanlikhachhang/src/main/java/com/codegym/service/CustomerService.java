package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> findAll();

    Customer findOne(int id);

    Customer save(Customer customer);

    List<Customer> save(List<Customer> customers);

    boolean exists(int id);

    List<Customer> findAll(List<Integer> ids);

    long count();

    void delete(int id);

    void delete(Customer customer);

    void delete(List<Customer> customers);

    void deleteAll();
}
