package com.example.demo.bean;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.util.Date;

@Entity
public class MaSuatChieu implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @ManyToOne
//    @JoinColumn(name="customer_type_id")
//    private CustomerType type_id;

    private String maSuatChieu;

    //    @Future(message = "Ngày chiếu phải sau ngày hiện tại")
    private String ngayChieu;

    private int soLuongVe;

    @ManyToOne
    @JoinColumn(name = "phim_chieu")
    private PhimChieu phimChieu;

    public MaSuatChieu() {
    }

    public MaSuatChieu(Integer id, String maSuatChieu, String ngayChieu, int soLuongVe, PhimChieu phimChieu) {
        this.id = id;
        this.maSuatChieu = maSuatChieu;
        this.ngayChieu = ngayChieu;
        this.soLuongVe = soLuongVe;
        this.phimChieu = phimChieu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaSuatChieu() {
        return maSuatChieu;
    }

    public void setMaSuatChieu(String maSuatChieu) {
        this.maSuatChieu = maSuatChieu;
    }

    public String getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(String ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public int getSoLuongVe() {
        return soLuongVe;
    }

    public void setSoLuongVe(int soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    public PhimChieu getPhimChieu() {
        return phimChieu;
    }

    public void setPhimChieu(PhimChieu phimChieu) {
        this.phimChieu = phimChieu;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        MaSuatChieu maSuatChieu = (MaSuatChieu) target;

        if (maSuatChieu.maSuatChieu.equals("")) {
            errors.rejectValue("maSuatChieu", "maSuatChieu.null");
        } else if (!maSuatChieu.maSuatChieu.matches("^[C][I][-][\\d]{4}$")) {
            errors.rejectValue("maSuatChieu", "maSuatChieu.err");
        }

        if (maSuatChieu.soLuongVe < 0) {
            errors.rejectValue("soLuongVe", "soluongve");
        }
    }
}
