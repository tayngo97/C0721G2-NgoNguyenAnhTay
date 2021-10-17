use furama_database;

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
select kh.IDKhachHang
,kh.hoten,count(h.idkhachhang) as 'Số lần đặt phòng'
from khachhang kh
join hopdong h
on kh.idkhachhang = h.IDKhachHang
where kh.idloaikhach =1
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

-- task 6:	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
select *
from dichvu dv
left join hopdong h on dv.iddichvu = h.iddichvu
where (quarter(h.NgayLamHopDong) !=1 and year(h.NgayLamHopDong) != 2019)
or h.idhopdong is null ;

-- task 7 :
select dv.iddichvu,dv.tendichvu,dv.dientich,dv.SoNguoiToiDa,dv.chiphithue,ldv.tenloaidichvu
from dichvu dv
join loaidichvu ldv
on dv.idloaidichvu = ldv.idloaidichvu
join hopdong h on h.iddichvu = dv.iddichvu
where  year(h.NgayLamHopDong) = 2018  and not exists (
	select  *
    from hopdong h
    where h.iddichvu = dv.iddichvu and year(h.NgayLamHopDong) = 2019
);


-- task 8 :
-- cách 1:
select kh.hoten
from khachhang kh
group by kh.hoten;
-- cách 2:
select kh.hoten
from khachhang kh
union
select kh.hoten
from khachhang kh;
-- cách 3:
select distinct kh.hoten
FROM khachhang kh;

-- task 9:
select d.tendichvu,count(kh.IDkhachhang) 'Số lượng khách',month(h.NgayLamHopDong) 'Tháng',year(h.NgayLamHopDong) 'Năm'
,sum(d.chiphithue + (dvdk.gia * hdct.soluong))  'Doanh thu'
from khachhang kh
join loaikhach lkh on kh.IDLoaiKhach = lkh.IDloaikhach
join hopdong h on kh.IDKhachHang = h.IDKhachHang
join dichvu d on h.IDDichVu = d.IDDichVu
join hopdongchitiet hdct on hdct.IDhopdong = h.IDhopdong
join dichvudikem dvdk on hdct.IDdichvudikem = dvdk.IDdichvudikem
where year(h.ngaylamhopdong) = 2019
group by month(h.ngaylamhopdong)
order by month(h.ngaylamhopdong)
;

-- task 10
select h.idhopdong,h.ngaylamhopdong,h.ngayketthuc,h.tiendatcoc,count(hdct.idhopdong) 'Số lượng dv đi kèm'
from hopdong h
join hopdongchitiet hdct
on h.idhopdong = hdct.idhopdong
group by hdct.idhopdong;

-- task 11
select dvdk.iddichvudikem,dvdk.tendichvudikem,kh.idkhachhang,kh.hoten,kh.diachi,lkh.tenloaikhach 'Loại khách'
from hopdong h
join khachhang kh on kh.idkhachhang = h.idkhachhang
join loaikhach lkh on kh.idloaikhach = lkh.idloaikhach
join hopdongchitiet hdct on h.idhopdong = hdct.idhopdong
join dichvudikem dvdk on hdct.iddichvudikem = dvdk.iddichvudikem
where kh.idkhachhang in (
	select kh.idkhachhang
	from khachhang kh
	where kh.diachi in ('Vinh','Quãng ngãi') and kh.idloaikhach = 1)
order by dvdk.iddichvudikem;

-- task13
-- chưa làm được phần có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau
select dvdk.tendichvudikem,sum(hdct.soluong) 'Lượt sử dụng'
from hopdongchitiet hdct
join dichvudikem dvdk
on hdct.IDDichVuDiKem = dvdk.IDDichVuDiKem
group by dvdk.IDDichVuDiKem 
having sum(hdct.soluong) 
order by sum(hdct.soluong) desc;

-- task14
select h.idhopdong,ldv.tenloaidichvu,hdct.iddichvudikem,dvdk.tendichvudikem,sum(soluong) 'Số lần sử dụng'
from  hopdongchitiet hdct
join dichvudikem dvdk on dvdk.iddichvudikem = hdct.iddichvudikem
join hopdong h on h.idhopdong = hdct.idhopdong
join dichvu dv on dv.iddichvu = h.iddichvu
join loaidichvu ldv on dv.idloaidichvu = ldv.idloaidichvu
group by  hdct.iddichvudikem 
having sum(soluong) = 1;

-- task 15
select hd.idhopdong,nv.hoten,year(hd.ngaylamhopdong) 'Year',count( year(hd.ngaylamhopdong) = 2018
+ year(hd.ngaylamhopdong) = 2019) as 'Số lần làm hợp đồng'
from hopdong hd
join nhanvien nv
on hd.idnhanvien = nv.idnhanvien
where year(hd.ngaylamhopdong) = 2018 or year(hd.ngaylamhopdong) = 2019 
group by nv.hoten
having `Số lần làm hợp đồng` <= 3;

-- task 16
delete from nhanvien 
where nv.idnhanvien not in ( select * from(select nv.idnhanvien
	from hopdong hd
	join nhanvien nv
	on hd.idnhanvien = nv.idnhanvien
	where year(hd.ngaylamhopdong)  between 2017 and 2019
	group by nv.hoten) tblTmp);

