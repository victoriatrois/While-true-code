-- 1) Select all the values in the customer table.
SELECT *
FROM customer;

-- 2) Select the state and age columns for all customers.
SELECT state, age
FROM customer;

-- 3) To select users working for a non-profit, chain another filter to only select customers whose email ends in '.org'
-- To select users living in an apartment, add a filter to only select customers with an address containing '#'.
SELECT state, age
FROM customer
WHERE email LIKE '%.org' AND address LIKE '%#%';

-- 4) Add the aggregate function AVG to the age column and alias it as average_age.
-- Add a GROUP BY for the state column to calculate the age averages by state.
SELECT state, AVG(age) AS average_age
FROM customer
WHERE email LIKE '%.org' AND address LIKE '%#%'
GROUP BY state;

-- 5) Count the customer items in each state by adding COUNT(*) to the select statement.
-- Give COUNT(*) the alias customer_count.
SELECT state, AVG(age) AS average_age, COUNT(*) AS customer_count
FROM customer
WHERE email LIKE '%.org' AND address LIKE '%#%'
GROUP BY state;

-- 6) Add a HAVING clause to the query that looks for the average age to be 18 or over.
SELECT state, AVG(age) as average_age, COUNT(*) as customer_count
FROM customer
WHERE email LIKE '%.org' AND address LIKE '%#%'
GROUP BY state
HAVING AVG(age) >= 18;