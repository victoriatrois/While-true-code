# 1) Crie views paras as consultas criadas nos exercícios de subconsultas.

-- View for exercise 4: Show all songs of the "Rock" style
CREATE VIEW SongsRock AS
SELECT album.nome AS NomeDoAlbum, album.banda AS Banda, album.musicas AS Musica
FROM album
WHERE album.estilo LIKE 'Rock%';

-- View for exercise 5: Present all songs, concatenating 'Album - Musica'
CREATE VIEW SongsConcatenated AS
SELECT CONCAT(album.nome, ' - ', album.musicas) AS AlbumMusica
FROM album;

# 2) Crie uma view chamada FuncionarioBasico que possua as colunas Nome do Funcionário, Salário e Data de Nascimento

# 3) Atualize a view, alterando o salário de 2 funcionários.

# 4) Consulte a view e a tabela funcionario original e verifique se a atualização foi concretizada.

# 5) Apague todas as views criadas.