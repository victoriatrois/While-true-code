-- 1) Select all items from the weekly_income table.
SELECT *
FROM weekly_income;

-- 2) Use a JOIN type that combines both the weekly_income and expenditure tables. The result table should contain the matching entries from both tables.
SELECT *
FROM weekly_income
INNER JOIN expenditure;

-- 3) Rename the table weekly_income as w.
      -- Rename the table expenditure as e.
SELECT *
FROM weekly_income AS w
INNER JOIN expenditure AS e;

-- 4) Join items across the two tables where week_no equals due_week. Make sure to access these properties with aliases.
SELECT *
FROM weekly_income AS w
INNER JOIN expenditure AS e
ON w.week_no = e.due_week;

-- 5) Filter the results to get only items where the type in the expenditure table is equal to 'Recreation'.
SELECT *
FROM weekly_income AS w
INNER JOIN expenditure AS e
ON w.week_no = e.due_week
WHERE e.type LIKE 'Recreation';

-- 6) Update the query so that it doesn't select all properties, but only the ones given below. Make sure that they're in the order of description, spent and net.
-- from the expenditure table, description and spent
-- from the weekly_column table, net.
-- Since we aliased the tables, make sure to access these properties by their table's alias.
SELECT e.description, e.spent, w.net
FROM weekly_income AS w
INNER JOIN expenditure AS e
ON w.week_no = e.due_week
WHERE e.type LIKE 'Recreation';

--7) Rewrite the WHERE clause to show the expenditure of the second week. Remove the 'Recreation' filter.
SELECT e.description, e.spent, w.net
FROM weekly_income AS w
INNER JOIN expenditure AS e
ON w.week_no = e.due_week
WHERE w.week_no = 2;