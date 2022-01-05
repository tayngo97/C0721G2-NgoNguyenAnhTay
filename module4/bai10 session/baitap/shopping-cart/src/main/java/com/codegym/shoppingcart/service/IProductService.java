package com.codegym.shoppingcart.service;

import com.codegym.shoppingcart.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
}
