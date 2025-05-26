-- FOCO DESSE BANCO É O RANKING
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema editora_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema editora_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `editora_db` DEFAULT CHARACTER SET utf8 ;
USE `editora_db` ;

-- -----------------------------------------------------
-- Table `editora_db`.`Autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `editora_db`.`Autor` (
  `idAutor` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAutor`))
ENGINE = InnoDB;
-- INSERIDO DADOS NA TABELA
insert into Autor values (1, "Pedro");
insert into Autor values (2, "Marcos");
insert into Autor values (3, "Felipe");
insert into Autor values (4, "Ana");
insert into Autor values (5, "Maria");
insert into Autor values (6, "Francisco");
insert into Autor values (7, "Lucas");
-- VENDO TODOS OS DADOS SALVOS NA TABELA
select *
from Autor;
-- VERRIFICAR QUAIS SÃO AS TABELAS EXISTENTES
show tables;

-- -----------------------------------------------------
-- Table `editora_db`.`Editora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `editora_db`.`Editora` (
  `idEditora` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEditora`))
ENGINE = InnoDB;
-- INSERINDO DADOS NA TABELA
insert into Editora values (1, "Ática");
insert into Editora values (2, "Makron Books");
insert into Editora values (3, "Rocco");
insert into Editora values (4, "Scipione");
insert into Editora values (5, "Sagra Luzato");
-- VENDO TODOS OS DADOS SALVOS NA TABELA
select *
from Editora;

-- -----------------------------------------------------
-- Table `editora_db`.`Genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `editora_db`.`Genero` (
  `idGenero` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idGenero`))
ENGINE = InnoDB;
-- INSERINDO DADOS NESSA TABELA
insert into Genero values (1, "Infantil");
insert into Genero values (2, "Ficção");
insert into Genero values (3, "Romance");
insert into Genero values (4, "Auto-ajuda");
insert into Genero values (5, "Negócios");
insert into Genero values (6, "História");
-- VENDO TODOS OS DADOS SALVOS NA TABELA
select *
from Genero;

-- -----------------------------------------------------
-- Table `editora_db`.`Livro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `editora_db`.`Livro` (
  `idLivro` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `preco` DECIMAL(3) NULL,
  `idEditora` INT NOT NULL,
  `idGenero` INT NOT NULL,
  PRIMARY KEY (`idLivro`),
  -- ordena os id editora em ordem ascendente 
  INDEX `fk_Livro_Editora_idx` (`idEditora` ASC), 
  INDEX `fk_Livro_Genero1_idx` (`idGenero` ASC),
  -- chave estrangeira
  CONSTRAINT `fk_Livro_Editora`
    FOREIGN KEY (`idEditora`)
    REFERENCES `editora_db`.`Editora` (`idEditora`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Livro_Genero1`
    FOREIGN KEY (`idGenero`)
    REFERENCES `editora_db`.`Genero` (`idGenero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- ALETRAR O TIPO DE DADO QUE ESTA EM COLUNA DA TABELA
alter table Livro modify column preco float null;
-- INSERINDO OS DADOS NA TABELA EDITORA
insert into Livro values (1, "A", 25.30, 1, 1);
insert into Livro values (2, "B", 32.45, 1, 4);
insert into Livro values (3, "C", 122.00, 4, 2);
insert into Livro values (4, "D", 100.99, 4, 3);
insert into Livro values (5, "E", 16.16, 1, 5);
insert into Livro values (6, "F", 4.56, 3, 1);
insert into Livro values (7, "G", 85.20, 2, 5);
insert into Livro values (8, "H", 89.90, 5, 5);
insert into Livro values (9, "I", 63.36, 2, 2);
insert into Livro values (10, "J", 41.40, 3, 3);
insert into Livro values (11, "K", 200.30, 4, 6);
insert into Livro values (12, "L", 99.99, 2, 4);

-- DELETAR UMA TABELA
drop table livro;
-- DELETAR DADOS DE UMA TABELA
delete from livro 
where idEditora = 1;
delete from livro
where idEditora = 2;
delete from livro
where idEditora = 3;
delete from livro
where idEditora = 4;
delete from livro
where idEditora = 5;

-- VERIFICAR OS DADOS ADICIONADOS NA TABELA
select *
from Livro;

-- -----------------------------------------------------
-- Table `editora_db`.`Livro_Autor`
-- um livro pode ter muitos autores e um autor pode ter muitos livro
-- duas tabelas n para n gera uma terceira tabela
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `editora_db`.`Livro_Autor` (
  `idAutor` INT NOT NULL,
  `idLivro` INT NOT NULL,
  PRIMARY KEY (`idAutor`, `idLivro`),
  INDEX `fk_Autor_has_Livro_Livro1_idx` (`idLivro` ASC),
  INDEX `fk_Autor_has_Livro_Autor1_idx` (`idAutor` ASC),
  CONSTRAINT `fk_Autor_has_Livro_Autor1`
    FOREIGN KEY (`idAutor`)
    REFERENCES `editora_db`.`Autor` (`idAutor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Autor_has_Livro_Livro1`
    FOREIGN KEY (`idLivro`)
    REFERENCES `editora_db`.`Livro` (`idLivro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
-- INSERINDO DADOS
insert into Livro_Autor values (1, 1);
insert into Livro_Autor values (6, 1);
insert into Livro_Autor values (6, 2);
insert into Livro_Autor values (5, 3);
insert into Livro_Autor values (1, 3);
insert into Livro_Autor values (4, 3);
insert into Livro_Autor values (4, 4);
insert into Livro_Autor values (1, 5);
insert into Livro_Autor values (5, 6);
insert into Livro_Autor values (3, 6);
insert into Livro_Autor values (3, 7);
insert into Livro_Autor values (2, 8);
insert into Livro_Autor values (6, 9);
insert into Livro_Autor values (6, 10);
insert into Livro_Autor values (1, 10);
insert into Livro_Autor values (2, 11);
insert into Livro_Autor values (2, 12);
-- VERIFICAR OS DADOS ADICIONADOS NA TABELA
select *
from Livro_Autor;

-- -----------------------------------------------------
-- Table `editora_db`.`Ranking`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `editora_db`.`Ranking` (
  `idRanking` INT NOT NULL AUTO_INCREMENT,
  `dataInicial` DATE NOT NULL,
  `dataFinal` DATE NOT NULL,
  PRIMARY KEY (`idRanking`))
ENGINE = InnoDB;
-- ADICIONANDO DADOS
insert into Ranking values (1, "20250817", "20030823");
insert into Ranking values (2, "20250824", "20030830");
insert into Ranking values (3, "20250831", "20030906");
insert into Ranking values (4, "20250907", "20030913");
-- VERIFICAR OS DADOS ADICIONADOS NA TABELA
select *
from Ranking;

-- -----------------------------------------------------
-- Table `editora_db`.`Ranking_Semanal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `editora_db`.`Ranking_Semanal` (
  `idRanking` INT NOT NULL,
  `idLivro` INT NOT NULL,
  `posicao` DECIMAL(2) NULL,
  `quantidadeSemanas` DECIMAL(2) NULL,
  `semanasConsecutivas` DECIMAL(2) NULL,
  `posicaoSemanaAnterior` DECIMAL(2) NULL,
  PRIMARY KEY (`idRanking`, `idLivro`),
  INDEX `fk_Ranking_has_Livro_Livro1_idx` (`idLivro` ASC),
  INDEX `fk_Ranking_has_Livro_Ranking1_idx` (`idRanking` ASC),
  CONSTRAINT `fk_Ranking_has_Livro_Ranking1`
    FOREIGN KEY (`idRanking`)
    REFERENCES `editora_db`.`Ranking` (`idRanking`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ranking_has_Livro_Livro1`
    FOREIGN KEY (`idLivro`)
    REFERENCES `editora_db`.`Livro` (`idLivro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
-- INSERINDO DADOS
insert into Ranking_Semanal values (1,1,4,6,3,3);
insert into Ranking_Semanal values (2,1,5,7,3,4);
insert into Ranking_Semanal values (3,2,1,1,1,null);
insert into Ranking_Semanal values (4,2,1,2,2,1);
insert into Ranking_Semanal values (1,3,2,2,2,null);
insert into Ranking_Semanal values (2,3,2,3,3,2);
insert into Ranking_Semanal values (3,3,8,4,4,2);
insert into Ranking_Semanal values (4,3,10,5,5,8);
insert into Ranking_Semanal values (1,4,1,50,43,1);
insert into Ranking_Semanal values (2,5,1,1,1,null);
insert into Ranking_Semanal values (3,5,2,2,2,1);
insert into Ranking_Semanal values (4,5,9,3,3,2);
insert into Ranking_Semanal values (4,6,8,1,1,null);
insert into Ranking_Semanal values (3,7,5,1,1,null);
insert into Ranking_Semanal values (4,7,5,2,2,5);
insert into Ranking_Semanal values (1,8, 3,13,12,6);
insert into Ranking_Semanal values (2,8, 3, 14,13,3);
insert into Ranking_Semanal values (3,8,3,15,14,3);
insert into Ranking_Semanal values (4,8,4,16,15,3);
insert into Ranking_Semanal values (2,9,7,1,1,null);
insert into Ranking_Semanal values (3,9,7,2,2,7);
insert into Ranking_Semanal values (1,10,8,4,4,10);
insert into Ranking_Semanal values (2,10,9,5,5,8);
insert into Ranking_Semanal values (3,11,9,1,1,null);
insert into Ranking_Semanal values (1,12,6,3,2,6);

-- VERIFICAR OS DADOS ADICIONADOS NA TABELA
select *
from Ranking_Semanal;

show tables;

-- VERIFICANDO OS DADOS
select *
from Autor;

select *
from editora;

select *
from genero;

select *
from livro;

select *
from livro_autor;

select *
from ranking;

select *
from ranking_semanal;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;