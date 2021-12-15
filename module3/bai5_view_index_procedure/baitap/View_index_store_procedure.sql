drop database if exists demo;
create database demo;
use demo ;

-- BUOC 2:
-- // tao bang product
create table product(
id int unique not null,
productCode varchar(10) primary key,
productName varchar(20),
productPrice int,
productAmount int,
productDescription varchar(100),
productStatus bit
);

-- them du lieu
insert into product(id ,productCode,productName,productPrice,productAmount,productDescription,productStatus)
values 
(1,'PD01','Milk',100,200,'Delicious',1),
 (2,'PD02','Candy',300,400,'Delicious',1),
  (3,'PD03','Cake',500,600,'Delicious',1);

-- BUOC 3:
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
explain select * from product where productCode = 'PD03';
-- khi chua tao index thi tim kiem theo IMPLICIT INDEX

-- tao unique index cho productCode
CREATE UNIQUE INDEX idx_code
ON product (productCode);
explain select * from product where productCode = 'PD03';
-- sau khi tao index thi tim kiem theo idx_code


-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
CREATE INDEX idx_name_price
ON product (productName, productPrice);


-- BUOC 4:
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view view_product as
select productCode,productName,productPrice,productStatus 
from product;

-- xem view
select * from view_product;

-- cap nhap view
update view_product
set productPrice = 200
where productName = 'Milk'; 

-- xoa view
drop view view_product;

-- BUOC 5:
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure getProductInFo()
begin
 select* from product;
end //
delimiter ;

call getProductInFo();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
drop procedure if exists addNewProduct;
create procedure addNewProduct(
	IN id int ,productCode varchar(10),productName varchar(20)
    ,productPrice int,productAmount int,productDescription varchar(100),productStatus bit
)
begin
 insert into product(id ,productCode,productName,productPrice,productAmount,productDescription,productStatus)
values (id,productCode,productName,productPrice,productAmount,productDescription,productStatus);
end //
delimiter ;

call addNewProduct(10,'PD05','Milk',100,200,'Delicious',1);

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
-- drop procedure if exists deleteProductById;
create procedure deleteProductById(
	IN _id int(10)
)
begin
	delete from product 
    where id = _id;
    select * from product;
end //
delimiter ;

call deleteProductById(3);

-- Tạo store procedure sửa thông tin sản phẩm theo id

delimiter //
create procedure editProduct(
IN _id int ,_productCode varchar(10),_productName varchar(20)
    ,_productPrice int,_productAmount int,_productDescription varchar(100),_productStatus bit
)
begin
 update product
 set productCode = _productCode,productName = _productName, productPrice=_productPrice,
 productAmount = _productAmount, productDescription = _productDescription, productStatus = _productStatus
 where id = _id;
end //
delimiter ;

call editProduct(1,'PD11','Salt',1000,2000,'Vip',0);

call findAllcustomer();





