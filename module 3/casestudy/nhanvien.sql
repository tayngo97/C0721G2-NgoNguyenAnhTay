drop database if exists furama_database;
create database furama_database;
use furama_database;

create table ViTri(
IDViTri int primary key auto_increment,
TenViTri varchar(50)
);

create table TrinhDo(
IDTrinhDo int primary key auto_increment,
TenTrinhDo varchar(50)
);

create table BoPhan(
IDBoPhan int primary key auto_increment,
TenBoPhan varchar(50)
);
create table NhanVien(
IDNhanVien int primary key,
HoTen varchar(50) not null,
IDViTri int not null,
IDTrinhDo int not null,
IDBoPhan int not null,
NgaySinh date not null,
SoCMND int not null,
luong int not null,
Sdt int not null,
Email varchar(50)not null,
DiaChi varchar(50)not null,
constraint pk_IDvitri foreign key(IDViTri) references ViTri(IDViTri),
constraint pk_IDtrinhdo foreign key(IDTrinhDo) references TrinhDo(IDTrinhDo),
constraint pk_IDbophan foreign key(IDBoPhan) references BoPhan(IDBoPhan)
);

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
IDKieuThue int,
IdLoaiDichVu int,
TrangThai varchar(45),
constraint pk_IDkieuthue1 foreign key (IDKieuThue) references kieuthue (IDKieuThue),
constraint pk_IDloaidichvu foreign key (IdLoaiDichVu) references loaidichvu(IdLoaiDichVu)
);

create table hopdong(
IDHopDong int primary key ,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc int,
TienDatCoc int,
TongTien int,
constraint pk_IDnhanvien foreign key(IDNhanVien) references NhanVien(IDNhanVien),
constraint pk_IDkhachang foreign key(IDKhachHang) references khachhang(IDKhachHang),
constraint pk_IDdichvu foreign key(IDDichVu) references DichVu(IDDichVu)
);

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