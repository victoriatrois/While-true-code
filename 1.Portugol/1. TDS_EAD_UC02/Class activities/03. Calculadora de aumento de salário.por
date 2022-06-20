programa {
	funcao inicio() {
		/*Imagine que você recebeu a tarefa de calcular o aumento de salário de um trabalhador com base em uma porcentagem informada
		/pelo usuário. Essa tarefa precisa exibir na saída o nome, o salário antigo, o salário novo e o valor do aumento. Analise as
		/saídas. Para exibir o nome, deve-se solicitar esse nome ao usuário; para calcular o valor do aumento com base no percentual,
		/deve-se solicitar o salário antigo e o percentual (pois terá um novo salário). Cálculo do valor do aumento dado por Valor do
		/Aumento = Salario Antigo x Percentual (valor digitado / 100). O novo salário é Novo Salario = Salario Antigo + Valor do Aumento.
		/Logo após basta exibir os resultados. Quais os tipos das variáveis a serem utilizadas? Nome é uma sequência de caracteres, portanto
		/uma string. Já salário, valor do aumento e percentual são decimais, pois dinheiro tem casas decimais, e o resultado de um cálculo
		percentual geralmente também é um real.*/
		
		cadeia nome
		real porcentagem_aumento, salario_atual, novo_salario, aumento
		
		escreva("Qual o seu nome? ")
		leia(nome)
		limpa()
		
		escreva(nome, ", qual porcentagem você recebeu de aumento? ")
		leia(porcentagem_aumento)
		limpa()
		
		escreva("E qual o seu salário atual? ")
		leia(salario_atual)
		limpa()
		
		aumento = salario_atual*(porcentagem_aumento/100)
		novo_salario = salario_atual+aumento
		
		escreva(nome, ", com o aumento de ", porcentagem_aumento, "%, seu antigo salário passará de ", salario_atual, " para ", novo_salario, ".")
		
	}
}
