# Write your MySQL query statement below
Select c.name as Customers From Customers c left join Orders o on c.id=o.customerId Where o.customerId is Null;