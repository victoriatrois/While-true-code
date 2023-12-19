# Lista 1.4.1
# 1. Realize uma consulta mysql para exibir todas as gravadoras;
# Minha resposta:
SELECT 
    *
FROM
    gravadora;

# 2. Realize uma consulta mysql para mostrar todos os discos da gravadora Atlantic;
# Minha resposta:
SELECT
    album.nome, album.banda, disco.data_producao
FROM
    album
        JOIN
    gravadora ON album.gravadora_id = gravadora.gravadora_id
        JOIN
    disco ON album.album_id = disco.album_id
WHERE
    gravadora.nome LIKE 'Atlantic%';
# Resposta sugerida:
    SELECT 
    *
FROM
    disco AS d
        INNER JOIN
    gravadora AS g ON d.gravadora_id = g.gravadora_id
WHERE
    g.gravadora_id = 1;

# 3. Realize uma consulta mysql para mostrar todas as musicas e seus respectivos albuns da gravadora Atlantic
# Minha resposta:
SELECT 
    album.nome,
    album.banda,
    musica.nome
FROM
    album
        JOIN
    gravadora ON album.gravadora_id = gravadora.gravadora_id
        JOIN
    musica ON album.album_id = musica.album_id
WHERE
    gravadora.nome LIKE 'Atlantic%';

# Resposta Sugerida:
SELECT 
    musica.nome,
    album.nome,
    gravadora.nome
FROM
    musica
        LEFT JOIN
    album USING (album_id)
        LEFT JOIN
    gravadora USING (gravadora_id)
WHERE
    gravadora.nome LIKE '%Atlantic%';

# 4. Realize uma consulta mysql para mostrar todas as musicas do estilo Rock
# Minha resposta:
SELECT 
    album.nome,
    album.banda,
    musica.nome
FROM
    album
        JOIN
    musica ON album.album_id = musica.album_id
WHERE
    album.estilo LIKE 'Rock%';

# Resposta sugerida:
SELECT 
    musica.nome,
    album.estilo
FROM
    album
        LEFT JOIN
    musica USING (album_id)
WHERE
    album.estilo = 'Rock';

# Não vimos CONCAT semestre passado :)
# 5. Realize uma consulta mysql para apresentar todas as musicas, mas concatenando ''Album - Musica''
# Minha resposta:
SELECT 
    CONCAT(album.nome, ' - ', musica.nome) AS 'Album - Musica'
FROM
    album
        JOIN
    musica ON album.album_id = musica.album_id;

# Resposta sugerida:
SELECT 
    CONCAT(album.nome, ' - ', musica.nome)
FROM
    musica
        JOIN
    album USING (album_id);