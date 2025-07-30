# Write your MySQL query statement below
select e1.email as "Email" from Person e1 group by e1.email having count(e1.email)>1;