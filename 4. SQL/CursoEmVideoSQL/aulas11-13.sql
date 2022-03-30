SELECT 
    ano, nome, descricao
FROM
    cursos
WHERE
    ano <= '2015'
ORDER BY ano , nome;

SELECT 
    nome, ano
FROM
    cursos
WHERE
    ano BETWEEN 2014 AND 2016
ORDER BY ano DESC , nome;

SELECT 
    nome, descricao, ano
FROM
    cursos
WHERE
    ano in (2014, 2016, 2020)
ORDER BY ano;


SELECT 
    nome, carga, totaulas
FROM
    cursos
WHERE
    carga > 35 and totaulas < 30;
    
SELECT 
    nome, carga, totaulas
FROM
    cursos
WHERE
    carga > 35 or totaulas < 30;