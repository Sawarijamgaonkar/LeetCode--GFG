# Write your MySQL query statement below
select s1.student_id ,s1.student_name, b1.subject_name, count(e1.subject_name) as attended_exams 
from Students s1  cross join Subjects b1 left join Examinations e1 
on s1.student_id=e1.student_id and b1.subject_name=e1.subject_name 
group by s1.student_id , s1.student_name, b1.subject_name
order by s1.student_id , s1.student_name, b1.subject_name;