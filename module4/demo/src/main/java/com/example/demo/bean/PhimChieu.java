package com.example.demo.bean;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class PhimChieu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @ManyToOne
//    @JoinColumn(name="customer_type_id")
//    private CustomerType type_id;


    private String tenPhimChieu;

    @OneToMany(targetEntity = MaSuatChieu.class, mappedBy = "phimChieu")
    private List<MaSuatChieu> maSuatChieus;

    public PhimChieu() {
    }

    public PhimChieu(Integer id, String tenPhimChieu, List<MaSuatChieu> maSuatChieus) {
        this.id = id;
        this.tenPhimChieu = tenPhimChieu;
        this.maSuatChieus = maSuatChieus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenPhimChieu() {
        return tenPhimChieu;
    }

    public void setTenPhimChieu(String tenPhimChieu) {
        this.tenPhimChieu = tenPhimChieu;
    }

    public List<MaSuatChieu> getMaSuatChieus() {
        return maSuatChieus;
    }

    public void setMaSuatChieus(List<MaSuatChieu> maSuatChieus) {
        this.maSuatChieus = maSuatChieus;
    }
}
