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

-- Data, procedimento e número de quarto de internações em quartos do tipo “apartamento”.
select data_entrada, procedimentos, ID_quarto
from INTERNACAO
join quarto
on internacao.id_quarto = quarto.id
where internacao.id_quarto = 91;

-- Nome do paciente, data da consulta e especialidade de todas as consultas em que os pacientes eram menores de 18 anos na data da consulta e cuja especialidade não seja “pediatria”, ordenando por data de realização da consulta
select paciente.nome as nome_paciente, consulta.data_, medico.id_categoria as especialidade
from PACIENTE join
(consulta join medico
on medico.id_categoria = consulta.id_medico)
on paciente.id=consulta.id_paciente
where medico.id_categoria = 11 and current_date() - paciente.nascimento < 18
order by data_;

-- Nome do paciente, nome do médico, data da internação e procedimentos das internações realizadas por médicos da especialidade “gastroenterologia”, que tenham acontecido em “enfermaria”.
select paciente.nome as nome_paciente, medico.nome as nome_medico, internacao.data_entrada, internacao.procedimentos
from paciente, medico, internacao
where medico.id = 11 and id_quarto = 3;

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
