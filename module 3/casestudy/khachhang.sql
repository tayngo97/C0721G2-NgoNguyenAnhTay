use furama_database;

create table loaikhach(
IDloaikhach int primary key auto_increment,
TenLoaiKhach varchar(45)
);

create table khachhang(
IDKhachHang int primary key,
IDLoaiKhach int not null,
HoTen varchar(45) not null,
NgaySinh date,
SoCMND int,
Sdt int,
Email varchar(50),
Diachi varchar(50),
constraint pk_IDloaikhach foreign key(IDLoaiKhach) references loaikhach(IDloaikhach)
);
