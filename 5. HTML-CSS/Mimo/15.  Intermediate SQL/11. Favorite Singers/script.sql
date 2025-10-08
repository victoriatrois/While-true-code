-- 1) write a query to get the times_played from the songs in saved_playlist.
SELECT times_played
FROM saved_playlist;

-- 2) Retrieve only the average times_played from saved_playlist.
SELECT AVG(times_played)
FROM saved_playlist;

-- 3) select the song_id of songs from saved_playlist where times_played is greater than the average.
SELECT song_id
FROM saved_playlist
WHERE times_played >
(
  SELECT AVG(times_played)
  FROM saved_playlist
);

-- 4) select the singer from the songs table where their id is in the result of the previous query.
SELECT singer
FROM songs
WHERE id IN (
  SELECT song_id
  FROM saved_playlist
  WHERE times_played >
  (
    SELECT AVG(times_played)
    FROM saved_playlist
  )
);

-- 5) Modify the query so that it only returns a list of singers without duplicates.
SELECT DISTINCT singer
FROM songs
WHERE id IN (
  SELECT song_id
  FROM saved_playlist
  WHERE times_played >
  (
    SELECT AVG(times_played)
    FROM saved_playlist
  )
);