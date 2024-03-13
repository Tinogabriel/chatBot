

/* CRIANDO O BANCO DE DADOS */

CREATE DATABASE CHATBOT; 

/* CONECTANDO SE AO BANCO */

USE CHATBOT; 

/*CRIAÇÃO DA TABELA  */

CREATE TABLE USUARIO(

	ID INTEGER NOT NULL AUTO_INCREMENT,
	NOME VARCHAR(50) NOT NULL,
	EMAIL VARCHAR(30) NOT NULL, 
	SENHA VARCHAR(30),
	DT_NASC VARCHAR(30) NOT NULL,
	TELEFONE VARCHAR(20),
	CONSTRAINT PK_USUARIO PRIMARY KEY(ID)
);

/*SELECIONANDO OS DADOS DO BANCO*/

SELECT * FROM USUARIO;