-- Query the name, author, genre and number of copies ordered of a book whose price is less then or equal to the average price
SELECT b.name, b.author, b.genre, o.copies_ordered
FROM books AS b
INNER JOIN orders AS o
ON b.book_id = o.book_id
WHERE b.price <= (
  SELECT AVG(price)
  FROM books
) AND o.status = 'not paid';