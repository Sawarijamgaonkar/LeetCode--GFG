# Write your MySQL query statement below
# select
# p.firstName,
# p.lastName,
# a.city,
# a.state
# From person p Left join address a on p.personId=a.personId

SELECT P.firstName, P.lastName, A.city, A.state
FROM Person P
LEFT JOIN Address A USING (personId)