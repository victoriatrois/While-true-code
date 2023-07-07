#Crie os comandos de inserção, atualização, exclusão e seleção, de acordo com as definições abaixo. Use para esse exercício o modelo físico em anexo.

#1 - Faça as inserções dos seguintes alunos:

insert into escola.aluno (nome, num_matricula, endereco, telefone, rg, cpf)
values ('Marcos Paulo', 12354, 'Rua dos Eucaliptos', '(51)3247-0987', '8878788', '1234455-90'),
('Caroline Silveira', 8667, 'Rua das Margaridas', '(51)98765-9877', '7657657', '1786786-09'),
('Inácio Pena', 65654, 'Rua dos Marimbondos', '(51)7676-87709', '76576588', '54675-87'),
('Carla Farias', 8987, 'Rua das Gurias', '(51)9865-5576', '7657657', '9876434-19');

#2 - Faça as inserções dos seguintes professores:
insert into escola.professor (nome, ra, endereco, telefone, email)
values ('Joana Mendes', 1223, 'Rua das Princesas', '(53)98767-9770', 'joana.mendes@gmail.com'),
('Flávio Canto', 4523, 'Rua dos Cangurus', '(53)87654-9087', 'flavio.cantop@hotmail.com');


#3 - Faça as inserções dos seguintes cursos:
insert into escola.curso (id, nome, duracao, professor_num_matricula)
values (1, 'Informática Básica', 60, 4523),
(2, 'Informática Avançada', 90, 1223);

#4 - Faça as inserções das seguintes salas:
insert into escola.sala (id, numero, nome)
values (1, 401, 'Laboratório de Info I'),
(2, 404, 'Laboratório de Info II'),
(3, 403, 'Laboratório de Info III');

#5 - Os estudantes estão matriculados nos seguintes cursos:
insert into escola.aluno_has_turma (aluno_ra, curso_id)
values (12354, 1),
(8667, 1),
(8667, 2),
(65654, 2),
(8987, 1),
(8987, 2);

#6 - Altere o tipo do dado periodo de int para varchar(5):
alter table escola.turma
MODIFY COLUMN periodo varchar(5);

#7 - Os cursos tem as seguintes turmas:
insert into escola.turma (codigo, periodo, curso_id, sala_id)
values(1, 'manha', 1, 1),
(2, 'tarde', 3, 3),
(3, 'tarde', 2, 2);

#8 - Matricule os alunos nas suas respectivas turmas:

(1, 'manhã', todos estudantes do curso nessa turma),
(2, 'noite', Caroline Silveira e Inácio Pena),
(2, 'tarde', Carla Farias);
#9 - Selecione as turmas que tem aula na sala 401.

#10 - Selecione os estudantes, as turmas e o professor do curso de informática avançada.

#11 - Atualize a turma de Informática Básica para o turno da tarde.

#12 - Exclua o estudante Inácio Pena do da turma de Informática Básica;