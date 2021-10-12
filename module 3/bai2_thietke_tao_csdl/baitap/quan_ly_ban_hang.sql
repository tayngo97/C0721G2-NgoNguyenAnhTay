drop database if exists QuanLyBanHang ;
create database QuanLyBanHang ;
use QuanLyBanHang ;

create table Customer(
customerID int primary key,
customerName varchar(50) not null,
customerAge int default 18 check(customerAge >18)
);

create table _order(
orderID int primary key,
customerID int ,
orderDate datetime,
orderToTalPrice int,
constraint pk_cID foreign key (customerID) references Customer(customerID)
);

create table Product(
productID int primary key,
productName varchar(50),
productPrice int
);

create table order_detail(
orderID int,
productID int,
primary key(orderID,productID),
constraint pk_oID foreign key (orderID) references _order(orderID),
constraint pk_pID foreign key (productID) references Product(productID)
);







