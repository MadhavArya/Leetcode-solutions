# Write your MySQL query statement below
SELECT 
uni.unique_id,
emp.name
FROM Employees AS emp
LEFT JOIN EmployeeUNI AS uni
ON emp.id = uni.id;













