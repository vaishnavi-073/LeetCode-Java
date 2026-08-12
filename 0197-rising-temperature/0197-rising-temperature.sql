# Write your MySQL query statement below
SELECT w.id AS Id From Weather w JOIN Weather v ON DATEDIFF(w.recordDate, v.recordDate) = 1 AND v.temperature < w.temperature;