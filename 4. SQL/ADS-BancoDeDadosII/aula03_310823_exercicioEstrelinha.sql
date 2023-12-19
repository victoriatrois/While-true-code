# Exercício estrelinha
# 1) Selecione os funcionários que estejam nos setores de ids: 3,7, 11 ou 13.
SELECT 
    nome
FROM
    funcionario
WHERE
    funcionario_id = 3 OR 7 OR 11 OR 13;
    
# 2) Selecione os funcionários que ganham entre 1000 e 1300, ordenando pelo maior salário.
SELECT 
    funcionario.nome, funcionario.salario
FROM
    funcionario
WHERE
    funcionario.salario > 1000
        AND
	funcionario.salario < 1300
ORDER BY funcionario.salario DESC;

# 3)Selecione todos os funcionários que tenham o sobrenome Gomes.
SELECT 
    nome
FROM
    funcionario
WHERE
    nome LIKE '%Gomes%';
    
# 4) Liste todos os funcionários que tenham uma chefe mulher.
SELECT 
    funcionario.nome AS funcionario, chefe.nome AS chefa # pedir pra revisar o chefe. ... porque não tem uma tabela chamada chefe.
FROM
    funcionario
        JOIN
    setor ON funcionario.setor_id = setor.setor_id
        JOIN
    funcionario chefe ON setor.chefe = chefe.funcionario_id;

# 5) Liste as empresas, junto com a média salarial delas.
SELECT 
    empresa.nome AS empresa,
    AVG(funcionario.salario) AS mediaSalarial
FROM
    empresa
        LEFT JOIN
    setor ON empresa.empresa_id = setor.empresa_id
        LEFT JOIN
    funcionario ON setor.setor_id = funcionario.funcionario_id
GROUP BY empresa.nome;
