use classicmodels;


-- tạo view
create view customer_views as
select customerNumber,customerName,phone
from customers;

-- chỉnh sửa viêw
create or replace view customer_views as
select customerNumber,customerName,phone,state
from customers
where state = 'CA';

-- xem view
select *  from customer_views
;

-- xóa view
DROP VIEW customer_views;