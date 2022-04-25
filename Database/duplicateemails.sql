# Write your MySQL query statement below
SELECT DISTINCT(p1.email) as Email
FROM Person as p1
RIGHT JOIN Person as P2
ON p1.email = p2.email
WHERE p1.id != p2.id