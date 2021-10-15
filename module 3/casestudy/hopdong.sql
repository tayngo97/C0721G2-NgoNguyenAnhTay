use furama_database;

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