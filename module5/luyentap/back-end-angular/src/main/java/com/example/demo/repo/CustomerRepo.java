package com.example.demo.repo;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    void deleteCustomerById(Integer id);

    Optional<Customer> findCustomerById(Integer id);
}
