CREATE DATABASE cadastro
DEFAULT CHARACTER SET utf8mb4 /*comando para aceitar caracteres especiais*/
DEFAULT COLLATE utf8mb4_general_ci;

create table pessoas (
id int NOT NULL auto_increment,
nome varchar(30) NOT NULL,
nascimento date,
sexo enum('M', 'F'),
peso decimal (5,2),
altura decimal(3,2),
nacionalidade varchar(20) DEFAULT 'Brasileire',
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

/*create table e database são comandos DDL (data definition language)
já o insert into é um DML (data manipulation language) */
INSERT INTO pessoas VALUES
(DEFAULT, 'Ana', '1975-11-02', 'F', '52.3', '1.45', 'Estadounidense'),
(DEFAULT, 'Pedro', '2000-07-15', 'M', '62.5', '1.60', DEFAULT),
(DEFAULT, 'Maria', '1999-05-30', 'F', '75.9', '1.70', 'Portuguese');

SELECT 
    *
FROM
    pessoas
    
