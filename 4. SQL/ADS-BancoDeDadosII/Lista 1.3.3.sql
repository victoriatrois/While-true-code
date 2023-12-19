use discos;

# 1. Realize uma consulta mysql para exibir todos os albuns;
# Minha resposta:
SELECT 
    *
FROM
    album;

# 2. Realize uma consulta mysql para exibir a banda e o nome do album;
# Minha resposta:
SELECT 
    banda, nome
FROM
    album;

# 3. Realize uma consulta mysql para exibir a banda com nome da coluna como conjunto e o nome do album como NomeDoAlbum;
# Minha resposta:
SELECT 
    banda AS conjunto, nome AS NomeDoAlbum
FROM
    album;

# 4. Realize uma consulta mysql para exibir a banda com nome da coluna como conjunto e o nome do album como NomeDoAlbum que sejam do estilo Rock e suas variações (ex: Hard Rock)
# Minha resposta:
SELECT 
    banda AS conjunto, nome AS NomeDoAlbum
FROM
    album
WHERE
    estilo LIKE '%Rock%';

# 5. Realize uma consulta mysql para exibir a banda com nome da coluna como conjunto e o nome do album como NomeDoAlbum que sejam do estilo Rock e suas variações (ex: Hard Rock) em ordem alfabética pelo nome da álbum
# Minha resposta:
SELECT 
    banda AS conjunto, nome AS NomeDoAlbum
FROM
    album
WHERE
    estilo LIKE '%Rock%'
ORDER BY nome;

# Resposta Sugerida:
SELECT 
    banda AS Conjunto, nome AS NomeDoAlbum
FROM
    album
WHERE
    estilo LIKE '%Rock%'
ORDER BY banda ASC;

# 6. Realize uma consulta mysql para exibir a banda com nome da coluna como conjunto e o nome do album como NomeDoAlbum que sejam do estilo Rock e suas variações (ex: Hard Rock) em ordem alfabética pelo nome da álbum, limitado a 2 albuns
# Minha resposta:
SELECT 
    banda AS conjunto, nome AS NomeDoAlbum
FROM
    album
WHERE
    estilo LIKE '%Rock%'
ORDER BY nome
LIMIT 2;

# Resposta Sugerida:
SELECT 
    banda AS Conjunto, nome AS NomeDoAlbum
FROM
    album
WHERE
    estilo LIKE '%Rock%'
ORDER BY banda ASC
LIMIT 2;

# 7. Realize uma consulta mysql para exibir a banda com nome da coluna como conjunto e o nome do album como NomeDoAlbum que sejam do estilo Rock e suas variações (ex: Hard Rock) em ordem alfabética pelo nome da álbum, a partir do 3o album limitado a 2 albuns
# Minha resposta:
SELECT 
    banda AS conjunto, nome AS NomeDoAlbum
FROM
    album
WHERE
    estilo LIKE '%Rock%'
ORDER BY nome
LIMIT 2 OFFSET 2; #Não vimos OFFSET semestre passado :)

# Resposta Sugerida:
SELECT 
    banda AS Conjunto, nome AS NomeDoAlbum
FROM
    album
WHERE
    estilo LIKE '%Rock%'
ORDER BY banda ASC
LIMIT 2 , 2;

# Joins foram muito pouco trabalhadas semestre passado
# São o tipo de coisa que consigo fazer usando o gpt como auxílio.
# 8. Realize uma consulta mysql para exibir a banda com nome da coluna como conjunto, o nome do album como NomeDoAlbum e nome da gravadora como Gravadora que sejam do estilo Rock e suas variações (ex: Hard Rock) em ordem alfabética pelo nome da banda
# Minha resposta:
SELECT 
    album.banda AS Conjunto,
    album.nome AS NomeDoAlbum,
    gravadora.nome AS Gravadora
FROM
    album
        JOIN
    gravadora ON album.gravadora_id = gravadora.gravadora_id
WHERE
    album.estilo LIKE '%Rock%'
ORDER BY album.banda;

# Resposta Sugerida:
SELECT 
    album.banda AS Conjunto,
    album.nome AS NomeDoAlbum,
    gravadora.nome AS Gravadora
FROM
    album
        JOIN
    gravadora
WHERE
    album.estilo LIKE '%Rock%'
ORDER BY album.banda ASC;

# 9. Realize uma consulta mysql para exibir a banda com nome da coluna como conjunto, o nome do album como NomeDoAlbum,
# nome da gravadora como Gravadora e data de lançamento do disco que sejam do estilo Rock e suas variações (ex: Hard Rock)
# em ordem alfabética pelo nome da banda
# Minha resposta:
SELECT 
    album.banda AS Conjunto,
    album.nome AS NomeDoAlbum,
    gravadora.nome AS Gravadora,
    disco.data_producao AS DataLancamento
FROM
    album
        JOIN
    gravadora ON album.gravadora_id = gravadora.gravadora_id
        JOIN
    disco ON album.album_id = disco.album_id
WHERE
    album.estilo LIKE '%Rock%'
ORDER BY album.banda;

# Resposta Sugerida:
SELECT 
    album.banda AS Conjunto,
    album.nome AS NomeDoAlbum,
    gravadora.nome AS Gravadora,
    disco.data_producao AS DataLancamento
FROM
    album
        JOIN
    gravadora USING (gravadora_id)
        JOIN
    disco USING (album_id)
WHERE
    album.estilo LIKE '%Rock%'
ORDER BY album.banda;

# 10. Realize uma consulta mysql para exibira quantidade de bandas de cada estilo de gravadora que possua "Atlantic" no nome
# Minha resposta:
SELECT 
    gravadora.abr AS Gravadora,
    COUNT(DISTINCT album.banda) AS QuantidadeDeBandas
FROM
    gravadora
        JOIN
    album ON gravadora.gravadora_id = album.gravadora_id
WHERE
    gravadora.nome LIKE '%Atlantic%'
GROUP BY gravadora.abr;