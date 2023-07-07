-- Criando um usuário teste
create user 'teste'@'localhost' identified by 'q1w2e3r4';

-- Selecionando todos os dados dos usuários existentes no servidor (confirmando a criação do usuário teste)
SELECT 
    *
FROM
    mysql.user;

-- Selecionando apenas o host e o nome de usuário dos usuários existentes
SELECT 
    host, user
FROM
    mysql.user;

create user 'vicky3'@'localhost' identified by '@Senh4mySQL';

-- Concedendo todas as permissões possíveis a um usuário
grant all privileges on *.* to 'vicky3'@'localhost';

-- Atualizando alterações de concessões concedidas ou revogadas
flush privileges;

drop user 'teste'@'localhost';

create user 'teste2'@'localhost' identified by 'test&2';

-- Deletando um usuário
drop user 'teste2'@'localhost';

-- Criando um usuário
create user 'dimi'@'localhost' identified by 'd1m1@';

-- Concedendo permissões a um usuário
grant select, insert, update, create, drop on *.* to 'dimi'@'localhost';

-- Revogando permissões a um usuário
revoke delete, alter on *.* from 'dimi'@'localhost';

-- Mostrando as permissões concedidas a um usuário
show grants for 'dimi'@'localhost';

show grants for 'vicky3'@'localhost';

-- Criando papéis
create role 'developer', 'read_only', 'write_allowed';

create database app_db;

use app_db;

-- Concedendo permissões a papeis
grant all on app_db.* to 'developer';
grant select on app_db.* to 'read_only';
grant insert, update, delete on app_db.* to 'write_allowed';

-- criando usuários
create user 'developer_user'@'localhost';
create user 'only_read_user'@'localhost';
create user 'write_allowed_user'@'localhost';

-- Designando papéis a usuários
grant 'developer' to 'developer_user'@'localhost';
grant 'read_only' to 'only_read_user'@'localhost';
grant 'write_allowed' to 'write_allowed_user'@'localhost';

-- Criando tabela com PK autoincrementavel
CREATE TABLE cadastro_usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    usuario VARCHAR(30),
    senha TEXT
);

-- Como não cadastrar senhas (elas estarão expostas dessa forma)
insert into cadastro_usuarios (usuario, senha) values ('Usuário Normal', 'SenacEAD_2022');
DELETE FROM cadastro_usuarios 
WHERE
    id = 1;
-- Encriptografando senhas com md5
insert into cadastro_usuarios (usuario, senha) values ('usuario md5', md5('SenacEAD_2022'));

-- Encriptografando senhas com sha1
INSERT INTO cadastro_usuarios (usuario, senha) VALUES ('Usuário SHA-1', sha1('SenacEAD_2022'));

-- Encriptografando senhas com sha2
INSERT INTO cadastro_usuarios (usuario, senha) VALUES ('Usuário SHA-2 ', sha2('SenacEAD_2022', 224));

ALTER TABLE cadastro_usuarios ADD COLUMN senha_aes varbinary(100);

-- Encriptografando senhas com AES
INSERT INTO cadastro_usuarios (usuario, senha_aes) VALUES ('Usuário AES', AES_ENCRYPT('SenacEAD_2022', 'Minha senha secreta' ));

select * from cadastro_usuarios;

-- Descriptografando senhas AES (dessa forma ela vai retornar um BLOB)
SELECT
AES_DECRYPT(senha_aes, 'Minha senha secreta')
FROM cadastro_usuarios
WHERE senha_aes is not null;

-- Convertendo um BLOB decriptografado em uma STRING
SELECT
CAST(AES_DECRYPT(senha_aes, 'Minha senha secreta') AS CHAR(255))
FROM cadastro_usuarios
WHERE senha_aes is not null;

