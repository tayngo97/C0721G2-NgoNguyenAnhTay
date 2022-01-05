package com.example.furama.service.customer;


import com.example.furama.model.service.Services;
import com.example.furama.reponsitory.service.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class UseService implements IService {
    @Autowired
    ServiceRepository serviceReposi;


    @Override
    public Iterable<Services> findAll() {
        return null;
    }

    @Override
    public Optional<Services> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Object save(Services service) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<Services> searchByName(String name) {
        return null;
    }

    @Override
    public Page<Services> findCustomerByName(String name, Pageable pageable) {
        return null;
    }
}
