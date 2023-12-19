DROP DATABASE IF EXISTS bd2;
CREATE DATABASE bd2;
USE bd2;

SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE empresa (
	empresa_id int AUTO_INCREMENT,
	nome varchar(100) NOT NULL,
	cnpj varchar(20) NOT NULL UNIQUE,
	PRIMARY KEY(empresa_id)
);

CREATE TABLE setor (
	setor_id int AUTO_INCREMENT,
	empresa_id int,
	nome varchar(100) NOT NULL,
	andar int,
  chefe int,
	PRIMARY KEY(setor_id),
	FOREIGN KEY(empresa_id)
    	REFERENCES empresa(empresa_id)
);

CREATE TABLE funcionario (
	funcionario_id int AUTO_INCREMENT,
	setor_id int,
    nome varchar(100) NOT NULL,
    salario decimal(10,2) NOT NULL,
    nascimento date NOT NULL,
		sexo varchar(10) NOT NULL,
    PRIMARY KEY(funcionario_id),
   	FOREIGN KEY(setor_id)
	   	REFERENCES setor(setor_id)
);


INSERT INTO empresa (empresa_id, nome, cnpj) VALUES
(1, 'Matriz POA', '123456-0001'),
(2, 'Filial NH', '123456-0002'),
(3, 'Filial SL', '123456-0003'),
(4, 'Filial CA', '123456-0004'),
(5, 'Filial FL', '123456-0005');


--
-- Extraindo dados da tabela setor
--

INSERT INTO setor (setor_id, empresa_id, nome, andar, chefe) VALUES
(1, 1, 'Atendimento', 1, 10),
(2, 1, 'Escritório', 2, NULL),
(3, 1, 'Transporte', 0, 65),
(4, 1, 'Contabilidade', 3, 69),
(5, 2, 'Atendimento', 1, NULL),
(6, 2, 'Escritório', 2, 3),
(7, 2, 'Apoio', 3, 55),
(8, 2, 'T.I.', 4, NULL),
(9, 3, 'Atendimento', 1, 56),
(10, 3, 'Escritório', 2, 64),
(11, 3, 'Compras', 3, 11),
(12, 3, 'R.H.', 4, 67),
(13, NULL, 'Limpeza', 0, 22);

--
-- Extraindo dados da tabela funcionario
--


INSERT INTO funcionario (funcionario_id, setor_id, nome, salario, nascimento, sexo) VALUES
(1, 1, 'Davi Luiz Moraes Barbosa', '939.90', '1992-03-29', 'masculino'),
(2, 3, 'Miguel Cavalcanti Rodrigues', '1317.45', '1987-02-23', 'masculino'),
(3, 6, 'Noah Castro Cavalcanti', '1520.83', '1993-02-21', 'masculino'),
(4, 11, 'Levi Santos Moreira', '1000.28', '1990-11-08', 'masculino'),
(5, 12, 'Luiz Felipe Santos Santos', '1319.55', '1984-01-11', 'masculino'),
(6, 12, 'Eloá Barbosa Rocha', '882.29', '1986-10-29', 'feminino'),
(7, 11, 'Gustavo Pereira Rezende', '1260.53', '1984-11-17', 'masculino'),
(8, 5, 'Isabella Costa Martins', '1338.11', '1981-04-26', 'feminino'),
(9, 7, 'Helena Vieira Fernandes', '905.77', '1983-10-04', 'feminino'),
(10, 1, 'Ana Beatriz Caldeira Araújo', '1718.96', '1984-09-10', 'feminino'),
(11, 11, 'Otávio Cardoso Almeida', '1439.86', '1990-05-27', 'masculino'),
(12, 5, 'Maria Luiza Rocha Peixoto', '1454.25', '1987-08-19', 'feminino'),
(13, 13, 'Bryan Pereira Monteiro', '1178.06', '1984-05-30', 'masculino'),
(14, 7, 'Bento Vieira Pinto', '993.51', '1979-08-25', 'masculino'),
(15, 7, 'Letícia Fogaça Duarte', '1231.56', '1983-05-31', 'feminino'),
(16, 8, 'Isaac Ribeiro Ramos', '1412.05', '1982-03-23', 'masculino'),
(17, 12, 'João Miguel Nogueira Peixoto', '1280.69', '1988-04-10', 'masculino'),
(18, 11, 'Davi Nascimento Castro', '1066.14', '1982-05-30', 'masculino'),
(19, 5, 'Raul Porto Silveira', '1287.64', '1993-11-07', 'masculino'),
(20, 5, 'Bryan Carvalho Ribeiro', '1330.45', '1988-09-22', 'masculino'),
(21, 9, 'Ana Laura Peixoto Novaes', '1563.41', '1994-09-06', 'feminino'),
(22, 13, 'Luiza Lima Castro', '1709.75', '1983-11-25', 'feminino'),
(23, 8, 'Isadora Moraes Costa', '1556.34', '1991-04-01', 'feminino'),
(24, 12, 'Lucca Lima Pereira', '1296.88', '1987-08-27', 'masculino'),
(25, 4, 'Luiz Fernando Vieira Alves', '1626.75', '1994-12-16', 'masculino'),
(26, 10, 'Ricardo Pereira Mendes', '1104.53', '1996-05-02', 'masculino'),
(27, 5, 'Sarah Santos Barbosa', '1673.95', '1985-02-15', 'feminino'),
(28, 9, 'Clara Almeida Dias', '882.83', '1983-07-04', 'feminino'),
(29, 3, 'Eloá Caldeira Fernandes', '1317.76', '1982-01-29', 'feminino'),
(30, 5, 'Rafaela Fernandes Novaes', '1125.82', '1984-05-07', 'feminino'),
(31, 3, 'Kauê Moraes Teixeira', '990.98', '1994-08-28', 'masculino'),
(32, 2, 'Amanda Alves Duarte', '1256.74', '1983-05-16', 'feminino'),
(33, 12, 'Camila da Costa Araújo', '1065.69', '1987-03-03', 'feminino'),
(34, 2, 'Thomas Pereira Carvalho', '916.36', '1987-05-02', 'masculino'),
(35, 13, 'João Ribeiro Ramos', '1506.69', '1981-09-25', 'masculino'),
(36, 5, 'Maria Eduarda Costa Pereira', '1651.87', '1998-01-24', 'feminino'),
(37, 12, ' Isabella Novaes Sales', '1577.25', '1995-03-21', 'feminino'),
(38, 8, 'Juliana Gomes Carvalho', '1195.11', '1998-04-03', 'feminino'),
(39, 2, 'Luiz Miguel Silva Gomes', '1586.56', '1980-07-19', 'masculino'),
(40, 9, 'Agatha Alves Moura', '1298.87', '1982-05-12', 'feminino'),
(41, 12, 'Gabrielly Sales Costa', '1213.43', '1984-09-07', 'feminino'),
(42, 2, 'Luana Castro Gomes', '1766.68', '1995-09-20', 'feminino'),
(43, 11, 'Emanuelly Dias Pinto', '962.04', '1995-10-30', 'feminino'),
(44, 8, 'Maya Barbosa Ribeiro', '1378.84', '1984-08-02', 'feminino'),
(45, 13, 'João Vitor Rocha Moraes', '1012.29', '1996-01-03', 'masculino'),
(46, 1, 'Davi Luiz Araújo Porto', '1029.33', '1996-11-01', 'masculino'),
(47, 11, 'Davi Luiz Silveira Fernandes', '1340.03', '1997-12-07', 'masculino'),
(48, 4, 'Pedro Lucas Alves Cardoso', '1647.52', '1991-09-16', 'masculino'),
(49, 3, 'Ana Carolina Sales Campos', '1482.48', '1992-07-31', 'feminino'),
(50, 9, 'Luiz Henrique Silveira Moura', '967.91', '1991-06-19', 'masculino'),
(51, 8, 'Kaique Cardoso Moraes', '834.01', '1996-10-10', 'masculino'),
(52, 9, 'Pedro Lucas Freitas Duarte', '1205.51', '1987-06-17', 'masculino'),
(53, 9, 'Juliana Ribeiro Silveira', '1390.60', '1989-07-28', 'feminino'),
(54, 5, 'João Vitor Cavalcanti Peixoto', '1140.13', '1980-09-07', 'masculino'),
(55, 7, 'Nicole Novaes Fernandes', '1687.95', '1988-06-05', 'feminino'),
(56, 9, 'Enzo Sales da Costa', '1779.68', '1978-06-22', 'masculino'),
(57, 4, 'Ricardo Araújo Gomes', '1528.25', '1992-09-24', 'masculino'),
(58, 7, 'Igor Fogaça Monteiro', '1069.38', '1996-11-02', 'masculino'),
(59, 12, 'Débora Sales Vieira', '1399.04', '1984-08-25', 'feminino'),
(60, 7, 'Luiz Fernando Ribeiro Nogueira', '929.48', '1986-03-24', 'masculino'),
(61, 4, 'Gael Costa Rodrigues', '800.46', '1997-05-01', 'masculino'),
(62, 7, 'Leonardo Duarte da Costa', '1340.15', '1984-03-27', 'masculino'),
(63, 2, 'João Moraes Nogueira', '1278.30', '1988-11-26', 'masculino'),
(64, 10, 'Davi Lucas Souza Castro', '1296.94', '1993-06-22', 'masculino'),
(65, 3, 'Benjamin Moura Monteiro', '1702.33', '1986-05-29', 'masculino'),
(66, 13, 'Raul Santos Novaes', '1689.01', '1994-02-16', 'masculino'),
(67, 12, 'Antônio Martins Fogaça', '1642.44', '1982-06-12', 'masculino'),
(68, 6, 'Laís Martins Barros', '863.83', '1985-01-28', 'masculino'),
(69, 4, 'Ana Laura Souza Pinto', '1743.74', '1980-08-14', 'feminino'),
(70, 6, 'Ana Sophia Moura Nascimento', '1233.63', '1983-02-16', 'feminino'),
(71, 8, 'Guilherme da Costa Martins', '1639.38', '1980-01-10', 'masculino'),
(72, 2, 'Mirella Silva Souza', '1418.74', '1983-12-14', 'feminino'),
(73, 8, 'Igor Silva Novaes', '1405.77', '1991-04-11', 'masculino'),
(74, 13, 'Pedro Campos Moura', '929.43', '1995-08-25', 'masculino'),
(75, 2, 'Malu Almeida Fogaça', '1581.02', '1994-10-23', 'feminino'),
(76, NULL, ' Isabella Martins Campos', '1789.23', '1987-04-23', 'feminino'),
(77, NULL, 'Elisa Martins Nascimento', '1075.91', '1987-09-24', 'feminino'),
(78, NULL, 'Nicolas Dias Porto', '1600.42', '1978-05-24', 'masculino'),
(79, NULL, 'Ísis Dias Freitas', '1115.62', '1979-09-21', 'feminino'),
(80, NULL, 'Renan Carvalho Ribeiro', '1216.99', '1995-09-06', 'masculino'),
(81, NULL, 'Henrique Silveira Moraes', '961.71', '1992-04-25', 'masculino');


ALTER TABLE setor ADD FOREIGN KEY(chefe) REFERENCES funcionario(funcionario_id);

SET FOREIGN_KEY_CHECKS = 1;
