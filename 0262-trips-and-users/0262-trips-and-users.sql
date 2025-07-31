# Write your MySQL query statement below
select request_at as "Day" , round(canceled_request/total_requests,2) as "Cancellation Rate" from 
(select sum(case when status<>'completed' then 1 else 0 end) as canceled_request,
count(*) as total_requests, request_at from trips
where request_at between '2013-10-01' and '2013-10-03' and
(client_id in (select users_id from users where banned='No') and driver_id in(select users_id from users where banned='No')) group by request_at) a
