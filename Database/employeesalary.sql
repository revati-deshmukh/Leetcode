# Write your MySQL query statement below
SELECT e1.name as Employee from Employee as e1, Employee as e2
where e1.salary > e2.salary && e2.id = e1.managerId