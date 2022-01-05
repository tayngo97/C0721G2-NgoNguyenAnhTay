package com.example.furama.reponsitory.customer;

import com.example.furama.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {

    List<Customer> findByNameContaining(String name);

    Page<Customer> findCustomerByNameContaining(String name, Pageable pageable);

}
