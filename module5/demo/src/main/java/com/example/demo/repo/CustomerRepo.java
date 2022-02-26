package com.example.demo.repo;

import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    void deleteCustomerById(Integer id);

    Optional<Customer> findCustomerById(Integer id);

    @Query(value="select * from Customer q where q.ho_ten like %:keyword% or q.dia_chi like %:keyword% or q.so_dien_thoai like %:keyword% or q.email like %:keyword% or q.ngay_sinh like %:keyword% or q.ma_kh like %:keyword%",nativeQuery=true)
    List<Customer> findByKeyWord(@Param("keyword")String keyword);
}
