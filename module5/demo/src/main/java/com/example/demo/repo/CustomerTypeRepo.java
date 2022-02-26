package com.example.demo.repo;

import com.example.demo.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepo extends JpaRepository<CustomerType,Integer> {
}
