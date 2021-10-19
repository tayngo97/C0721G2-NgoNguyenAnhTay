drop database if exists furama_database;
create database furama_database;
use furama_database;

create table vitri(
id_vitri int primary key auto_increment,
ten_vitri varchar(50)
);

create table trinhdo(
id_trinhdo int primary key auto_increment,
ten_trinhdo varchar(50)
);

create table bophan(
id_bophan int primary key auto_increment,
ten_bophan varchar(50)
);
create table nhanvien(
id_nhanvien int primary key auto_increment,
hoten varchar(50) not null,
id_vitri int not null,
id_trinhdo int not null,
id_bophan int not null,
ngaysinh date not null,
so_cmnd int not null,
luong int not null,
sdt int not null,
email varchar(50)not null,
diachi varchar(50)not null,
constraint pk_id_vitri foreign key(id_vitri) references vitri(id_vitri),
constraint pk_id_trinhdo foreign key(id_trinhdo) references trinhdo(id_trinhdo),
constraint pk_id_bophan foreign key(id_bophan) references bophan(id_bophan)
);

create table loaikhach(
id_loaikhach int primary key auto_increment,
ten_loaikhach varchar(45)
);

create table khachhang(
id_khachhang int primary key auto_increment,
id_loaikhach int not null,
hoten varchar(45) not null,
ngaysinh date,
so_cmnd int,
sdt int,
email varchar(50),
diachi varchar(50),
constraint pk_id_loaikhach foreign key(id_loaikhach) references loaikhach(id_loaikhach)
);

create table kieuthue(
id_kieuthue int primary key auto_increment,
ten_kieuthue varchar(45),
gia int
);

create table loaidichvu(
id_loaidichvu int primary key auto_increment,
ten_loaidichvu varchar(45)
);

create table dichvu(
id_dichvu int primary key auto_increment,
ten_dichvu varchar(45),
dientich int,
sotang int,
songuoi_toida varchar(45),
chiphi_thue varchar(45),
id_kieuthue int,
id_loaidichvu int,
trangthai varchar(45),
constraint pk_id_kieuthue1 foreign key (id_kieuthue) references kieuthue (id_kieuthue),
constraint pk_id_loaidichvu foreign key (id_loaidichvu) references loaidichvu(id_loaidichvu)
);


create table hopdong(
id_hopdong int primary key auto_increment,
id_nhanvien int,
id_khachhang int,
id_dichvu int,
ngaylam_hopdong date,
ngay_ketthuc date,
tien_datcoc int,
constraint pk_id_nhanvien foreign key(id_nhanvien) references nhanvien(id_nhanvien) on delete set null,
constraint pk_IDkhachang foreign key(id_khachhang) references khachhang(id_khachhang) on delete set null,
constraint pk_id_dichvu foreign key(id_dichvu) references dichvu(id_dichvu)on delete set null
);

create table dichvu_dikem(
id_dichvu_dikem int primary key auto_increment,
ten_dichvu_dikem varchar(45),
gia int,
donvi int,
trangthai_khadung varchar(45)
);

create table hopdong_chititet(
-- id_hopdong_chititet int primary key auto_increment,
id_hopdong int,
id_dichvu_dikem int,
soluong int,
primary key (id_hopdong,id_dichvu_dikem),
constraint pk_id_hopdong foreign key (id_hopdong) references hopdong(id_hopdong),
constraint pk_id_dichvu_dikem foreign key (id_dichvu_dikem) references dichvu_dikem(id_dichvu_dikem)
);