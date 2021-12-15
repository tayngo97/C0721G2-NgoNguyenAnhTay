package com.example.demo.service;


import com.example.demo.bean.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAllCustomer(Pageable pageable);

    void save(Customer customer);

    Optional<Customer> findById(Integer id);

    void remove(Integer id);

     Page<Customer> findByKeyWord(String keyword,Pageable pageable);

     List<Customer> findCustomersWithSorting(String field);
}
