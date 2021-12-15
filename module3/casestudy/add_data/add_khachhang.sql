use furama_database;

-- alter table khachhang
-- modify column NgaySinh date;


insert into khachhang(IDKhachHang,IDLoaiKhach,HoTen,NgaySinh,SoCMND,Sdt,Email,DiaChi)
values(1,4,'Long','1995-10-09',102021,09021231,'Long@gmail.com','DN');


insert into khachhang(IDKhachHang,IDLoaiKhach,HoTen,NgaySinh,SoCMND,Sdt,Email,DiaChi)
values(2,2,'Hoa','1992-05-09',102021,09021231,'Hoa@gmail.com','HN');


insert into khachhang(IDKhachHang,IDLoaiKhach,HoTen,NgaySinh,SoCMND,Sdt,Email,DiaChi)
values(3,3,'Ly','1995-10-09',102021,09021231,'LY@gmail.com','QN');

select * from KhachHang