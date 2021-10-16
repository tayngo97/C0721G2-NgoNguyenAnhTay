use classicmodels;

DELIMITER //

CREATE PROCEDURE findAllCustomer()

BEGIN

	SELECT* FROM CUSTOMERS;
    
END //
    
DELIMITER ;

-- gọi procedure
CALL findAllCustomer();

-- Xóa procedure
DELIMITER //
DROP PROCEDURE IF EXISTS `findAllCustomers`//

CREATE PROCEDURE findAllCustomers()

BEGIN

SELECT * FROM customers where customerNumber = 175;

END //