CREATE DATABASE UC3_atividade2;

CREATE TABLE `MEDICO` (
  `ID` int,
  `nome` varchar(40),
  `nascimento` date,
  `cpf` char(11),
  `crm` varchar(10),
  `estado` char(2),
  `ID_categoria` int,
  `contato` varchar(13),
  `endereco` varchar(40),
  `ID_consulta` int,
  PRIMARY KEY (`ID`)
);

CREATE TABLE `CATEGORIA` (
  `ID` int,
  `descricao` varchar(20),
  PRIMARY KEY (`ID`)
);

CREATE TABLE `MEDICO-TEM-CATEGORIA` (
  `ID_medico` int,
  `ID_categoria` int,
  FOREIGN KEY (`ID_medico`) REFERENCES `MEDICO`(`ID`),
  FOREIGN KEY (`ID_medico`) REFERENCES `CATEGORIA`(`ID`)
);

CREATE TABLE `CONVENIO` (
  `ID` int,
  `nome` varchar(40),
  `cnpj` char(14),
  `fim_carencia` date,
  PRIMARY KEY (`ID`)
);

CREATE TABLE `PACIENTE` (
  `ID` int,
  `nome` varchar(40),
  `nascimento` date,
  `endereco` varchar(40),
  `telefone` varchar(13),
  `email` varchar(30),
  `cpf` char(11),
  `rg` char(10),
  `convenio` int,
  PRIMARY KEY (`ID`),
  FOREIGN KEY (`convenio`) REFERENCES `CONVENIO`(`ID`)
);

CREATE TABLE `RECEITUARIO` (
  `ID` int,
  `medicamento` varchar(40),
  `quantidade` int,
  `instrucoes` text,
  `ID_medico` int,
  PRIMARY KEY (`ID`),
  FOREIGN KEY (`ID_medico`) REFERENCES `MEDICO`(`ID`)
);

CREATE TABLE `CONSULTA` (
  `ID` int,
  `data` date,
  `horario` time,
  `valor` int,
  `ID_paciente` int,
  `ID_medico` int,
  `ID_convenio` int,
  PRIMARY KEY (`ID`),
  FOREIGN KEY (`ID_paciente`) REFERENCES `PACIENTE`(`ID`),
  FOREIGN KEY (`ID`) REFERENCES `MEDICO`(`ID`),
  FOREIGN KEY (`ID_convenio`) REFERENCES `CONVENIO`(`ID`)
);

CREATE TABLE `PACIENTE-CONSULTA-COM-MEDICO` (
  `ID_paciente` int,
  `nome_paciente` varchar(40),
  `ID_medico` int,
  `medico_consultado` varchar(40),
  FOREIGN KEY (`ID_medico`) REFERENCES `MEDICO`(`ID`),
  FOREIGN KEY (`ID_paciente`) REFERENCES `PACIENTE`(`ID`)
);

CREATE TABLE `TIPO_QUARTO` (
  `ID` int,
  `descricao` varchar(40),
  `valor_diaria` int,
  PRIMARY KEY (`ID`)
);

CREATE TABLE `QUARTO` (
  `ID` int,
  `numero` int,
  `ID_tipo_quarto` int,
  PRIMARY KEY (`ID`),
  FOREIGN KEY (`ID_tipo_quarto`) REFERENCES `TIPO_QUARTO`(`ID`)
);

CREATE TABLE `INTERNACAO` (
  `ID` int,
  `data_entreda` date,
  `previsao_alta` date,
  `alta_efetiva` date,
  `procedimentos` text,
  `ID_quarto` int,
  `ID_medico_resposnsavel` int,
  `ID_paciente_internado` int,
  PRIMARY KEY (`ID`),
  FOREIGN KEY (`ID_quarto`) REFERENCES `QUARTO`(`ID`)
);

CREATE TABLE `ENFERMEIRO` (
  `ID` int,
  `nome` varchar(40),
  `cpf` char(11),
  `cre` varchar(11),
  PRIMARY KEY (`ID`)
);

CREATE TABLE `INTERNACAO-REQUER-ENFREMEIRO` (
  `ID_internacao` int,
  `ID_enfermeiro` int,
  FOREIGN KEY (`ID_internacao`) REFERENCES `INTERNACAO`(`ID`),
  FOREIGN KEY (`ID_enfermeiro`) REFERENCES `ENFERMEIRO`(`ID`)
);


