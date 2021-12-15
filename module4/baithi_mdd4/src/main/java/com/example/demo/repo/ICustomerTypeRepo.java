package com.example.demo.repo;

import com.example.demo.bean.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepo extends JpaRepository<CustomerType,Integer> {


}
