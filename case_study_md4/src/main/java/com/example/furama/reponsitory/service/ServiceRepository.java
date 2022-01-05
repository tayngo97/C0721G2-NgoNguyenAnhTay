package com.example.furama.reponsitory.service;

import com.example.furama.model.service.Services;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends PagingAndSortingRepository<Services,Integer> {

    List<Services> findByServiceNameContaining(String name);
}
