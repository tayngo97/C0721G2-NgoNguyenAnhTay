package com.example.furama;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IGeneral<T> {
    Iterable<T> findAll();

    Optional<T> findById(Integer id);

    Object save(T t);

    void remove(Integer id);

    List<T> searchByName(String name);

    Page<T> findCustomerByName(String name, Pageable pageable);

}
