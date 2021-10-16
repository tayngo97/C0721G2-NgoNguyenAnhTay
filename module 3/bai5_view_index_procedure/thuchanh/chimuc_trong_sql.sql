use classicmodels;

SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 
alter table customers drop index idx_customername;
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 

ALTER TABLE customers ADD INDEX idx_customerName(customerName);

EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 