# Considerando o banco de dados disponível no moodle (bd2), faça as seguintes consultas:

# 1) Liste todas as empresas que tenham "filial" no nome
SELECT 
    nome
FROM
    empresa
WHERE
    nome LIKE '%filial%';

# 2) Liste todos os funcionários com o seu setor, formando um campo neste formato: 
# "A funcionária {nome} pertence ao setor: {setor}" ou
# "O funcionário {nome} pertence ao setor: {setor}", dependendo do sexo.

SELECT 
    CONCAT(IF(funcionario.sexo = 'feminino',
                'A funcionária ',
                'O funcionário '),
            funcionario.nome,
            ' é do setor ', 
    setor.nome)
FROM
    funcionario
        JOIN
    setor USING (setor_id);

# 3) Liste todos os setores, exibindo o nome do chefe, caso o tenha
SELECT 
    setor.nome AS setor, funcionario.nome AS chefe
FROM
    setor
        LEFT JOIN
    funcionario ON funcionario.funcionario_id = setor.chefe;

# 4) Liste todas as empresas, seus setores e funcionários,
# incluindo as empresas que não têm setor e setores que não tenham funcionários
SELECT 
    empresa.nome AS empresa,
    setor.nome AS setor,
    funcionario.nome AS funcionario
FROM
    setor
        RIGHT JOIN
    empresa USING (empresa_id)
        LEFT JOIN
    funcionario USING (setor_id);

# 5) Liste todos os setores que não tenham funcionários
SELECT 
    setor.nome AS setor
FROM
    setor
        LEFT JOIN
    funcionario USING(setor_id)
WHERE
    funcionario.setor_id IS NULL;

# 6) Liste todos os chefes e seus salários
# numero total de chefes:
SELECT 
    COUNT(chefe) AS count_of_chefe
FROM
    setor
WHERE
    chefe IS NOT NULL;

# a consulta de chefes e seus salários deve ter 10 registros:
# o jeito que pensei originalmente:
SELECT 
    funcionario.nome AS chefe, funcionario.salario
FROM
    setor
        LEFT JOIN
    funcionario ON setor.chefe = funcionario.funcionario_id
WHERE
    funcionario.nome IS NOT NULL
        AND funcionario.salario IS NOT NULL;

# o jeito do profe:
SELECT 
    funcionario.nome AS chefe, funcionario.salario
FROM
    setor
        JOIN
    funcionario ON setor.chefe = funcionario.funcionario_id;
        
# o jeito "bonito":
SELECT 
    funcionario.nome AS chefe, funcionario.salario
FROM
    setor
        INNER JOIN
    funcionario ON setor.chefe = funcionario.funcionario_id;

# 7) Liste os 3 funcionários com maior salário
SELECT 
    funcionario.nome, funcionario.salario
FROM
    funcionario
WHERE
    sexo = 'masculino'
ORDER BY salario DESC
LIMIT 3;

# 8) Liste os 3 funcionários com menor salário
SELECT 
    funcionario.nome, funcionario.salario
FROM
    funcionario
WHERE
    sexo = 'masculino'
ORDER BY salario
LIMIT 3;

# 9) Liste o homem com o maior salário
SELECT 
    funcionario.nome, funcionario.salario
FROM
    funcionario
WHERE
    sexo = 'masculino'
ORDER BY salario DESC
LIMIT 1;

# 10) Liste a mulher com o maior salário
SELECT 
    funcionario.nome, funcionario.salario
FROM
    funcionario
WHERE
    sexo = 'feminino'
ORDER BY salario DESC
LIMIT 1;