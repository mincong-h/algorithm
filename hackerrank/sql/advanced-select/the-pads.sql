SELECT CONCAT(Name, '(', UPPER(LEFT(Occupation, 1)), ')')
FROM OCCUPATIONS
ORDER BY Name;
SELECT CONCAT('There are total ', COUNT(Occupation), ' ', LOWER(Occupation), 's.')
FROM OCCUPATIONS
GROUP BY Occupation
ORDER BY COUNT(Occupation), Occupation;
