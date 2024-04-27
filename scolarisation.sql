create database bd_scolarisation;
use bd_scolarisation;
create table administrateur(
idutilisateur int auto_increment primary key,
password int(7)
);
create table etudiant(
nom varchar(50),
prenom varchar(44),
age int,
idmail  int auto_increment primary key
);

create table cours(
idmatiere int auto_increment primary key,
coeff int(24)
);

create table notes(
idnote int auto_increment primary key,
idmatiere varchar(22),
coeff int(30),
rang int,
constraint FK_matiere foreign key(idmatiere) references matiere(idmatiere)
);

show tables;

