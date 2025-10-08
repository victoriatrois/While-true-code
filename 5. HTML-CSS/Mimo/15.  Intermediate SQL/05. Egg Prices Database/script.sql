-- 1) Query for the minimum and maximum prices for a dozen eggs of any variety.
SELECT MIN(price), MAX(price)
FROM eggs
WHERE qty = 12;

-- 2) Find the average.
SELECT MIN(price), MAX(price), AVG(price)
FROM eggs
WHERE qty = 12;

-- 3) Cleanup the column names, use "Cheapest Dozen", "Most Expensive Dozen", and "Average Dozen"
SELECT MIN(price) AS "Cheapest Dozen", MAX(price) AS "Most Expensive Dozen", AVG(price) AS "Average Dozen"
FROM eggs
WHERE qty = 12;

-- 4) Check the AVG SQL statement is giving the correct output.
SELECT SUM(price), COUNT(price), AVG(price)
FROM eggs;

-- 5) Break the query down by quantity.
SELECT SUM(price), COUNT(price), AVG(price), qty
FROM eggs
GROUP BY qty;

-- 6) Select a unique set of types from the table
SELECT DISTINCT type
FROM eggs;

-- 7) Select each type and its average
SELECT type, AVG(price)
FROM eggs
GROUP BY type;

-- 8) Break the average price out by both type and quantity.
SELECT type, qty, AVG(price)
FROM eggs
GROUP BY type, qty;

-- 9) Examine the average price by brand and quantity.
SELECT brand, qty, AVG(price)
FROM eggs
GROUP BY brand, qty;