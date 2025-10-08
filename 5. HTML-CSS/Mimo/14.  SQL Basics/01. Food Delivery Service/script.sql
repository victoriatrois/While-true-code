SELECT name AS restaurant, rating
FROM offer
WHERE cuisine = "Japanese"
ORDER BY rating DESC;