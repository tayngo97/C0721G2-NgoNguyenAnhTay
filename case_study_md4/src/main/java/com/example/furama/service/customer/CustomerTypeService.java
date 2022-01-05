package com.example.furama.service.customer;

import com.example.furama.model.customer.CustomerType;
import com.example.furama.reponsitory.customer.CustomerTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTypeService implements ICustomerType{
    @Autowired
    private CustomerTypeRepo customerTypeRepo;

    @Override
    public Iterable<CustomerType> findAll() {
        return customerTypeRepo.findAll();
    }

    @Override
    public Optional<CustomerType> findById(Integer id) {
        return customerTypeRepo.findById(id);
    }

    @Override
    public Object save(CustomerType customerType) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<CustomerType> searchByName(String name) {
        return null;
    }

    @Override
    public Page<CustomerType> findCustomerByName(String name, Pageable pageable) {
        return null;
    }
}
