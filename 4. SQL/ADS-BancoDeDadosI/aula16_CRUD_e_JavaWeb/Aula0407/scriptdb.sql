create database brasileirao;
use brasileirao;
create table clubes (
  id int not null auto_increment,
  sigla varchar(3),
  nome varchar(100),
  primary key (id)
);
create table campeonatos (
  id int not null auto_increment,
  nome varchar(100),
  ano int,
  primary key (id)
);
create table campeonatos_clubes (
  id_clube int not null,
  id_campeonato int not null,
  primary key (id_clube,id_campeonato),
  foreign key (id_clube) references clubes (id),
  foreign key (id_campeonato) references campeonatos (id)
);

