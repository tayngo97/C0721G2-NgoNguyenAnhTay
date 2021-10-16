use classicmodels;

-- tham số loại IN
delimiter //
create procedure getCusById
(in cusNum INT(11))

begin 
	select * from customers  where customerNumber = cusNum;
	end //
delimiter ;
    
    call getCusById(175);
    
--     tham số loại OUT

delimiter //
drop procedure if exists getCusCountById;
create procedure getCusCountById
(IN in_city varchar(50) ,
 OUT total INT
 )
 begin
 select count(customerNumber)
 into total
 from customers
 where city = in_city;
 end //
 delimiter ;
 
 call getCusCountById('NYC',@total);
 select @total;
 
 
--  Tham số loại INOUT
delimiter //
create procedure SetCounter(
INOUT counter int,
IN inc INT
)

begin set counter = counter + inc;
end //
delimiter ;

set @counter = 1;
call SetCounter(@counter,2);
select @counter;
CALL SetCounter(@counter,1); 
CALL SetCounter(@counter,5); 
SELECT @counter; 
