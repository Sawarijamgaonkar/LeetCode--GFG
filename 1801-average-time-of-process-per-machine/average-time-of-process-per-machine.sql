# Write your MySQL query statement below
select activity1.machine_id, round(avg(activity2.timestamp-activity1.timestamp),3) as processing_time
from Activity activity1
join Activity activity2
on activity1.process_id=activity2.process_id 
and activity1.machine_id=activity2.machine_id
and activity1.timestamp<activity2.timestamp 
group by activity1.machine_id;