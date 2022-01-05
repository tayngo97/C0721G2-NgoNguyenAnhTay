package com.example.furama.service.customer;

import com.example.furama.IGeneral;
import com.example.furama.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneral<Customer> {
    Page<Customer> findAllCustomer(Pageable pageable);
}
