# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM
    (SELECT product_id, year, price
     FROM Sales) AS s
INNER JOIN Product AS p
WHERE p.product_id = s.product_id;