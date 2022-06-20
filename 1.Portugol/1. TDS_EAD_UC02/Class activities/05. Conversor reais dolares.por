programa {
	funcao inicio() {
		/*Desenvolva um algoritmo que faça a conversão de valores de dólares para real com base nas seguintes regras:
		O usuário deverá informar o valor do dólar do dia.
		O usuário deverá informar o valor em dólares que deseja converter para real.
		Na saída, deverá ser exibido o valor em dólares e o valor correspondente em reais.*/
		
		real cotacao_dolar, reais, conversao
		
		escreva("Qual a cotação do dolar de hoje?\n")
		leia(cotacao_dolar)
		limpa()
		
		escreva("Quantos reais você quer converter?\n")
		leia(reais)
		limpa()
		
		conversao = cotacao_dolar*reais
		
		escreva("R$", reais, " = $", conversao, ".")
		
	}
}
