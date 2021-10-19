use furama_database;

-- task2 :Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu 
-- là một trong các ký tự  và có tối đa 15 ký tự
select * from nhanvien 
where (hoten like 'H%' 
or hoten like 'T%'
or hoten like 'K%') and char_length(hoten) < 15;

-- task 3 :Hiển thị thông tin của tất cả khách hàng 
-- có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”
select * 
from khachhang
where ( DATE_FORMAT(FROM_DAYS(DATEDIFF(now(),khachhang.ngaysinh)), '%Y') between 18 and 50 )
 and khachhang.diachi in ('DN','HN');
 
 -- Task 4:	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
--  Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select kh.id_khachhang
,kh.hoten,count(h.id_khachhang) as 'Số lần đặt phòng'
from khachhang kh
join hopdong h
on kh.id_khachhang = h.id_khachhang
where kh.id_loaikhach =1
group  by kh.id_khachhang
order by  count(h.id_khachhang);

-- Task 5:	Hiển thị id_khachhang, hoten, ten_loaikhach, id_hopdong, ten_dichvu, ngaylam_hopdong, ngay_ketthuc, TongTien 
select kh.id_khachhang,kh.hoten,lkh.ten_loaikhach,h.id_hopdong,d.ten_dichvu,h.ngaylam_hopdong,
h.ngay_ketthuc,d.chiphi_thue,dvdk.ten_dichvu_dikem,
d.chiphi_thue + (dvdk.gia * hdct.soluong) 'Tổng tiền'
from khachhang kh
join loaikhach lkh on kh.id_loaikhach = lkh.id_loaikhach
left join hopdong h on kh.id_khachhang = h.id_khachhang
left join dichvu d on h.id_dichvu = d.id_dichvu
left join hopdong_chititet hdct on hdct.id_hopdong = h.id_hopdong
left join dichvu_dikem dvdk on hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem;

-- task 6:	Hiển thị id_dichvu, ten_dichvu, dientich, chiphi_thue, ten_loaidichvu 
select *
from dichvu dv
left join hopdong h on dv.id_dichvu = h.id_dichvu
where (quarter(h.ngaylam_hopdong) !=1 and year(h.ngaylam_hopdong) != 2019)
or h.id_hopdong is null ;

-- task 7 :
select dv.id_dichvu,dv.ten_dichvu,dv.dientich,dv.songuoi_toida,dv.chiphi_thue,ldv.ten_loaidichvu
from dichvu dv
join loaidichvu ldv
on dv.id_loaidichvu = ldv.id_loaidichvu
join hopdong h on h.id_dichvu = dv.id_dichvu
where  year(h.ngaylam_hopdong) = 2018  and not exists (
	select  *
    from hopdong h
    where h.id_dichvu = dv.id_dichvu and year(h.ngaylam_hopdong) = 2019
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
select d.ten_dichvu,count(kh.id_khachhang) 'Số lượng khách',month(h.ngaylam_hopdong) 'Tháng',year(h.ngaylam_hopdong) 'Năm'
,sum(d.chiphi_thue + (dvdk.gia * hdct.soluong))  'Doanh thu'
from khachhang kh
join loaikhach lkh on kh.id_loaikhach = lkh.id_loaikhach
join hopdong h on kh.id_khachhang = h.id_khachhang
join dichvu d on h.id_dichvu = d.id_dichvu
join hopdong_chititet hdct on hdct.id_hopdong = h.id_hopdong
join dichvu_dikem dvdk on hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
where year(h.ngaylam_hopdong) = 2019
group by month(h.ngaylam_hopdong)
order by month(h.ngaylam_hopdong)
;

-- task 10
select h.id_hopdong,h.ngaylam_hopdong,h.ngay_ketthuc,h.tien_datcoc,count(hdct.id_hopdong) 'Số lượng dv đi kèm'
from hopdong h
join hopdong_chititet hdct
on h.id_hopdong = hdct.id_hopdong
group by hdct.id_hopdong;

-- task 11
select dvdk.id_dichvu_dikem,dvdk.ten_dichvu_dikem,kh.id_khachhang,kh.hoten,kh.diachi,lkh.ten_loaikhach 'Loại khách'
from hopdong h
join khachhang kh on kh.id_khachhang = h.id_khachhang
join loaikhach lkh on kh.id_loaikhach = lkh.id_loaikhach
join hopdong_chititet hdct on h.id_hopdong = hdct.id_hopdong
join dichvu_dikem dvdk on hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
where kh.id_khachhang in (
	select kh.id_khachhang
	from khachhang kh
	where kh.diachi in ('Vinh','Quãng ngãi') and kh.id_loaikhach = 1)
order by dvdk.id_dichvu_dikem;

-- task13
-- chưa làm được phần có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau
select dvdk.ten_dichvu_dikem,sum(hdct.soluong) 'Lượt sử dụng'
from hopdong_chititet hdct
join dichvu_dikem dvdk
on hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
group by dvdk.id_dichvu_dikem 
having sum(hdct.soluong) 
order by sum(hdct.soluong) desc;

-- task14
select h.id_hopdong,ldv.ten_loaidichvu,hdct.id_dichvu_dikem,dvdk.ten_dichvu_dikem,sum(soluong) 'Số lần sử dụng'
from  hopdong_chititet hdct
join dichvu_dikem dvdk on dvdk.id_dichvu_dikem = hdct.id_dichvu_dikem
join hopdong h on h.id_hopdong = hdct.id_hopdong
join dichvu dv on dv.id_dichvu = h.id_dichvu
join loaidichvu ldv on dv.id_loaidichvu = ldv.id_loaidichvu
group by  hdct.id_dichvu_dikem 
having sum(soluong) = 1;

-- task 15
select hd.id_hopdong,nv.hoten,year(hd.ngaylam_hopdong) 'Year',count( year(hd.ngaylam_hopdong) = 2018
+ year(hd.ngaylam_hopdong) = 2019) as 'Số lần làm hợp đồng'
from hopdong hd
join nhanvien nv
on hd.id_nhanvien = nv.id_nhanvien
where year(hd.ngaylam_hopdong) = 2018 or year(hd.ngaylam_hopdong) = 2019 
group by nv.hoten
having `Số lần làm hợp đồng` <= 3;

-- task 16
delete from nhanvien 
where nhanvien.id_nhanvien not in ( select * from(select nhanvien.id_nhanvien
	from hopdong hd
	join nhanvien
	on hd.id_nhanvien = nhanvien.id_nhanvien
	where year(hd.ngaylam_hopdong)  between 2017 and 2019
	group by nhanvien.hoten) tblTmp);

-- task17
SET SQL_SAFE_UPDATES = 0;
update khachhang
set id_loaikhach = '1'
where khachhang.id_loaikhach in (
select * from (select kh.id_loaikhach
		from loaikhach lk
			join khachhang kh
				on kh.id_loaikhach = lk.id_loaikhach
			join hopdong 
				on hopdong.id_khachhang = kh.id_khachhang
			where year(hopdong.ngaylam_hopdong) = '2019'  and kh.id_loaikhach = '2'
				group by kh.id_khachhang) as loai_khach
);

-- task18
delete from khachhang kh
where kh.id_khachhang in (
select * from (select kh.id_khachhang
from hopdong hd
	join khachhang kh
		on kh.id_khachhang = hd.id_khachhang
where year(hd.ngaylam_hopdong) < '2016'
group by kh.id_khachhang) as kh
);

# 19.Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
update dichvu_dikem dvdk
set dvdk.gia = dvdk.gia*2
where id_dichvu_dikem in(
select * from (select dvdk.id_dichvu_dikem
from loaikhach lk
	join khachhang kh
		on lk.id_loaikhach = kh.id_loaikhach
	join hopdong hd
		on kh.id_khachhang = hd.id_khachhang
	join dichvu dv
		on dv.id_dichvu = hd.id_dichvu
	join hopdong_chititet hdct
		on hdct.id_hopdong = hd.id_hopdong
	join dichvu_dikem dvdk
		on dvdk.id_dichvu_dikem = hdct.id_dichvu_dikem
     where hdct.soluong > 10) as hd
     group by dvdk.ten_dichvu_dikem
     ) ;


-- Task 21
	SET SQL_SAFE_UPDATES = 0;
	drop view if exists v_nhanvien;
	create view v_nhanvien AS
	select * 
    from nhanvien nv
    where nv.diachi = 'Hải châu'  and nv.id_nhanvien in (
		select nv.id_nhanvien
        from nhanvien nv
        join hopdong hd
        on nv.id_nhanvien = hd.id_nhanvien
        where hd.ngaylam_hopdong = '2019-12-12'
        group by nv.id_nhanvien 
        having count(hd.ngaylam_hopdong) > 0)
        ;
        
-- 	task22
update v_nhanvien
set diachi = 'Liển  Chiểu';

select * from v_nhanvien;



