-- Crie uma coluna “em atividade” para os médicos, indicando se ele ainda está atuando no hospital ou não.
alter table MEDICO
add column em_atividade bool;

-- Crie script para atualizar ao menos dois médicos como inativos e os demais em atividade.
UPDATE medico
SET em_atividade = 1
where id between 16 and 25;

UPDATE medico
SET em_atividade = 0
WHERE id between 23 and 24;

-- Crie script para atualizar as datas de alta nas internações em quartos de enfermaria para três dias após a entrada.
update internacao
set alta_efetiva = "2015/01/10"
where id = 92;

update internacao
set alta_efetiva = "2018/11/02"
where id = 97;

-- Crie script para excluir o último convênio cadastrado e todas as consultas realizadas com esse convênio.
delete from convenio
where id = 4;

delete from consulta
where ID_convenio = 4;


