drop database escola;
create database escola;
use escola;
create table aluno (
   ra INT,
   nome VARCHAR(100) not null,
   endereco VARCHAR(200),
   telefone VARCHAR(15),
   email VARCHAR(200),
   rg VARCHAR(11),
   cpf VARCHAR(11) not null,
   primary key (ra)
);
create table professor (
   num_matricula INT, 
   nome VARCHAR(100) not null, 
   endereco VARCHAR(200),
   telefone VARCHAR(15), 
   email VARCHAR(200) not null,
   primary key (num_matricula)
);
create table sala (
   numero INT,
   nome varchar(100),
   id INT,
   primary key (id)
);
create table curso (
   duracao INT, 
   id INT, 
   professor_num_matricula INT not null,
   primary key (id),
   foreign key (professor_num_matricula) 
               references professor(num_matricula)
);
create table curso_has_aluno (
   curso_id INT not null,
   aluno_ra INT not null,
   primary key (curso_id, aluno_ra),
   foreign key (curso_id) references curso(id),
   foreign key (aluno_ra) references aluno(ra)
);
create table turma (
   codigo INT,
   periodo INT, 
   curso_id INT not null,
   sala_id INT not null,
   primary key (codigo),
   foreign key (curso_id) references curso(id),
   foreign key (sala_id) references sala(id)
);
create table aluno_has_turma (
   aluno_ra INT not null,
   turma_codigo INT not null,
   primary key (aluno_ra, turma_codigo),
   foreign key (aluno_ra) references aluno(ra),
   foreign key (turma_codigo) references turma(codigo)
);

/*
drop table aluno_has_turma;

comando para apagar uma tabela.
*/

/* Comando de alteração da tabela - adionar campo */
alter table curso 
add nome varchar(100) not null;

alter table curso 
add descricao text not null;

/* Comando de alteração da tabela - retirar campo */
alter table curso 
drop column descricao;

/* Comando de alteração da tabela - modificar campo */
alter table curso 
modify column nome varchar(200) not null;

/* Comando de alteração da tabela - excluir uma chave */
alter table curso 
drop constraint curso_ibfk_1;

/* Comando de alteração da tabela - adicionar chaves estrangeira */
alter table curso 
add foreign key (professor_num_matricula) references professor(num_matricula);