-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cinema` DEFAULT CHARACTER SET utf8 ;
USE `cinema` ;

-- -----------------------------------------------------
-- Table `cinema`.`Filme`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Filme` (
  `idFilme` INT NOT NULL AUTO_INCREMENT,
  `nomePTBR` VARCHAR(40) NOT NULL,
  `nomeOriginal` VARCHAR(45) NULL,
  `Sinopse` LONGTEXT NOT NULL,
  `anoLancamento` INT NOT NULL,
  PRIMARY KEY (`idFilme`));


-- -----------------------------------------------------
-- Table `cinema`.`Indicacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Indicacao` (
  `idIndicacao` INT NOT NULL,
  `tituloIndicacao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idIndicacao`));


-- -----------------------------------------------------
-- Table `cinema`.`Premiacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Premiacao` (
  `idPremiacao` INT NOT NULL,
  `tituloPremiacao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPremiacao`));


-- -----------------------------------------------------
-- Table `cinema`.`Filme_has_Indicacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Filme_has_Indicacao` (
  `Indicacao_idIndicacao` INT NOT NULL,
  `Filme_idFilme` INT NOT NULL,
  PRIMARY KEY (`Indicacao_idIndicacao`, `Filme_idFilme`),
  INDEX `fk_Filme_has_Indicacao_Indicacao1_idx` (`Indicacao_idIndicacao` ASC) VISIBLE,
  INDEX `fk_Filme_has_Indicacao_Filme1_idx` (`Filme_idFilme` ASC) VISIBLE,
  CONSTRAINT `fk_Filme_has_Indicacao_Indicacao1`
    FOREIGN KEY (`Indicacao_idIndicacao`)
    REFERENCES `cinema`.`Indicacao` (`idIndicacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Filme_has_Indicacao_Filme1`
    FOREIGN KEY (`Filme_idFilme`)
    REFERENCES `cinema`.`Filme` (`idFilme`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `cinema`.`Diretor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Diretor` (
  `idDiretor` INT NOT NULL,
  `nomeDiretor` VARCHAR(45) NULL,
  PRIMARY KEY (`idDiretor`));


-- -----------------------------------------------------
-- Table `cinema`.`Ator`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Ator` (
  `idAtor` INT NOT NULL,
  `nomeAtor` VARCHAR(45) NULL,
  PRIMARY KEY (`idAtor`));


-- -----------------------------------------------------
-- Table `cinema`.`Diretor_has_Filme`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Diretor_has_Filme` (
  `Diretor_idDiretor` INT NOT NULL,
  `Filme_idFilme` INT NOT NULL,
  PRIMARY KEY (`Diretor_idDiretor`, `Filme_idFilme`),
  INDEX `fk_Diretor_has_Filme_Diretor1_idx` (`Diretor_idDiretor` ASC) VISIBLE,
  INDEX `fk_Diretor_has_Filme_Filme1_idx` (`Filme_idFilme` ASC) VISIBLE,
  CONSTRAINT `fk_Diretor_has_Filme_Diretor1`
    FOREIGN KEY (`Diretor_idDiretor`)
    REFERENCES `cinema`.`Diretor` (`idDiretor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Diretor_has_Filme_Filme1`
    FOREIGN KEY (`Filme_idFilme`)
    REFERENCES `cinema`.`Filme` (`idFilme`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `cinema`.`Sala`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Sala` (
  `NomeSala` VARCHAR(45) NOT NULL,
  `Capacidade` INT NULL,
  PRIMARY KEY (`NomeSala`));


-- -----------------------------------------------------
-- Table `cinema`.`Sala_has_Filme`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Sala_has_Filme` (
  `Sala_NomeSala` VARCHAR(45) NOT NULL,
  `Filme_idFilme` INT NOT NULL,
  `horario` TIME NOT NULL,
  PRIMARY KEY (`Sala_NomeSala`, `Filme_idFilme`, `horario`),
  INDEX `fk_Sala_has_Filme_Sala1_idx` (`Sala_NomeSala` ASC) VISIBLE,
  INDEX `fk_Sala_has_Filme_Filme1_idx` (`Filme_idFilme` ASC) VISIBLE,
  CONSTRAINT `fk_Sala_has_Filme_Sala1`
    FOREIGN KEY (`Sala_NomeSala`)
    REFERENCES `cinema`.`Sala` (`NomeSala`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Sala_has_Filme_Filme1`
    FOREIGN KEY (`Filme_idFilme`)
    REFERENCES `cinema`.`Filme` (`idFilme`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- -----------------------------------------------------
-- Table `cinema`.`Funcao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Funcao` (
  `idFuncao` INT NOT NULL,
  `nomeFuncao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idFuncao`));


-- -----------------------------------------------------
-- Table `cinema`.`Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Funcionario` (
  `numeroCarteiraTrabalho` VARCHAR(20) NOT NULL,
  `Nome` VARCHAR(45) NOT NULL,
  `dataAdmissao` DATETIME NULL,
  `salario` FLOAT NULL,
  `tempoDeExperiência` INT NULL,
  PRIMARY KEY (`numeroCarteiraTrabalho`));


-- -----------------------------------------------------
-- Table `cinema`.`Funcionario_has_Funcao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Funcionario_has_Funcao` (
  `Funcionario_numeroCarteiraTrabalho` VARCHAR(20) NOT NULL,
  `Funcao_idFuncao` INT NOT NULL,
  PRIMARY KEY (`Funcionario_numeroCarteiraTrabalho`, `Funcao_idFuncao`),
  INDEX `fk_Funcionario_has_Funcao_Funcao1_idx` (`Funcao_idFuncao` ASC) VISIBLE,
  INDEX `fk_Funcionario_has_Funcao_Funcionario1_idx` (`Funcionario_numeroCarteiraTrabalho` ASC) VISIBLE,
  CONSTRAINT `fk_Funcionario_has_Funcao_Funcionario1`
    FOREIGN KEY (`Funcionario_numeroCarteiraTrabalho`)
    REFERENCES `cinema`.`Funcionario` (`numeroCarteiraTrabalho`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Funcionario_has_Funcao_Funcao1`
    FOREIGN KEY (`Funcao_idFuncao`)
    REFERENCES `cinema`.`Funcao` (`idFuncao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `cinema`.`Filme_has_Premiacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Filme_has_Premiacao` (
  `Filme_idFilme` INT NOT NULL,
  `Premiacao_idPremiacao` INT NOT NULL,
  PRIMARY KEY (`Filme_idFilme`, `Premiacao_idPremiacao`),
  INDEX `fk_Filme_has_Premiacao_Premiacao1_idx` (`Premiacao_idPremiacao` ASC) VISIBLE,
  INDEX `fk_Filme_has_Premiacao_Filme1_idx` (`Filme_idFilme` ASC) VISIBLE,
  CONSTRAINT `fk_Filme_has_Premiacao_Filme1`
    FOREIGN KEY (`Filme_idFilme`)
    REFERENCES `cinema`.`Filme` (`idFilme`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Filme_has_Premiacao_Premiacao1`
    FOREIGN KEY (`Premiacao_idPremiacao`)
    REFERENCES `cinema`.`Premiacao` (`idPremiacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `cinema`.`Sala_has_Filme_has_Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Sala_has_Filme_has_Funcionario` (
  `Sala_has_Filme_Sala_NomeSala` VARCHAR(45) NOT NULL,
  `Sala_has_Filme_Filme_idFilme` INT NOT NULL,
  `Sala_has_Filme_horario` TIME NOT NULL,
  `Funcionario_numeroCarteiraTrabalho` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`Sala_has_Filme_Sala_NomeSala`, `Sala_has_Filme_Filme_idFilme`, `Sala_has_Filme_horario`, `Funcionario_numeroCarteiraTrabalho`),
  INDEX `fk_Sala_has_Filme_has_Funcionario_Funcionario1_idx` (`Funcionario_numeroCarteiraTrabalho` ASC) VISIBLE,
  INDEX `fk_Sala_has_Filme_has_Funcionario_Sala_has_Filme1_idx` (`Sala_has_Filme_Sala_NomeSala` ASC, `Sala_has_Filme_Filme_idFilme` ASC, `Sala_has_Filme_horario` ASC) VISIBLE,
  CONSTRAINT `fk_Sala_has_Filme_has_Funcionario_Sala_has_Filme1`
    FOREIGN KEY (`Sala_has_Filme_Sala_NomeSala` , `Sala_has_Filme_Filme_idFilme` , `Sala_has_Filme_horario`)
    REFERENCES `cinema`.`Sala_has_Filme` (`Sala_NomeSala` , `Filme_idFilme` , `horario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Sala_has_Filme_has_Funcionario_Funcionario1`
    FOREIGN KEY (`Funcionario_numeroCarteiraTrabalho`)
    REFERENCES `cinema`.`Funcionario` (`numeroCarteiraTrabalho`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `cinema`.`Ator_has_Filme`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinema`.`Ator_has_Filme` (
  `Ator_idAtor` INT NOT NULL,
  `Filme_idFilme` INT NOT NULL,
  PRIMARY KEY (`Ator_idAtor`, `Filme_idFilme`),
  INDEX `fk_Ator_has_Filme_Filme1_idx` (`Filme_idFilme` ASC) VISIBLE,
  INDEX `fk_Ator_has_Filme_Ator1_idx` (`Ator_idAtor` ASC) VISIBLE,
  CONSTRAINT `fk_Ator_has_Filme_Ator1`
    FOREIGN KEY (`Ator_idAtor`)
    REFERENCES `cinema`.`Ator` (`idAtor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ator_has_Filme_Filme1`
    FOREIGN KEY (`Filme_idFilme`)
    REFERENCES `cinema`.`Filme` (`idFilme`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);