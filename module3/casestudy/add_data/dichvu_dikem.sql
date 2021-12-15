drop database if exists furama_database;
create database furama_database;
use furama_database;

create table DichVuDiKem(
IDDichVuDiKem int primary key auto_increment,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45)
);

create table HopDongChiTiet(
IDHopDongChiTiet int primary key,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int,
constraint pk_IDHopdong foreign key (IDHopDong) references hopdong(IDHopDong),
constraint pk_IDDichVuDiKem foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);