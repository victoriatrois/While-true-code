SELECT * FROM cars
WHERE no_available > 0
AND seats >= 5
AND ((features LIKE '%AWD%') OR (features LIKE '%FWD%' AND features LIKE '%Winter Tires%'))
AND (price LIKE '$2%' OR price LIKE '$3%')
AND mpg BETWEEN 20 AND 30;