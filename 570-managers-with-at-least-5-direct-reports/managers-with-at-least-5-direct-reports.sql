# Write your MySQL query statement below
select M1.name from Employee as M1 
inner join Employee as M2 on M1.id=M2.managerId group by M2.managerId 
having count(M2.managerId)>=5;