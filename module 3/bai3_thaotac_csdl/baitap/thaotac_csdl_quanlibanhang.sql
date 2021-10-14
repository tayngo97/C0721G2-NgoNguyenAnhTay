use quanlybanhang;

select o.orderId,o.orderDate,o.orderToTalPrice
from _order o;

select c.customerName,o.orderID,p.productName
from customer c join _order o on c.customerID = o.customerID
join order_detail oDT on o.orderID = oDT.orderID
join product p on oDT.productID = p.productID
order by o.orderID;

select *
from customer c left join _order o on c.customerID = o.customerID
where o.customerID is null;

select c.customerName , oDT.orderID,o.orderDate,sum(oDT.orderQuanlity * p.productPrice) as `Total Price`
from order_detail oDT
join product p
on p.productID = oDT.productID
join _order o
on o.orderId = oDT.orderID
join customer c
on c.customerID = o.customerID
group by oDT.orderID
;





