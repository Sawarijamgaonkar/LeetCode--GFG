# Write your MySQL query statement below
-- time complexity 1315ms , beats 37.91%:
-- select product_name, year, price from Product inner join Sales using(product_id);
-- better approach:
select product_name, year,price from Product inner join Sales on Sales.product_id=Product.product_id;