# aula 06 - 28 de setembro de 2023
# Gerem consultas com e sem subconsultas para as seguintes solicitações:
# 1. Selecione os funcionários de setores que não possuam chefe.

# Com subconsulta:
SELECT 
    funcionario.nome
FROM
    funcionario
WHERE
    funcionario.setor_id IN (SELECT
            setor.setor_id
        FROM
        funcionario
        join
            setor
        WHERE
            setor.setor_id = funcionario.setor_id
                AND setor.chefe IS NULL);
 
 # Sem subconsulta:
 SELECT 
    funcionario.nome AS funcionario
FROM
    funcionario
        JOIN
    setor USING (setor_id)
WHERE
    setor.chefe IS NULL;
    
# 2. Selecione o nome dos funcionários (deve ser chamado de NomeDoFuncionario) e nome do setor (deve ser chamado de NomeDoSetor) que sejam apenas dos setores 3 ou 4.
# Com subconsulta:
SELECT 
    funcionario.nome AS NomeDoFuncionario,
    (SELECT 
            setor.nome
        FROM
            setor
        WHERE
            setor.setor_id = funcionario.setor_id) AS NomeDoSetor
FROM
    funcionario
WHERE
    funcionario.setor_id = 3
        OR funcionario.setor_id = 4;

# Sem subconsulta:
SELECT 
    funcionario.nome AS NomeDoFuncionario,
    setor.nome AS NomeDoSetor
FROM
    funcionario
        JOIN
    setor USING (setor_id)
WHERE
    setor.setor_id = 3
        OR setor.setor_id = 4;


# 3. Selecione o nome dos funcionários (deve ser chamado de NomeDoFuncionario), salário do funcionário  (deve ser chamado de Salário), e nome do setor (deve ser chamado de NomeDoSetor) que sejam apenas dos setores 3 ou 4 ordenados pelo salário em cada setor.
# Com subconsulta:
SELECT 
    funcionario.nome AS NomeDoFuncionario,
    funcionario.salario AS Salário,
    setor.nome AS NomeDoSetor
FROM
    funcionario
        JOIN
    setor ON funcionario.setor_id = setor.setor_id
WHERE
    setor.setor_id IN (SELECT 
            setor_id
        FROM
            setor
        WHERE
            setor_id IN (3 , 4))
ORDER BY setor.setor_id , funcionario.salario;

# Sem subconsulta:
SELECT 
    funcionario.nome AS NomeDoFuncionario,
    funcionario.salario AS Salario,
    setor.nome AS NomeDoSetor
FROM
    funcionario
        JOIN
    setor USING (setor_id)
WHERE
    setor.setor_id IN (3, 4)
ORDER BY setor.setor_id, funcionario.salario;


# 4. Liste todos os nomes de chefe de setor (Chefe), o respectivo nome do setor (Setor), o salario (Salário) e o nome da empresa (Empresa), ordenados pelo salário (do maior para o menor).
# Com subconsulta:
SELECT 
    (SELECT nome FROM funcionario WHERE funcionario_id = setor.chefe) AS chefe,
    (SELECT salario FROM funcionario WHERE funcionario_id = setor.chefe) AS Salario,
    setor.nome AS Setor,
    (SELECT nome FROM empresa WHERE empresa_id = setor.empresa_id) AS Empresa
FROM
    setor
WHERE
    setor.chefe IS NOT NULL
ORDER BY Salario DESC;

# Sem subconsulta:
SELECT 
    funcionario.nome AS chefe,
    funcionario.salario AS Salario,
    setor.nome AS Setor,
    empresa.nome AS Empresa
FROM
    funcionario
        JOIN
    setor ON funcionario.setor_id = setor.setor_id
        LEFT JOIN
    empresa ON setor.empresa_id = empresa.empresa_id
WHERE
    funcionario.funcionario_id = setor.chefe
ORDER BY funcionario.salario desc;

# 5. Envie o sql na página para conferência: 28/09
