package com.example.demo.service;

import com.example.demo.bean.MaSuatChieu;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;


public interface IMaSuatChieuService {
    Iterable<MaSuatChieu> findAll();

    Optional<MaSuatChieu> findById(Integer id);

    void save(MaSuatChieu t);

    void remove(Integer id);

    List<MaSuatChieu> searchByName(String name);

    Page<MaSuatChieu> findMasuatChieuByName(String name);

    List<MaSuatChieu> findMaSuatChieuByNgayChieu(String name);

}
