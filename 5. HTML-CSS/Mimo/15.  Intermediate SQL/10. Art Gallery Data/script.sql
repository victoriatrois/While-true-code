-- 1) Select all of the artists from the artist table.
SELECT *
FROM artist;

--2) Join the selected artist table to artwork using the artist's name.
SELECT *
FROM artist
JOIN artwork
ON artist.name = artwork.artist_name;

-- 3) Update the query to select only the name from the artist table, followed by the title, year_created, and type of artwork owned from the artwork table, in this order.
SELECT artist.name, artwork.title, artwork.year_created, artwork.type
FROM artist
JOIN artwork
ON artist.name = artwork.artist_name;

-- 4) Rename:
-- artist.name to artist,
-- the artwork.title of the artwork associated to the artist to title_of_piece
-- the artwork.year_created to year
-- the artwork.type of artwork owned to type_of_artwork
SELECT artist.name AS artist, artwork.title AS title_of_piece, artwork.year_created AS year, artwork.type AS type_of_artwork
FROM artist
JOIN artwork
ON artist.name = artwork.artist_name;

-- 5) Refine the results of your query to find and return only the Print types of artwork;
SELECT artist.name AS artist, artwork.title AS title_of_piece, artwork.year_created AS year, artwork.type AS type_of_artwork
FROM artist
JOIN artwork
ON artist.name = artwork.artist_name
WHERE type_of_artwork LIKE 'Print';

-- 6) Refine the results of your query to find and return only the Print types of artwork with the title_of_piece as Gorgeous One.
SELECT artist.name AS artist, artwork.title AS title_of_piece, artwork.year_created AS year, artwork.type AS type_of_artwork
FROM artist
JOIN artwork
ON artist.name = artwork.artist_name
WHERE type_of_artwork LIKE 'Print'
AND title_of_piece LIKE 'Gorgeous One';

-- 7) Update the query to find and return only the Painting types of artwork with the title_of_piece as Love Line.
SELECT artist.name AS artist, artwork.title AS title_of_piece, artwork.year_created AS year, artwork.type AS type_of_artwork
FROM artist
JOIN artwork
ON artist.name = artwork.artist_name
WHERE type_of_artwork LIKE 'Painting'
AND title_of_piece LIKE 'Love Line';
