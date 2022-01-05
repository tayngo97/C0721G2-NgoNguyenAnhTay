package com.example.furama.service.service;


import com.example.furama.model.service.Services;
import com.example.furama.reponsitory.service.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceServiceImpl implements IServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public Iterable<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<Services> findById(Integer id) {
        return this.serviceRepository.findById(id);
    }

    @Override
    public Services save(Services services) {
        return serviceRepository.save(services);
    }

    @Override
    public void remove(Integer id) {
        this.serviceRepository.deleteById(id);
    }

    @Override
    public List<Services> searchByName(String name) {
        return serviceRepository.findByServiceNameContaining(name);
    }

    @Override
    public Page<Services> findCustomerByName(String name, Pageable pageable) {
        return null;
    }
}
