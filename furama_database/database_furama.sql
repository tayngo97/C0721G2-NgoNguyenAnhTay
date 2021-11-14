drop database if exists furama_casetudy;
create database furama_casetudy;
use  furama_casetudy;

create table `position`(
	position_id int primary key auto_increment,
	position_name varchar(45)
);

create table education_degree(
	education_degree_id int primary key auto_increment,
    education_degree_name varchar(45)
);

create table division(
	division_id  int primary key auto_increment,
    division_name varchar(45)
);

create table employee(
	id int primary key auto_increment,
    `name` varchar(45),
    birthday date,
    salary int,
    phone_number varchar(45),
    email varchar(45),
    address varchar(45),
    position_id int,
    education_degree_id int,
    division_id int,
    username varchar(255),
    constraint pk_position_id foreign key (position_id) references `position`(position_id),
    constraint pk_education_degree_id foreign key (education_degree_id) references `education_degree`(education_degree_id),
    constraint pk_division_id foreign key (division_id) references `division`(division_id)
); 

create table customer_type(
customer_type_id int primary key auto_increment,
customer_type_name varchar(45)
);


create table customer(
id int primary key auto_increment,
customer_type_id int,
name varchar(45),
birthday date,
gender varchar(45),
phone_number varchar(45),
email varchar(45),
address varchar(45),
constraint pk_customer_type_id foreign key (customer_type_id) references customer_type(customer_type_id)
);

create table service_type(
service_type_id int primary key auto_increment,
service_type_name varchar(45)
);

create table rent_type(
	rent_type_id int primary key auto_increment,
    rent_type_name varchar(45),
    rent_type_cost double
);

create table service(
	id int primary key auto_increment,
    `name` varchar(45),
    area int,
    cost double,
    max_people int,
    rent_type_id int,
    service_type_id int,
    standard_room varchar(45),
    description_other_convenience varchar(45),
    pool_area double,
    number_of_floors int,
    constraint pk_rent_type_id foreign key (rent_type_id) references rent_type(rent_type_id),
    constraint pk_service_type_id foreign key (service_type_id) references service_type(service_type_id)
);

create table contract(
	id int primary key auto_increment,
    start_date date,
    end_date date,
    deposit double,
    total_money double,
    employee_id int,
    customer_id int,
    service_id int,
    constraint pk_employee_id foreign key (employee_id) references employee(id),
    constraint pk_customer_id foreign key (customer_id) references customer(id),
    constraint pk_service_id foreign key (service_id) references service(id)
);

create table attach_service(
	id int primary key auto_increment,
    name varchar(45),
    cost double,
    unit int,
    `status` varchar(45)
);

create table contract_detail(
	contract_id int ,
    attach_service_id int,
    quantity int,
    primary key (contract_id,attach_service_id),
    constraint pk_contract_id foreign key(contract_id) references contract(id),
    constraint pk_attach_service_id foreign key(attach_service_id) references attach_service(id)
);




