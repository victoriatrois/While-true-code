DESC pessoas;

ALTER TABLE pessoas
ADD COLUMN profissao varchar(10) AFTER nome;

ALTER TABLE  pessoas
drop column profissao;

SELECT * FROM pessoas;

CREATE TABLE IF NOT EXISTS cursos (
	nome varchar(30) NOT NULL UNIQUE,
    descricao text,
    carga int UNSIGNED,
    totalaulas int unsigned,
    ano year DEFAULT '2016'
    )
    default charset = utf8mb4;
    
ALTER table cursos
ADD column idcurso int FIRST;

ALTER TABLE cursos
ADD primary key(idcurso);