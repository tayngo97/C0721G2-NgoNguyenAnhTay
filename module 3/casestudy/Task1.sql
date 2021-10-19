use furama_database;
-- Task1 	Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn các yêu cầu bên dưới.
-- Thêm mới vị trí nhân viên
insert into vitri(ten_vitri)
values ('Le Tan'),('Phuc Vu'),('Chuyen Vien'),('giam Sat'),('Quan Ly'),('giam Doc');

-- Thêm mới bộ phận nhân viên
insert into bophan(ten_bophan)
values ('Sale – Marketing'),('Hành Chính'), ('Phục vụ'),('Quản lý');

-- Thêm mới bộ phận nhân viên
insert into trinhdo(ten_trinhdo)
values ('Trung cấp'),('Cao đẳng'),('Đại học '),('Sau đại học');


-- Thêm mới nhân viên
insert into nhanvien(hoten,id_vitri,id_trinhdo,id_bophan,ngaysinh,so_cmnd,luong,sdt,email,diachi)
values ('Nam',1,1,3,'2020-10-10',202011,100000,090604012,'Nam@gmail.com','Hải châu'),
('Lan',2,1,2,'1992-5-10',202011,100000,090604012,'Lan@gmail.com','QN'),
('Trinh',1,1,3,'1995-2-10',202011,100000,090604012,'Trinh@gmail.com','DN');


-- Thêm mới loại khách
insert into loaikhach(ten_loaikhach)
values('Diamond'),('Platinium'),('Gold'),('Silver'),('Member');

-- Thêm mới khách hàng
insert into khachhang(id_loaikhach,hoten,ngaysinh,so_cmnd,sdt,email,diachi)
values(1,'Nhan','1995-10-09',102021,09021231,'Long@gmail.com','Hải châu'),
(1,'Tien','1992-05-09',102021,09021231,'Hoa@gmail.com','Hà nội'),
(1,'Truong','1995-10-09',102021,09021231,'Truong@gmail.com','Quãng ngãi'),
(2,'Nam','1992-05-09',102021,09021231,'Hoa@gmail.com','Vinh'),
(3,'Ly','1995-10-09',102021,09021231,'LY@gmail.com','Quãng ngãi');

-- Thêm mới dịch vụ đi kèm
insert into dichvu_dikem(ten_dichvu_dikem,gia,donvi,trangthai_khadung)
values ('Massage',10000,1,'San Sang'), 
('Karaoke',20000,1,'San Sang'), 
('Thức ăn',50000,1,'San Sang'),
 ('Nước uống',5000,1,'San Sang'),
 ('Xe tham quan',100000,1,'San Sang');

-- Thêm mới kiểu thuê
insert into kieuthue(ten_kieuthue,gia)
values('Thuê Năm',100000),('Thuê Tháng',50000),('Thuê Ngày',1500),('Thuê Giờ',200);

-- Thêm mới loại dich vụ
insert into loaidichvu(ten_loaidichvu)
values('Villa'),
('House'),
('Room');

-- Thêm mới dịch vụ
insert into dichvu(ten_dichvu,dientich,sotang,songuoi_toida,chiphi_thue,id_kieuthue,id_loaidichvu,trangthai)
values('Villa',50,4,3,10000,1,1,'Ready'),
('House',40,5,2,5000,2,2,'Ready'),
('Room',20,4,3,600,4,3,'Ready');

-- Thêm mới hợp đồng
insert into hopdong(id_nhanvien,id_khachhang,id_dichvu,ngaylam_hopdong,ngay_ketthuc,tien_datcoc)
values
(1,2,1,'2018-2-18','2020-10-10',2000000),
(2,3,2,'2019-3-12','2021-10-10',4000000),
(3,1,1,'2020-1-2','2019-5-30',7000000),
(2,3,2,'2019-6-12','2021-10-10',4000000),
(1,2,2,'2020-9-16','2020-10-10',2000000),
(1,2,1,'2019-2-18','2020-10-10',2000000),
(2,3,2,'2019-6-12','2021-10-10',4000000),
(3,1,1,'2020-1-2','2019-5-30',7000000),
(1,2,2,'2019-12-12','2020-10-10',2000000),
(2,2,2,'2020-9-16','2020-10-10',2000000),
(1,2,2,'2019-9-16','2020-10-10',2000000);

-- Thêm mới hợp đồng chi tiết 
insert into hopdong_chititet(id_hopdong,id_dichvu_dikem,soluong)
values 
(4,2,2),
(1,2,3),
(2,1,6),
(2,3,1),
(3,5,4),
(5,3,2),
(6,4,1),
(9,1,4),
(8,1,3),
(7,5,5);