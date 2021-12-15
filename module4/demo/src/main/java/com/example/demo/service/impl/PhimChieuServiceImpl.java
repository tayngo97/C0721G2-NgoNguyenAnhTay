package com.example.demo.service.impl;


import com.example.demo.bean.PhimChieu;
import com.example.demo.repo.IPhimChieuRepository;
import com.example.demo.service.IPhimChieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhimChieuServiceImpl implements IPhimChieuService {
    @Autowired
    IPhimChieuRepository iPhimChieuRepository;

    @Override
    public Iterable<PhimChieu> findAll() {
        return iPhimChieuRepository.findAll();
    }

    @Override
    public Optional<PhimChieu> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Object save(PhimChieu t) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<PhimChieu> searchByName(String name) {
        return null;
    }

    @Override
    public Page<PhimChieu> findMasuatChieuByName(String name, Pageable pageable) {
        return null;
    }
}
