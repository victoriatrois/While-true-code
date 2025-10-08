-- 1) Query the database and get the count of all books. Use Total Number of Books as an alias.
SELECT COUNT(*) AS "Total Number of Books"
FROM Books;

-- 2) List the category name and the count of books in each one.
SELECT category, COUNT(*) AS "Total Number of Books"
FROM Books
GROUP BY category;

-- 3) Write a new query to find the book with the most copies in stock and list its name. Use Copies in Stock as an alias.
SELECT title, MAX(in_stock) AS "Copies in Stock"
FROM Books;

-- 4) Edit the previous query and find the book with the least copies in stock and list its name.
SELECT title, MIN(in_stock) AS "Copies in Stock"
FROM Books;

-- 5) Edit the previous query and find the book with the biggest number of pages and list its name. Use the same alias used in the expected result table.
SELECT title, MAX(pages_count) AS "Pages Count"
FROM Books;

-- 6) Edit the previous query and find the book with the smallest number of pages and list its name.
SELECT title, MIN(pages_count) AS "Pages Count"
FROM Books;

-- 7) Edit the previous query and find the oldest book in your store, with regard to its publishing year and list its name followed by publishing year. Pay attention to the alias used in the expected result table.
SELECT title, MIN(publish_year) AS "Publishing Year"
FROM Books;

-- 8) Edit the previous query and find the newest book in your store, with regard to its publishing year and list its name.
SELECT title, MAX(publish_year) AS "Publishing Year"
FROM Books;

-- 9) Write a new query to find the sum of all books that are available in stock. Pay attention to the alias used in the expected result table.
SELECT SUM(in_stock) AS "Total Copies in Stock"
FROM Books;

-- 10) Write a new query to find the average sum of all pages of all available books. Pay attention to the alias used in the expected result table.
SELECT AVG(pages_count) AS "Average Book Length"
FROM Books;