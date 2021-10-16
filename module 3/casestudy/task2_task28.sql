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
select kh.IDKhachHang,kh.hoten,count(h.idkhachhang) as 'Số lần đặt phòng'
from khachhang kh
join hopdong h
on kh.idkhachhang = h.IDKhachHang
group  by kh.IDKhachHang
-- having khachhang.idloaikhach = 1 ??????????
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
	select  h.NgayLamHopDong
    from hopdong h
    where h.iddichvu = dv.iddichvu and year(h.NgayLamHopDong) = 2019
);

