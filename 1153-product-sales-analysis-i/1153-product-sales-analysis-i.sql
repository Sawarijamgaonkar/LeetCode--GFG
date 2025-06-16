# Write your MySQL query statement below
select product_name, year, price from Product inner join Sales using(product_id);