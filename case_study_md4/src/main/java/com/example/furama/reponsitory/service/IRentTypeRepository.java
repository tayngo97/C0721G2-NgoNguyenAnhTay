package com.example.furama.reponsitory.service;

import com.example.furama.model.service.RentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRentTypeRepository extends PagingAndSortingRepository<RentType,Integer> {
}
