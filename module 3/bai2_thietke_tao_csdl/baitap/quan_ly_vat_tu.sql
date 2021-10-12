drop database if exists quanlivattu ;
create database quanlivattu ;
use quanlivattu ;

create table phieuxuat(
SoPX int primary key,
NgayXuat datetime
);

create table vattu(
MaVTU int primary key,
TenVTU varchar(50)
);

create table phieunhap(
SoPN int primary key,
NgayNhap datetime
);

create table dondh(
SoDH int primary key,
NgayDH datetime
);

create table nhacc(
MaNCC int primary key,
TenNCC varchar(50),
DiaChi varchar(50)
);

create table chitiet_phieuxuat(
SoPX int,
MaVTU int,
primary key(SoPX,MaVTU),
constraint pk_SoPX foreign key (SoPX) references phieuxuat(SoPX),
foreign key (MaVTU) references vattu(MaVTU)
);

create table chitiet_phieunhap(
SoPN int,
MaVTU int,
primary key(SoPN,MaVTU),
constraint pk_SoPN foreign key (SoPN) references phieunhap(SoPN),
foreign key (MaVTU) references vattu(MaVTU)
);

create table chitiet_dondathang(
SoDH int ,
MaVTU int,
primary key(SoDH,MaVTU),
constraint pk_SoDH foreign key (SoDH) references dondh(SoDH),
foreign key (MaVTU) references vattu(MaVTU)
);

create table cungcap(
SoDH int ,
MaNCC int,
primary key(SoDH,MaNCC),
foreign key (SoDH) references dondh(SoDH),
foreign key (MaNCC) references nhacc(MaNCC)
);

create table SDT(
MaNCC int,
SDT int,
primary key (MaNCC,SDT)
);
