create database discos2;
use discos2;

CREATE table gravadora(
    gravadora_id int auto_increment,
    nome VARCHAR(100) NOT NULL,
    abr VARCHAR(20) NOT NULL,
    cnpj VARCHAR(20) NOT NULL UNIQUE,
    PRIMARY KEY(gravadora_id)
);

CREATE table album(
	album_id int auto_increment,
    gravadora_id int,
    nome VARCHAR(100) NOT NULL,
    banda VARCHAR(50) NOT NULL,
    estilo VARCHAR(50) NOT NULL,
    -- musicas VARCHAR(300),
    PRIMARY KEY(album_id),
    FOREIGN KEY(gravadora_id)
    REFERENCES  gravadora(gravadora_id)
);

CREATE table musica(
	musica_id int auto_increment,
    album_id int,
    nome VARCHAR(100) NOT NULL,
    PRIMARY KEY(musica_id),
    FOREIGN KEY(album_id)
    REFERENCES  album(album_id)

);


CREATE table disco(
	disco_id int,
    album_id int,
    gravadora_id int,
    data_producao date,
    pais VARCHAR(50),
    midia VARCHAR(50) NOT NULL,
    PRIMARY KEY(disco_id),
    FOREIGN KEY(album_id) REFERENCES album(album_id),
    FOREIGN KEY(gravadora_id) REFERENCES gravadora(gravadora_id)
);

INSERT INTO gravadora (gravadora_id, nome, abr, cnpj) VALUES
(1, 'Atlantic Records','ATL','1234567-0001'),
(2, 'Polidor','PDR','66666666-0001'),
(3, 'Sony Universal','SU','1236234-0001'),
(4, 'Som Livre','SL','1288867-0001');

INSERT INTO album (album_id, gravadora_id, nome, banda, estilo) VALUES
(1, 1, 'Led Zeppelin I','Led Zeppelin','Hard Rock'),
(2, 2, 'In Rock','Deep Purple','Hard Rock'),
(3, 4, 'Cabeca de Dinossauro','Titas','Rock Nacional'),
(4, 1, 'Let it Bleed','The Rolling Stones','Rock');

INSERT INTO musica(album_id, nome) VALUES
(1, 'Good Times Bad Times'),
(1, 'Babe I\'m Gonna Leave You'),
(1, 'You Shook Me'),
(1, 'Dazed and Confused'),
(1, 'Your Time is Gonna Come'),
(1, 'Black Mountain Side'),
(1, 'Communication Breakdown'),
(1, 'I Can\'t Quit You Baby'),
(1, 'How Many More Times'),
(2,'Speed King'),
(2, 'Blood Sucker'),
(2, 'Child in Time'),
(2, 'Flight of the Rat'),
(2, 'Into the Fire'),
(2, 'Living Wreck'),
(2, 'Hard Lovin\' Man'),
(3, 'Cabeca de Dinossauro'),
(3, 'AA UU'),
(3, 'Igreja'),
(3, 'Policia'),
(3, 'Estado Violencia'),
(3, 'A Face do Destruidor'),
(3, 'Porrada'),
(3, 'To Cansado'),
(3, 'Bichos Escrotos'),
(3, 'Familia'),
(3, 'Homem Primata'),
(3, 'Dividas'),
(3, 'O Que'),
(4, 'Gimme Shelter'),
(4, 'Love in Vain'),
(4, 'Country Honk'),
(4, 'Live With Me'),
(4, 'Let it Bleed'),
(4, 'Midnight Rambler'),
(4, 'You Got The Silver'),
(4, 'Money Man'),
(4, 'You Can\'t Always Get What You Want'), 
(4, 'Honky Tonk Woman');


INSERT INTO disco (disco_id, album_id, gravadora_id, data_producao, pais, midia) VALUES
(588171, 1, 1,'1969-03-28', 'United Kingdom', 'Vinyl'),
(8216, 1, 1,'1969-03-28', 'United States', 'Reel-to-Reel');