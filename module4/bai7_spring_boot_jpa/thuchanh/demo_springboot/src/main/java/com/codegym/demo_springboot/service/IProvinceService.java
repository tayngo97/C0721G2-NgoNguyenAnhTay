package com.codegym.demo_springboot.service;

import com.codegym.demo_springboot.bean.Province;

import java.util.Optional;

public interface IProvinceService {
    Iterable<Province> findAll();
    Optional<Province> findById(Long id);
    void save(Province province);
    void remove(Long id);
}
