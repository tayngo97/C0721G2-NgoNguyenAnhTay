package com.codegym.model;

import org.springframework.stereotype.Service;

@Service
public class ToKhaiYTe {
    private String hoTen;
    private String NamSinh;
    private String gender;
    private String quocTich;
    private String soHoChieu;
    private String thongTinDiLai;
    private String ngayKH;
    private String ngayKT;

    private String thanhpho;
    private String quan;
    private String xa;

    private String trieuChung;
    private String lichSuPhoiNhiem;

    public ToKhaiYTe() {
    }

    public ToKhaiYTe(String hoTen, String namSinh, String gender, String quocTich, String soHoChieu, String thongTinDiLai, String ngayKH, String ngayKT, String thanhpho, String quan, String xa, String trieuChung, String lichSuPhoiNhiem) {
        this.hoTen = hoTen;
        NamSinh = namSinh;
        this.gender = gender;
        this.quocTich = quocTich;
        this.soHoChieu = soHoChieu;
        this.thongTinDiLai = thongTinDiLai;
        this.ngayKH = ngayKH;
        this.ngayKT = ngayKT;
        this.thanhpho = thanhpho;
        this.quan = quan;
        this.xa = xa;
        this.trieuChung = trieuChung;
        this.lichSuPhoiNhiem = lichSuPhoiNhiem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String namSinh) {
        NamSinh = namSinh;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getThongTinDiLai() {
        return thongTinDiLai;
    }

    public void setThongTinDiLai(String thongTinDiLai) {
        this.thongTinDiLai = thongTinDiLai;
    }

    public String getNgayKH() {
        return ngayKH;
    }

    public void setNgayKH(String ngayKH) {
        this.ngayKH = ngayKH;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public String getLichSuPhoiNhiem() {
        return lichSuPhoiNhiem;
    }

    public void setLichSuPhoiNhiem(String lichSuPhoiNhiem) {
        this.lichSuPhoiNhiem = lichSuPhoiNhiem;
    }
}
