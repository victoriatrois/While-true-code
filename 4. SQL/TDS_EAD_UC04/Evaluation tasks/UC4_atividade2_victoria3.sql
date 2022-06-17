/* 
 * Crie um stored procedure que receba id de cliente, data inicial e data final
 * e que mostre a lista de compras realizadas pelo referido cliente entre as datas informadas (incluindo essas datas),
 * mostrando nome do cliente, id da compra, total, nome e quantidade de cada produto comprado.
 */
delimiter //
create procedure pr_listeCompras(in idCliente int, in dataInicial datetime, in dataFinal datetime)
begin
  select venda.id, cliente.nome, item_venda.nome_produto
  from item_venda
  join venda on venda.id = item_venda.venda_id
  join cliente on cliente.id = venda.cliente_id
  where cliente.id = idCliente and venda.data_ between dataInicial and dataFinal; 
end//
delimiter ;

-- Inclua o código de chamada ao procedimento.
call pr_listeCompras(199, '2019-01-01 01:10:00', '2022-01-01 01:10:00');

/*
 * Crie uma stored function que receba id de funcionário, data inicial e data final e retorne a comissão total desse funcionário
 * no período indicado.
 */
DELIMITER //
CREATE FUNCTION calculeComissao(
    id_funcionario INT, dataInicial datetime, dataFinal datetime
) RETURNS DECIMAL(5,2) DETERMINISTIC

BEGIN
    DECLARE valorComissao DECIMAL(5,2);
    DECLARE totalVendas INT;

    SELECT comissao into valorComissao from cargo
    join funcionario on cargo.id = funcionario.cargo_id
    join venda on funcionario.id = venda.funcionario_id
    where funcionario.id = id_funcionario and venda.data_ between dataInicial and dataFinal limit 1;
    
    select count(funcionario_id) into totalVendas from venda
    where (funcionario_id) = id_funcionario and venda.data_ between dataInicial and dataFinal;
    
    return totalVendas * valorComissao;
END//
DELIMITER ;

-- Inclua o código de chamada à função
select calculeComissao(1, '2018-01-08 12:10:00', '2023-01-08 12:10:00') as 'Total Comissão';
select calculeComissao(4, '2018-01-08 12:10:00', '2023-01-08 12:10:00') as 'Total Comissão';

/*
 * Crie uma stored function que receba id de cliente e retorne se o cliente é “PREMIUM” ou “REGULAR”. Um cliente é “PREMIUM”
 * se já realizou mais de R$ 10 mil em compras nos últimos dois anos. Um cliente é “REGULAR” se ao contrário.
 */
 
 DELIMITER //
 CREATE FUNCTION categorizeCliente(id_cliente INT)
    RETURNS VARCHAR(10) DETERMINISTIC

BEGIN
    declare valorComissao decimal(5,2);
	declare totalVendas int;
	declare gastoTotal decimal(9,2);
	declare categoriaCliente varchar(10);

	select comissao into valorComissao
    from cargo c, funcionario f
    where c.id = f.cargo_id limit 1;

	select count(valor_total) into totalVendas
    from venda v, cliente cli
    where v.cliente_id = cli.id limit 1;
 
	set gastoTotal = totalVendas * valorComissao;

	if gastoTotal > 1000 then 
		set categoriaCliente = 'PREMIUM';
	else 
		set categoriaCliente = 'REGULAR';
	end if;

	return  categorizeCliente;
END//
DELIMITER ;

 drop function categorizeCliente;
 
 -- Inclua o código de chamada à função
 select categorizeCliente(2);
 
 /*
  * Crie um trigger que atue sobre a tabela “usuário” de modo que, ao incluir um novo usuário, aplique automaticamente MD5()
  * à coluna “senha”.
  */
delimiter //
create trigger criptografaSenha before insert
on usuario for each row
BEGIN
update usuario
set senha = md5(new.senha);

END //	
delimiter ;

drop trigger criptografaSenha;

INSERT INTO usuario (id, login, senha, ultimo_login)
VALUES (default, 'lucas', 'aaaabbbbc','2022-01-01 00:00:00');
