-- Realize ajustes na consulta (colunas, junções, comparações etc.).
/***
consulta para um relatório de todas as vendas pagas em dinheiro. 
Necessários para o relatório data da venda, valor total; produtos vendidos, quantidade e valor unitário; nome do cliente, cpf e telefone.
Ordena-se pela data de venda, as mais recentes primeiro.
**/
SELECT v.data_ as dataVenda, v.valor_total as valorTotal, iv.nome_produto as produto, iv.quantidade as quantidade,
iv.valor_unitario as valorUnitario, c.nome as nome, c.cpf as cpf, c.telefone as tel
FROM venda v, item_venda iv, produto p, cliente c, funcionario f
WHERE v.id = iv.venda_id AND
c.id = v.cliente_id AND 
p.id = iv.produto_id AND 
f.id = v.funcionario_id and 
tipo_pagamento LIKE 'D'
ORDER BY v.data_ DESC;

/***
consulta para encontrar todas as vendas de produtos de um fabricante específico
Mostrar dados do produto, quantidade vendida, data da venda.
Ordena-se pelo nome do produto.
***/
SELECT p.nome as produto, iv.quantidade as qtd, v.data_ as data
FROM produto p, item_venda iv, venda v
WHERE p.id = iv.produto_id AND
v.id = iv.venda_id AND
p.fabricante like '%lar%'
ORDER BY p.nome;
 
/***
Relatório de vendas de produto por cliente.
Mostrar dados do cliente, dados do produto e valor e quantidade totais de venda ao cliente de cada produto.
*/
SELECT c.nome as nome, p.nome as produto, SUM(iv.subtotal) as totalVenda, COUNT(iv.quantidade) as totalProdutos
FROM produto p, item_venda iv, venda v, cliente c
WHERE p.id = iv.produto_id AND v.id = iv.venda_id AND c.id = v.cliente_id /*f.id = v.funcionario_id*/
GROUP BY c.nome, p.nome;

-- Crie índices para colunas que possam se beneficiar do recurso para melhorar o desempenho das consultas.
/*Todas as outras tabelas que se beneficial de INDEX os tiveram criados junto com a criação das suas tabelas. Já a tabela produto não.*/
CREATE INDEX produto_id ON produto(id);

-- Mostre detalhes da execução da consulta (EXPLAIN), com dados de linhas percorridas, antes e depois das otimizações.
-- antes
EXPLAIN SELECT * FROM venda v, item_venda iv, produto p, cliente c, funcionario f
WHERE v.id = iv.venda_id AND c.id = v.cliente_id AND p.id = iv.produto_id AND f.id = v.funcionario_id and tipo_pagamento = 'D';

-- depois
EXPLAIN SELECT v.data_ as dataVenda, v.valor_total as valorTotal, iv.nome_produto as produto, iv.quantidade as quantidade,
iv.valor_unitario as valorUnitario, c.nome as nome, c.cpf as cpf, c.telefone as tel
FROM venda v, item_venda iv, produto p, cliente c, funcionario f
WHERE v.id = iv.venda_id AND
c.id = v.cliente_id AND 
p.id = iv.produto_id AND 
f.id = v.funcionario_id and 
tipo_pagamento LIKE 'D'
ORDER BY v.data_ DESC;

-- antes
EXPLAIN SELECT * 
FROM produto p, item_venda iv, venda v
WHERE p.id = iv.produto_id AND v.id = iv.venda_id AND p.fabricante like '%lar%';

-- depois
EXPLAIN SELECT p.nome as produto, iv.quantidade as qtd, v.data_ as data
FROM produto p, item_venda iv, venda v
WHERE p.id = iv.produto_id AND
v.id = iv.venda_id AND
p.fabricante like '%lar%'
ORDER BY p.nome;

-- antes
EXPLAIN SELECT SUM(iv.subtotal), SUM(iv.quantidade)
FROM produto p, item_venda iv, venda v, cliente c
WHERE p.id = iv.produto_id AND v.id = iv.venda_id AND c.id = v.cliente_id /*f.id = v.funcionario_id*/
GROUP BY c.nome, p.nome;

-- depois
EXPLAIN SELECT p.nome as produto, iv.quantidade as qtd, v.data_ as data
FROM produto p, item_venda iv, venda v
WHERE p.id = iv.produto_id AND
v.id = iv.venda_id AND
p.fabricante like '%lar%'
ORDER BY p.nome;

-- Crie uma view para cada uma das consultas ajustadas.
CREATE VIEW vendasValadao as
select count(v.id) as produtoVendido
from venda v, funcionario f
where v.funcionario_id = f.id and
f.nome = "Marcos Valadão";

select * from vendasValadao;

create view pagasEmDinheiro as
SELECT v.data_ as dataVenda, v.valor_total as valorTotal, iv.nome_produto as produto, iv.quantidade as quantidade,
iv.valor_unitario as valorUnitario, c.nome as nome, c.cpf as cpf, c.telefone as tel
FROM venda v, item_venda iv, produto p, cliente c, funcionario f
WHERE v.id = iv.venda_id AND
c.id = v.cliente_id AND 
p.id = iv.produto_id AND 
f.id = v.funcionario_id and 
tipo_pagamento LIKE 'D'
ORDER BY v.data_ DESC;

select * from pagasEmDinhero;

create view vendasLar as
SELECT p.nome as produto, iv.quantidade as qtd, v.data_ as data
FROM produto p, item_venda iv, venda v
WHERE p.id = iv.produto_id AND
v.id = iv.venda_id AND
p.fabricante like '%lar%'
ORDER BY p.nome;

select * from vendasLar;

create view vendaPorCliente as
SELECT c.nome as nome, p.nome as produto, SUM(iv.subtotal) as totalVenda, COUNT(iv.quantidade) as totalProdutos
FROM produto p, item_venda iv, venda v, cliente c
WHERE p.id = iv.produto_id AND v.id = iv.venda_id AND c.id = v.cliente_id /*f.id = v.funcionario_id*/
GROUP BY c.nome, p.nome;

select * from vendaPorCliente;