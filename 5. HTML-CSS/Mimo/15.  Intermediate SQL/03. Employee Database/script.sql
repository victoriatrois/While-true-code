-- Select employees
-- whose names start with 'h',
-- request overtime,
-- worked between 20 and 30 hours,
-- are available on weekends,
-- and are not on probation or PTO.
SELECT * FROM employees
WHERE first_name LIKE 'h%'
OR request_ot = 'yes'
AND hours_worked BETWEEN 20 AND 30
AND availability IN ('any', 'weekend')
AND additional NOT IN ('probation', 'pto');