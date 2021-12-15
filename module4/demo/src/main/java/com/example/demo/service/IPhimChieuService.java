package com.example.demo.service;

import com.example.demo.bean.MaSuatChieu;
import com.example.demo.bean.PhimChieu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IPhimChieuService {
    Iterable<PhimChieu> findAll();

    Optional<PhimChieu> findById(Integer id);

    Object save(PhimChieu t);

    void remove(Integer id);

    List<PhimChieu> searchByName(String name);

    Page<PhimChieu> findMasuatChieuByName(String name, Pageable pageable);
}
