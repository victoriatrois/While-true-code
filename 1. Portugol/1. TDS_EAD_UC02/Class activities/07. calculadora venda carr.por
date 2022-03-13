programa {
	funcao inicio() {
		/*O custo de um carro novo ao consumidor é a soma do custo de fábrica, da porcentagem do distribuidor e dos impostos (aplicados ao custo
		de fábrica). Supondo que o percentual do distribuidor seja de 28% e dos impostos de 45%, escreva um algoritmo para ler o custo de fábrica
		de um carro, calcular e escrever o custo final ao consumidor.*/
		
		real custo_final, custo_fabrica, porcen_distr = 0.28, impostos = 0.45
		
		escreva("Qual o custo de fabricação do veículo?\n")
		leia(custo_fabrica)
		limpa()
		
		custo_final = custo_fabrica+(custo_fabrica*porcen_distr)+(custo_fabrica*impostos)
		
		escreva("O custo de venda para o consumidor será de ", custo_final)


	}
}
