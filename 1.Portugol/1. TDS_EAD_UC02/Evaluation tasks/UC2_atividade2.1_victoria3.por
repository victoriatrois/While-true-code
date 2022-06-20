programa {
	funcao inicio() {
		/*Desenvolva um algoritmo que receba o valor de uma diária no hotel e a quantidade de dias de hospedagem. Valide essas informações
		 *para que o valor da diária não seja negativo e que a quantidade de dias não seja negativa nem maior que 30. Em caso de informação
		 *inválida, escreva na tela uma mensagem informando ao usuário e solicite novo valor. Ao final de tudo, escreva “Fim do programa”.
         *   Exemplo:
         *      Entrada: R$ 100 a diária
         *      Saída: Valor inválido
         *      Entrada: R$ 100 a diária
         *      Entrada: 30 dias
         *      Saída: Fim do programa
         */
        
        inteiro num_diarias
        real valor_diaria, total
            
        escreva("Quantos dias você ficará hospedado?\n")
        leia (num_diarias)
        limpa()
        se(num_diarias < 1 ou num_diarias >30){
            escreva("Valor inválido. Forneça um valor maior que 0 (zero) ou menor que 31 (trinta e um).")
        }
        escreva("Qual o valor da diária?\n")
        leia(valor_diaria)
        limpa()
        
        total = num_diarias*valor_diaria
        
        escreva("Uma estadia de ", num_diarias, " a ", valor_diaria, " reais, dará um total de ", total, " reais.")
	}
}
