# Aula 02 - 31 de agosto de 2023
use bd2;

SELECT 
    nome,
    salario
FROM
    funcionario
WHERE
    sexo = 'feminino';
    
SELECT 
    *
FROM
    funcionario
        JOIN
    setor
		JOIN
    empresa
WHERE
    funcionario.setor_id = setor.setor_id
        AND setor.empresa_id = empresa.empresa_id;
        
SELECT 
    *
FROM
    funcionario
        JOIN
    setor ON funcionario.setor_id = setor.setor_id
        JOIN
    empresa ON setor.empresa_id = empresa.empresa_id;
    
SELECT 
    *
FROM
    funcionario
        JOIN
    setor USING (setor_id)
        JOIN
    empresa USING (empresa_id);
    

SELECT 
    *
FROM
    funcionario
        JOIN
    setor USING (setor_id)
        JOIN
    empresa USING (empresa_id);

SELECT 
    *
FROM
    funcionario
        LEFT JOIN
    setor USING (setor_id)
        LEFT JOIN
    empresa USING (empresa_id);
    
SELECT 
    AVG(salario)
FROM
    funcionario
WHERE
    sexo = 'feminino';
    
SELECT 
    AVG(salario)
FROM
    funcionario
WHERE
    sexo = 'masculino';
    
SELECT 
    sexo, AVG(salario)
FROM
    funcionario
GROUP BY sexo;

SELECT 
    setor_id, AVG(salario)
FROM
    funcionario
GROUP BY setor_id;

