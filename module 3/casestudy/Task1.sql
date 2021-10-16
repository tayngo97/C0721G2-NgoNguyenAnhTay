use furama_database;
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
(1,2,1,'2018-2-18','2020-10-10',2000000),
(2,3,2,'2024-3-12','2021-10-10',4000000),
(3,1,1,'2019-1-2','2019-5-30',7000000),
(1,2,2,'2020-9-16','2020-10-10',2000000);

-- Thêm mới hợp đồng chi tiết 
insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,SoLuong)
values 
(4,2,2),
(1,2,3),
(2,1,2),
(2,3,1),
(3,5,4);
