-- Crie um usuário específico para relatórios. Crie role para ele, com acesso apenas à consulta em tabelas (nem dados, nem estrutura podem ser alterados).
CREATE ROLE 'consulta';

GRANT SELECT ON uc4atividades.* TO consulta;

CREATE USER 'dimi.machado'@'localhost';

GRANT 'consulta' TO 'dimi.machado'@'localhost';

-- 	Crie usuário e role para funcionário, o qual pode manipular as tabelas (as tabelas ou os dados?) de venda, cliente e produto, mas não deve ter acesso (nem para consulta) a funcionário e cargo e não deve ser capaz de realizar alterações de estrutura em nenhuma tabela.
CREATE ROLE 'funcionario';

GRANT SELECT, INSERT, UPDATE, DELETE ON uc4atividades.venda to funcionario;
GRANT SELECT, INSERT, UPDATE, DELETE ON uc4atividades.cliente to funcionario;
GRANT SELECT, INSERT, UPDATE, DELETE ON uc4atividades.produto to funcionario;

CREATE USER 'bruna.passos'@'localhost';

GRANT 'funcionario' TO 'bruna.passos'@'localhost';

-- Escolha um método de criptografia ou hash para aplicar às senhas dos usuários. Atualize a tabela “usuário” aplicando a criptografia ou hash ao campo de senha em todos os registros.
ALTER TABLE usuario MODIFY COLUMN senha VARBINARY(100);

UPDATE usuario 
SET 
    senha = AES_ENCRYPT(senha, '@SenhaR00t')
WHERE id > 0;

SELECT* FROM usuario;