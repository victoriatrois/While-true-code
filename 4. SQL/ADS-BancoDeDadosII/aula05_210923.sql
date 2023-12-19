# Aula 05 - 21 de setembro de 2023
# selecione os setores que tem chefe mulher
SELECT 
    setor.nome
FROM
    setor
WHERE
    EXISTS( SELECT 
            funcionario.nome
        FROM
            funcionario
        WHERE
            funcionario.setor_id = setor.setor_id
                AND setor.chefe = funcionario.funcionario_id
                AND funcionario.sexo = 'feminino');
                
# selecione os setores que tem chefe homem
SELECT 
    setor.nome
FROM
    setor
WHERE
    EXISTS( SELECT 
            funcionario.nome
        FROM
            funcionario
        WHERE
            funcionario.setor_id = setor.setor_id
                AND setor.chefe = funcionario.funcionario_id
                AND funcionario.sexo = 'masculino');
                
# liste os funcionarios que não possuem chefes
SELECT 
    funcionario.nome
FROM
    funcionario
WHERE
    funcionario.setor_id IN (SELECT
            setor.setor_id
        FROM
            setor
        WHERE
            setor.setor_id = funcionario.setor_id
                AND setor.chefe IS NULL);
                
# a consulta oposta pode retornar funcionarios que estão na lista de chefe
# mais foram deletados na lista de funcionarios.

# Retorne os funcionarios que têm salário maior que todos os chefes.
SELECT 
    funcionario.nome, funcionario.salario
FROM
    funcionario
WHERE
    funcionario.salario > ALL (SELECT 
            chefe.salario
        FROM
            funcionario AS chefe
        WHERE
            chefe.funcionario_id IN (SELECT 
                    setor.chefe
                FROM
                    setor));

# Retorne as funcionarias que têm salário maior que ao menos um chefe.
SELECT 
    funcionario.nome, funcionario.salario
FROM
    funcionario
WHERE
    funcionario.salario > ANY (SELECT 
            chefe.salario
        FROM
            funcionario AS chefe
        WHERE
            chefe.funcionario_id IN (SELECT 
                    setor.chefe
                FROM
                    setor) and funcionario.sexo = 'feminino');
                    
# Liste o nome do setor e o nome do chefe do setor
SELECT 
    setor.nome AS setor,
    (SELECT 
            funcionario.nome
        FROM
            funcionario
        WHERE
            funcionario.funcionario_id = setor.chefe
                AND funcionario.setor_id = setor.setor_id) AS chefe
FROM
    setor;
    
# Liste os funcionarios e indique se eles são chefes ou escravos
SELECT 
    funcionario.nome AS funcionario,
    IF(EXISTS( SELECT 
                *
            FROM
                setor
            WHERE
                setor.chefe = funcionario.funcionario_id),
        'chefe',
        'escravo') AS Situacao
FROM
    funcionario;
    
# Lista os id e o nome das empresas sem tuplas repetidas
(select empresa_id, nome from empresa) UNION
(select empresa_id, nome from empresa);

# Lista os id e o nome das empresas mesmo que tuplas repitam
(select empresa_id, nome from empresa) UNION ALL
(select empresa_id, nome from empresa);

