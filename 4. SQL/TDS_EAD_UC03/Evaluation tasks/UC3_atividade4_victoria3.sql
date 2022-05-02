ALTER TABLE `UC3_atividade2`.`consulta` 
CHANGE COLUMN `data` `data_` DATE NULL DEFAULT NULL;

-- Todos os dados e o valor médio das consultas do ano de 2020 e das que foram feitas sob convênio.
select id, data_, horario, valor, id_paciente, id_convenio, id_medico, avg(valor) as media_valor_consultas
from consulta
where year(consulta.data_) = 2020 and not id_convenio = 8
group by ID;

-- Todos os dados das internações que tiveram data de alta maior que a data prevista para a alta.
select *
from internacao
where alta_efetiva > previsao_alta;

-- Receituário completo da primeira consulta registrada com receituário associado.
select *
from consulta
join receituario
on id_consulta = consulta.ID
order by consulta.data_
limit 1;

-- Todos os dados da consulta de maior valor e também da de menor valor (ambas as consultas não foram realizadas sob convênio).
select min(valor), max(valor)
from consulta
where id_convenio = 8;

-- Todos os dados das internações em seus respectivos quartos, calculando o total da internação a partir do valor de diária do quarto e o número de dias entre a entrada e a alta.
select internacao.id, quarto.numero as numero_quarto, internacao.data_entrada, internacao.previsao_alta, internacao.alta_efetiva, internacao.procedimentos, datediff(alta_efetiva, previsao_alta)*tipo_quarto.valor_diaria as valor_total
from internacao join 
(tipo_quarto join quarto
on quarto.id_tipo_quarto = tipo_quarto.id)
on internacao.id_quarto = quarto.id;

-- Outra maneira
select internacao.id, quarto.numero as quarto_numero, internacao.data_entrada,
internacao.previsao_alta, internacao.alta_efetiva, internacao.procedimentos,
datediff(data_entrada, alta_efetiva)*tipo_quarto.valor_diaria as valor_total
from internacao, quarto, tipo_quarto
where quarto.id_tipo_quarto = tipo_quarto.id and internacao.id_quarto = quarto.id
order by numero;

-- Data, procedimento e número de quarto de internações em quartos do tipo “apartamento”.
select data_entrada, procedimentos, ID_quarto
from INTERNACAO
join quarto
on internacao.id_quarto = quarto.id
where internacao.id_quarto = 91;

-- Nome do paciente, data da consulta e especialidade de todas as consultas em que os pacientes eram menores de 18 anos na data da consulta e cuja especialidade não seja “pediatria”, ordenando por data de realização da consulta
INSERT INTO consulta (ID, data_, horario, valor, ID_paciente, ID_convenio) VALUES ('61', '2020-04-10', '17:45:00', '300', '40', '8');

select paciente.nome as nome_paciente, consulta.data_ as data_consulta, categoria.descricao as especialidade 
from consulta
join paciente ON consulta.id_paciente = paciente.id
join medico on consulta.ID_medico = medico.id
join categoria on categoria.id = medico.id_categoria
where (year(current_date()) - year(paciente.nascimento) < 18) and descricao <> 'Pediatria'
order by data_;

-- Nome do paciente, nome do médico, data da internação e procedimentos das internações realizadas por médicos da especialidade “gastroenterologia”, que tenham acontecido em “enfermaria”.
insert into INTERNACAO values ('99', '2019/03/07', '2019/03/10', '2019/03/12', 'Paciente teve complicações durante a execução de uma endoscopia. Teve uma hemorragia contida e ficou em observação até ficar estável', '89', '18', '37', '80', '85');
UPDATE INTERNACAO SET ID_paciente_internado = 37 WHERE (ID = 99);

select paciente.nome as nome_paciente, medico.nome as nome_medico, internacao.data_entrada, internacao.procedimentos 
from internacao
join medico ON medico.id = internacao.ID_medico_resposnsavel
join quarto ON internacao.id_quarto = quarto.id
join tipo_quarto on quarto.id_tipo_quarto = tipo_quarto.id
join paciente ON paciente.id = internacao.id_paciente_internado
join categoria ON categoria.id = medico.id_categoria 
where categoria.descricao = 'Gastroenterologia' and tipo_quarto.descricao = 'Enfermaria';

-- Os nomes dos médicos, seus CRMs e a quantidade de consultas que cada um realizou.
select medico.nome, medico.crm, count(medico.id) as total_consultas
from consulta
join medico
on consulta.id_medico = medico.id
group by medico.id;

-- Os nomes, CREs e número de internações de enfermeiros que participaram de mais de uma internação;
select internacao.id as ID_internacao, enfermeiro.nome, enfermeiro.cre 
from internacao join enfermeiro
on internacao.enfermeiro_resp_1 and internacao.enfermeiro_resp_2 = enfermeiro.id
order by internacao.enfermeiro_resp_1;
