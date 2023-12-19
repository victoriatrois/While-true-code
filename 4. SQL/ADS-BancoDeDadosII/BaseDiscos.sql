create database discos;
use discos;

CREATE TABLE gravadora(
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
    musicas VARCHAR(300),
    PRIMARY KEY(album_id),
    FOREIGN KEY(gravadora_id)
    REFERENCES  gravadora(gravadora_id)
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

INSERT INTO album (album_id, gravadora_id, nome, banda, estilo, musicas) VALUES
(1, 1, 'Led Zeppelin I','Led Zeppelin','Hard Rock','Good Times Bad Times; Babe I\'m Gonna Leave You; You Shook Me; Dazed and Confused, Your Time is Gonna Come, Black Mountain Side, Communication Breakdown, I Can\'t Quit You Baby, How Many More Times'),
(2, 2, 'In Rock','Deep Purple','Hard Rock','Speed King; Blood Sucker; Child in Time; Flight of the Rat; Into the Fire; Living Wreck; Hard Lovin\' Man'),
(3, 4, 'Cabeca de Dinossauro','Titas','Rock Nacional',' Cabeca de Dinossauro; AA UU; Igreka; Policia; Estado Violencia; A Face do Destruidor; Porrada; To Cansado; Bichos Escrotos; Familia; Homem Primata; Dividas; O Que'),
(4, 1, 'Let it Bleed','The Rolling Stones','Rock','Gimme Shelter; Love in Vain; Country Honk; Live With Me; Let it Bleed; Midnight Rambler; You Got The Silver; Money Man; You Can\'t Always Get What You Want; Honky Tonk Woman');


INSERT INTO disco (disco_id, album_id, gravadora_id, data_producao, pais, midia) VALUES
(588171, 1, 1,'1969-03-28', 'United Kingdom', 'Vinyl'),
(8216, 1, 1,'1969-03-28', 'United States', 'Reel-to-Reel');