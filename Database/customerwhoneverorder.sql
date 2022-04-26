# Write your MySQL query statement below
SELECT c.name as Customers FROM Customers as c
WHERE id NOT IN (SELECT o.customerId FROM Orders as o)