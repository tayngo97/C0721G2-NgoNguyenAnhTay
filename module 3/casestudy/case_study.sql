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
IDNhanVien int primary key auto_increment,
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
IDKhachHang int primary key auto_increment,
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
IDHopDong int primary key auto_increment,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
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
IDHopDongChiTiet int primary key auto_increment,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int,
-- primary key (IDHopDong,IDDichVuDiKem),
constraint pk_IDHopdong foreign key (IDHopDong) references hopdong(IDHopDong),
constraint pk_IDDichVuDiKem foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);

-- Task1 	Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn các yêu cầu bên dưới.
-- Thêm mới vị trí nhân viên
insert into ViTri(TenViTri)
values ('Le Tan'),('Phuc Vu'),('Chuyen Vien'),('Giam Sat'),('Quan Ly'),('Giam Doc');

-- Thêm mới bộ phận nhân viên
insert into BoPhan(TenBoPhan)
values ('Sale – Marketing'),('Hành Chính'), ('Phục vụ'),('Quản lý');

-- Thêm mới bộ phận nhân viên
insert into TrinhDo(TenTrinhDo)
values ('Trung cấp'),('Cao đẳng'),('Đại học '),('Sau đại học');


-- Thêm mới nhân viên
insert into NhanVien(HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,luong,Sdt,Email,DiaChi)
values ('Nam',1,1,3,'2020-10-10',202011,100000,090604012,'Nam@gmail.com','DN'),
('Lan',2,1,2,'1992-5-10',202011,100000,090604012,'Lan@gmail.com','QN'),
('Trinh',1,1,3,'1995-2-10',202011,100000,090604012,'Trinh@gmail.com','DN');


-- Thêm mới loại khách
insert into loaikhach(TenLoaiKhach)
values('Diamond'),('Platinium'),('Gold'),('Silver'),('Member');

-- Thêm mới khách hàng
insert into khachhang(IDLoaiKhach,HoTen,NgaySinh,SoCMND,Sdt,Email,DiaChi)
values(1,'Nhan','1995-10-09',102021,09021231,'Long@gmail.com','DN'),
(1,'Tien','1992-05-09',102021,09021231,'Hoa@gmail.com','HN'),
(1,'Truong','1995-10-09',102021,09021231,'LY@gmail.com','QN');

-- Thêm mới dịch vụ đi kèm
insert into dichvudikem(TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung)
values ('Massage',10000,1,'San Sang'), 
('Karaoke',20000,1,'San Sang'), 
('Thức ăn',50000,1,'San Sang'),
 ('Nước uống',5000,1,'San Sang'),
 ('Xe tham quan',100000,1,'San Sang');

-- Thêm mới kiểu thuê
insert into kieuthue(TenKieuThue,Gia)
values('Thuê Năm',100000),('Thuê Tháng',50000),('Thuê Ngày',1500),('Thuê Giờ',200);

-- Thêm mới dịch vụ
insert into dichvu(TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IdLoaiDichVu,TrangThai)
values('Villa',50,4,3,10000,1,null,'Ready'),
('House',40,5,2,5000,2,null,'Ready'),
('Room',20,4,3,600,4,null,'Ready');

-- Thêm mới hợp đồng
insert into hopdong(IDNhanVien,IDKhachHang,IDDichVu,NgayLamHopDong,NgayKetThuc,TienDatCoc)
values
(1,2,1,'2020-10-2','2020-10-10',2000000),
(2,3,2,'2021-10-2','2021-10-10',4000000),
(3,1,1,'2019-5-2','2019-5-30',7000000),
(1,2,2,'2020-10-2','2020-10-10',2000000);

-- Thêm mới hợp đồng chi tiết 
insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,SoLuong)
values 
(4,2,2),
(1,2,3),
(2,1,2),
(2,3,1),
(3,5,4);


-- task2 :Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu 
-- là một trong các ký tự  và có tối đa 15 ký tự
select * from nhanvien 
where (HoTen like 'H%' 
or HoTen like 'T%'
or HoTen like 'K%') and char_length(Hoten) < 15;

-- task 3 :Hiển thị thông tin của tất cả khách hàng 
-- có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”
select * 
from khachhang
where ( DATE_FORMAT(FROM_DAYS(DATEDIFF(now(),khachhang.ngaysinh)), '%Y') between 18 and 50 )
 and khachhang.Diachi in ('DN','HN');
 
 -- Task 4:	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
--  Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select kh.IDKhachHang,kh.hoten,count(h.idkhachhang) as 'Số lần đặt phòng'
from khachhang kh
join hopdong h
on kh.idkhachhang = h.IDKhachHang
group  by kh.IDKhachHang
order by  count(h.idkhachhang);

-- Task 5:	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
select kh.IDkhachhang,kh.Hoten,lkh.tenloaikhach,h.idhopdong,d.tendichvu,h.NgayLamHopDong,
h.NgayKetThuc,d.ChiPhiThue,dvdk.tendichvudikem,
d.chiphithue + (dvdk.gia * hdct.soluong) 'Tổng tiền'
from khachhang kh
join loaikhach lkh on kh.IDLoaiKhach = lkh.IDloaikhach
left join hopdong h on kh.IDKhachHang = h.IDKhachHang
left join dichvu d on h.IDDichVu = d.IDDichVu
left join hopdongchitiet hdct on hdct.IDhopdong = h.IDhopdong
left join dichvudikem dvdk on hdct.IDdichvudikem = dvdk.IDdichvudikem;

