use  furama_casetudy;

insert into `position`(position_name)
values ("Lễ tân"),("Phục vụ"),("Chuyên viên"),("Giám sát"),("Quản lý"),("Giám đốc");

insert into division(division_name)
values ("Sale – Marketing"),("Hành Chính"),("Phục vụ"),("Quản lý");

insert into education_degree(education_degree_name)
values ("Trung cấp"),("Đại học"),("Cao đẳng"),("Sau đại học");

insert into employee(`name`,birthday,salary,phone_number,email,address,position_id,education_degree_id,division_id,username)
values ("Lan","1997-10-09",100000,"0905027209","Lan@gmail.com","Đà nẵng",1,2,3,"lan_user"),
("Nam","1996-05-09",120000,"0905123211","Nam@gmail.com","Quảng nam",2,1,2,"nam_user"),
("Hoa","1995-06-09",150000,"0905498481","Hoa@gmail.com","Quảng ngãi",3,1,2,"hoa_user");

select * from employee;


select nv.id,nv.`name` as `tennhanvien`,nv.birthday,nv.salary,nv.phone_number,nv.email,nv.address,
p.position_name `position`,e.education_degree_name `education`,d.division_name `division`,nv.username
from employee nv
join position p on nv.id = p.position_id
join education_degree e on nv.id = e.education_degree_id
join division d on nv.id = d.division_id;




