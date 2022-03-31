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
    
SELECT 
    *
FROM
    cursos
WHERE
    nome LIKE 'P%';

SELECT 
    *
FROM
    cursos
WHERE
    nome LIKE '%A';
    
SELECT 
    *
FROM
    cursos
WHERE
    nome NOT LIKE '%A%';
    
SELECT 
    *
FROM
    cursos
WHERE
    nome LIKE 'PH%P%';
    
SELECT 
    *
FROM
    cursos
WHERE
    nome LIKE 'P__T%';
    
SELECT distinct
	nacionalidade
FROM
    gafanhotos
ORDER BY
	nacionalidade;
    
SELECT distinct
	carga
FROM
    cursos;
    
SELECT count(*)
FROM
    cursos
WHERE carga > '40';

SELECT count(nome)
FROM
    cursos;
    
SELECT max(carga)
FROM
    cursos;

SELECT max(totaulas)
FROM
    cursos
WHERE
	ano = '2016';
    
SELECT min(totaulas)
FROM
    cursos
WHERE
	ano = 2016;
    
SELECT sum(totaulas)
FROM
    cursos
WHERE
	ano = 2016;
    
SELECT avg(totaulas)
FROM
    cursos
WHERE
	ano = 2016;
    
/* 1selecione somente as gafanhotos mulheres*/

/* 2 todos os dados de quem nasceu antre 2000-01-01 e 2015-12-31*/

/* 3 selecione os nomes de todos homens programadores*/

/* 4 selecione as mulheres que nasceram no BR e cujo nome começa com J*/

/* 5 selecione nome e nacionalidade dos homens que tem silva no nome, não nasceram no BR e pesam menos que 100Kg*/

/* 6 extraia a maior altura entre gafanhotos homens que moram no BR*/

/* 7 extraia a média do peso dos gafanhotos cadastrados*/

/* 8 extraia qual o menor peso entra as gafanhoto mulheres que nasceram fora do BR e entre 1990-01-01 e 2000-12-31*/

/* 9 extraia quantas gafanhoto mulheres têm mais que 1.90 de altura*/


SELECT carga,
COUNT(nome)
FROM cursos
WHERE totaulas 
GROUP BY carga;

SELECT 
    ano, COUNT(*)
FROM
    cursos
WHERE
    totaulas > 30
GROUP BY ano
HAVING ano > 2013
ORDER BY COUNT(*) DESC;
/*selecionei*/
select avg(carga) from cursos;
/*filtrei*/
select * from cursos where ano > 2015
group by carga;
/*agrupei*/
select carga, count(*) from cursos where ano > 2015
group by carga
having carga > /*e filtrei o agrupamento*/(select avg(carga) from cursos);

/*lista com as profissões dos gafanhotos e seus respectivos quantitativos*/

/*Uma lista de quantos gafanhotos homens e mulheres nasceram após de 1o jan 2005*/

/*uma lista de gafanhoso que nasceram fora do brasil, onde nasceram e quantas pessoas moram em cada país SE tiverem mais de 3 gafanhotos morando lá*/

/*Uma lista agrupada pela altura dos gafanhotos mostrando quantas pessoas pesam mais de 100Kg e quantas pessoas estão acima da média de altura*/