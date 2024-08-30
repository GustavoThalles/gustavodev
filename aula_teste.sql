create database testee;
 
use testee;
 
create table pessoas (
	codigo integer primary key,
    nome varchar(60) not null,
    cpf varchar(14) not null,
    rg varchar (12) not null,
    email varchar (60) not null
);
 
ALTER TABLE pessoas RENAME TO funcionarios;
 
ALTER TABLE funcionarios 
ADD telefone varchar (15),
ADD data_nasc date;
 
ALTER TABLE funcionarios MODIFY data_nasc date null;
 
ALTER TABLE funcionarios DROP COLUMN rg;
 
ALTER TABLE funcionarios CHANGE telefone celular varchar (15) not null;
 
select * from funcionarios;
 
 

