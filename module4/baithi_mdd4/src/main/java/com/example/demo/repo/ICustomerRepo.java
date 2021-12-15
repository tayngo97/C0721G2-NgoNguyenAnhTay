package com.example.demo.repo;

import com.example.demo.bean.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer,Integer> {

    @Query(value="select * from Customer c where c.name like %:keyword% or c.address like %:keyword%",nativeQuery=true)
    Page<Customer> findByKeyWord(@Param("keyword")String keyword, Pageable pageable);
}
