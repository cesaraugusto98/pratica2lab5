DROP DATABASE pratica2lab5;

CREATE DATABASE pratica2lab5;

USE pratica2lab5;

CREATE TABLE END_ENDERECO(
	END_ID INT NOT NULL auto_increment,
    END_CEP VARCHAR(12) NOT NULL,
    END_BAIRRO VARCHAR(30) NOT NULL,
    END_MUNICIPIO VARCHAR(30) NOT NULL,
    END_UF VARCHAR(2) NOT NULL,
    END_NUMERO VARCHAR(10) NOT NULL,
    END_COMPLEMENTO VARCHAR(50),
    
    PRIMARY KEY (END_ID)
);

CREATE TABLE USU_USUARIO(
	USU_ID INT NOT NULL auto_increment,
    END_ID INT(12),
    USU_NOME VARCHAR(50) NOT NULL,
    USU_LOGIN VARCHAR(12) NOT NULL,
    USU_SENHA INT NOT NULL,
    USU_DATA_NASCIMENTO DATE NOT NULL,
    USU_CPF VARCHAR(11),
    
    PRIMARY KEY (USU_ID),
    FOREIGN KEY (END_ID) REFERENCES END_ENDERECO(END_ID)
);