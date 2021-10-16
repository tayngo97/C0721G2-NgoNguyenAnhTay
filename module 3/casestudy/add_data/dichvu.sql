drop database if exists furama_database;
create database furama_database;
use furama_database;

create table kieuthue(
IDKieuThue int primary key auto_increment,
TenKieuThue varchar(45),
Gia int
);

create table loaidichvu(
IdLoaiDichVu int primary key auto_increment,
TenLoaiDichVu varchar(45)
);

create table DichVu(
IDDichVu int primary key auto_increment,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IdKieuThue int,
IdLoaiDichVu int,
TrangThai varchar(45),
 foreign key (IdKieuThue) references kieuthue (IDKieuThue),
constraint pk_IDloaidichvu foreign key (IdLoaiDichVu) references loaidichvu(IdLoaiDichVu)
);

