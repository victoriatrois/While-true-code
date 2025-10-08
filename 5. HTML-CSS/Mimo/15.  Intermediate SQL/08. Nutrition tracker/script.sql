-- 1) Write a query to select everything from the macros table.
SELECT *
FROM macros;

-- 2) Select all items in the snack table.
SELECT *
FROM snack;

-- 3) Choose a JOIN type and join snack and macros. Make sure to display all snacks and any available nutritional information from macros. Join the tables on a common property to match the snacks to the available information in macros.
SELECT *
FROM snack
LEFT JOIN macros
ON snack.id = macros.id;

-- 4) Give snack the alias s.
-- Give macros the alias m.
-- Update any references to the whole table names to the alias. Fore example, snack.id should be s.id.
SELECT *
FROM snack AS s
LEFT JOIN macros AS m
ON s.id = m.id;

-- 5) Update the query so that it doesn't select all properties, but only the following:
-- from the snack table, name and type
-- from the macros table, carbs_g, protein_g, and fat_g
-- Since we aliased the tables, make sure to access these properties by their table's alias.
SELECT s.name, s.type, m.carbs_g, m.protein_g, m.fat_g
FROM snack AS s
LEFT JOIN macros AS m
ON s.id = m.id;

-- 6) After the ON statement, add a filter to only select vegetarian items.
SELECT s.name, s.type, m.carbs_g, m.protein_g, m.fat_g
FROM snack AS s
LEFT JOIN macros AS m
ON s.id = m.id
WHERE s.type LIKE 'vegetarian';
