package com.codegym.demo_springboot.repository;


import com.codegym.demo_springboot.bean.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepository extends JpaRepository<Province,Long> {
}
