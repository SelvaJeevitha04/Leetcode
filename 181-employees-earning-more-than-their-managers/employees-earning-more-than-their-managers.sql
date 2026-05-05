# Write your MySQL query statement below
SELECT e1.name As Employee From Employee e1 Join employee e2 On e1.managerId = e2.id Where e1.salary>e2.salary;