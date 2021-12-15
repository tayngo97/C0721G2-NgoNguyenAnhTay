package com.example.demo.service.impl;

import com.example.demo.bean.Customer;
import com.example.demo.repo.ICustomerRepo;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepo iCustomerRepo;

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return iCustomerRepo.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepo.save(customer);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return iCustomerRepo.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iCustomerRepo.deleteById(id);
    }

    public Page<Customer> findByKeyWord(String keyword,Pageable pageable){
        return iCustomerRepo.findByKeyWord(keyword,pageable);
    }

    @Override
    public List<Customer> findCustomersWithSorting(String field) {
        return iCustomerRepo.findAll(Sort.by(field));
    }
}
