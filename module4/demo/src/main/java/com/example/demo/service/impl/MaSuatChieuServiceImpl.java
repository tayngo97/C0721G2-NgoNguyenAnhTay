package com.example.demo.service.impl;

import com.example.demo.bean.MaSuatChieu;
import com.example.demo.repo.IMaSuatChieuRepository;
import com.example.demo.service.IMaSuatChieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaSuatChieuServiceImpl implements IMaSuatChieuService {
    @Autowired
    IMaSuatChieuRepository iMaSuatChieuRepository;

    @Override
    public Iterable<MaSuatChieu> findAll() {
        return iMaSuatChieuRepository.findAll();
    }

    @Override
    public Optional<MaSuatChieu> findById(Integer id) {
        return iMaSuatChieuRepository.findById(id);
    }

    @Override
    public void save(MaSuatChieu t) {
        iMaSuatChieuRepository.save(t);
    }

    @Override
    public void remove(Integer id) {
        iMaSuatChieuRepository.deleteById(id);
    }

    @Override
    public List<MaSuatChieu> searchByName(String name) {
        return null;
    }

    @Override
    public Page<MaSuatChieu> findMasuatChieuByName(String name) {
        return null;
    }

    @Override
    public List<MaSuatChieu> findMaSuatChieuByNgayChieu(String name) {
        return iMaSuatChieuRepository.findMaSuatChieuByNgayChieu(name);
    }
}
