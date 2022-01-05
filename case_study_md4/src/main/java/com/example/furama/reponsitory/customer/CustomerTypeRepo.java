package com.example.furama.reponsitory.customer;

import com.example.furama.model.customer.CustomerType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypeRepo extends PagingAndSortingRepository<CustomerType,Integer> {

}
