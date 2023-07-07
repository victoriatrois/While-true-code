# Atividade individual 01

# exercicio 5
# Cole aqui os comandos para criação do modelo físico do modelo normalizado construído na questão 4. (CREATE DATABAE e CREATEs TABLEs):
CREATE SCHEMA IF NOT EXISTS `bailao` DEFAULT CHARACTER SET utf8;
USE `bailao`;

CREATE TABLE IF NOT EXISTS `bailao`.`ENDERECO` (
  `idENDERECO` INT NOT NULL,
  `logradouroEndereco` VARCHAR(20) NULL,
  `nomeEndereco` VARCHAR(100) NULL,
  `numeroEndereco` VARCHAR(6) NULL,
  PRIMARY KEY (`idENDERECO`));

CREATE TABLE IF NOT EXISTS `bailao`.`Gravadora` (
  `CNPJ` VARCHAR(14) NOT NULL,
  `razao_social` VARCHAR(100) NOT NULL,
  `ENDERECO_idENDERECO` INT NOT NULL,
  PRIMARY KEY (`CNPJ`),
  INDEX `fk_Gravadora_ENDERECO1_idx` (`ENDERECO_idENDERECO` ASC) VISIBLE,
  CONSTRAINT `fk_Gravadora_ENDERECO1`
    FOREIGN KEY (`ENDERECO_idENDERECO`)
    REFERENCES `bailao`.`ENDERECO` (`idENDERECO`));

CREATE TABLE IF NOT EXISTS `bailao`.`CIDADE` (
  `idCidade` INT NOT NULL,
  `nomeCidade` VARCHAR(100) NULL,
  PRIMARY KEY (`idCidade`));

CREATE TABLE IF NOT EXISTS `bailao`.`BANDA` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `ano_criacao` INT NOT NULL,
  `CIDADE_idCidade` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_BANDA_CIDADE1_idx` (`CIDADE_idCidade` ASC) VISIBLE,
  CONSTRAINT `fk_BANDA_CIDADE1`
    FOREIGN KEY (`CIDADE_idCidade`)
    REFERENCES `bailao`.`CIDADE` (`idCidade`));

CREATE TABLE IF NOT EXISTS `bailao`.`Album` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `data_lancamento` DATE NOT NULL,
  `midia` VARCHAR(50) NULL COMMENT 'Pode ser: CD, DVD ou Streamming',
  `Gravadora_CNPJ` VARCHAR(14) NULL,
  `BANDA_id` INT NOT NULL,
  PRIMARY KEY (`id`, `BANDA_id`),
  INDEX `fk_Album_Gravadora_idx` (`Gravadora_CNPJ` ASC) VISIBLE,
  INDEX `fk_Album_BANDA1_idx` (`BANDA_id` ASC) VISIBLE,
  CONSTRAINT `fk_Album_Gravadora`
    FOREIGN KEY (`Gravadora_CNPJ`)
    REFERENCES `bailao`.`Gravadora` (`CNPJ`),
  CONSTRAINT `fk_Album_BANDA1`
    FOREIGN KEY (`BANDA_id`)
    REFERENCES `bailao`.`BANDA` (`id`));

CREATE TABLE IF NOT EXISTS `bailao`.`MUSICOS` (
  `idMusicos` INT NOT NULL,
  `nomeMusico` VARCHAR(100) NULL,
  PRIMARY KEY (`idMusicos`));

CREATE TABLE IF NOT EXISTS `bailao`.`MUSICOS_compoem_BANDA` (
  `MUSICOS_idMusicos` INT NOT NULL,
  `BANDA_id` INT NOT NULL,
  PRIMARY KEY (`MUSICOS_idMusicos`, `BANDA_id`),
  INDEX `fk_MUSICOS_has_BANDA_BANDA1_idx` (`BANDA_id` ASC) VISIBLE,
  INDEX `fk_MUSICOS_has_BANDA_MUSICOS1_idx` (`MUSICOS_idMusicos` ASC) VISIBLE,
  CONSTRAINT `fk_MUSICOS_has_BANDA_MUSICOS1`
    FOREIGN KEY (`MUSICOS_idMusicos`)
    REFERENCES `bailao`.`MUSICOS` (`idMusicos`),
  CONSTRAINT `fk_MUSICOS_has_BANDA_BANDA1`
    FOREIGN KEY (`BANDA_id`)
    REFERENCES `bailao`.`BANDA` (`id`));

CREATE TABLE IF NOT EXISTS `bailao`.`TELEFONE` (
  `numero` VARCHAR(9) NOT NULL,
  `Gravadora_CNPJ` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`numero`, `Gravadora_CNPJ`),
  INDEX `fk_TELEFONE_Gravadora1_idx` (`Gravadora_CNPJ` ASC) VISIBLE,
  CONSTRAINT `fk_TELEFONE_Gravadora1`
    FOREIGN KEY (`Gravadora_CNPJ`)
    REFERENCES `bailao`.`Gravadora` (`CNPJ`));

# exercicio 6
# Crie comando(s) para adicionar o campo ano de extinção na tabela Banda (ALTER TABLE). O novo campo deve ser inteiro e pode ser nulo.
ALTER TABLE `bailao`.`BANDA`
add column anoDeExtincaoBanda int;

# exercicio 7
# Crie comando(s) INSERT para inserir pelo menos duas bandas que você goste na tabela banda.
insert into `bailao`.`CIDADE`(idCidade, nomeCidade)
values (1,  'Porto Alegre');

insert into `bailao`.`BANDA` (id, nome, ano_criacao, CIDADE_idCidade, anoDeExtincaoBanda)
values(1, 'Fresno', 1999, 1, 0),
	  (2, 'Engenheiros do Havaí', 1984, 1, 0);

# exrcicio 8
# Crie comando(s) INSERT para inserir pelo menos duas gravadoras com as seguintes informações:
insert into `bailao`.`ENDERECO` (idENDERECO, logradouroEndereco, nomeEndereco, numeroEndereco)
values (1, 'Rua', 'Lopes Quintas', 303),
	   (2, 'Rua', 'Vico Costa', 150);

insert into `bailao`.`GRAVADORA` (CNPJ, razao_social, ENDERECO_idENDERECO)
values ('42129890000186', 'Som Livre', 1),
	   ('88424361000297', 'Acit-Comercial e Fonografica LTDA', 2);

insert into `bailao`.`TELEFONE` (numero, Gravadora_CNPJ)
values ('991842918', '42129890000186'),
	   ('23233441', '42129890000186'),
       ('32904100', '88424361000297');
 
# exercicio 9
# Crie comandos INSERT para inserir pelo menos 3 álbuns na tabela album.
# Associe os álbuns com as bandas inseridas na questão 7.
# Da mesma forma, associe os álbuns a uma das gravadoras inseridas na questão 8.
INSERT INTO `bailao`.`ALBUM` (id, titulo, data_lancamento, midia, Gravadora_CNPJ, Banda_id)
VALUES (1, 'O rio a cidade a arvore', '2004-10-12', 'fisica', '42129890000186', 1),
       (2, 'Ciano', '2006-06-01', 'fisica', '42129890000186', 1),
       (3, 'Acustico MTV', '2004-01-01', 'fisica', '88424361000297', 2);
  
# exercicio 10
# Crie comando UPDATE para atualizar a razão social da gravadora “Acit-Comercial e Fonografica LTDA”  para “Gravadora ACIT”.
UPDATE `bailao`.`GRAVADORA`
SET razao_social = 'Gravadora ACIT'
WHERE razao_social = 'Acit-Comercial e Fonografica LTDA'
LIMIT 1;

# exercicio 11
# Crie comando SELECT para selecionar o nome das bandas, anos de criação, títulos dos álbuns, datas de lançamento, de todos os álbuns gravados pela gravadora “Som Livre”.
SELECT B.nome, B.ano_criacao, A.titulo, A.data_lancamento
FROM BANDA B, Album A, Gravadora G
WHERE B.id = A.BANDA_id
  AND A.Gravadora_CNPJ = G.CNPJ
  AND G.razao_social = 'Som Livre';