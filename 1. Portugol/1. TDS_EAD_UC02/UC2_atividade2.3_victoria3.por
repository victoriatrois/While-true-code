programa {
	funcao inicio() {
		/*Escreva um algoritmo que receba o valor normal de uma diária e, em seguida, receba nomes de hóspedes e suas idades. Caso o hóspede
		 *tenha idade inferior a 4 anos, ele não paga hospedagem, nesse caso, mostre na tela “(Nome do hóspede) possui gratuidade”. Hóspede
		 *com mais de 80 anos paga metade, então mostre na tela “(Nome do hóspede) paga meia”. O usuário informará hóspedes até digitar a
		 *palavra “PARE”, que interrompe a entrada de dados. Ao fim, mostre a quantidade de gratuidades, a quantidade de meias hospedagens e o
		 *valor total, considerando todos os hóspedes informados.
		 *      Exemplo
		 *              Entrada: R$ 100 a diária
		 *              Entrada: Adolfo, 50 anos
		 *              Entrada: Murilo, 1 ano
		 *              Saída: Murilo possui gratuidade
		 *              Entrada: Joaquim, 82 anos
		 *              Saída: Joaquim paga meia
		 *              Entrada: PARE
		 *              Saída: Total de hospedagens: R$ 150; 1 gratuidade(s); 1 meia(s)
         */
         
         real valor_diaria, contador_meia = 0.0, contador_gratuidade = 0.0, contador_inteira = 0.0
         cadeia nome = ""
         inteiro idade
        
        escreva("Qual o valor da diária?\n")
        leia(valor_diaria)
        limpa()
        
        se (valor_diaria <= 0)
        {
            escreva("Valor inválido.\nUse ponto ao invés de vírgula e valores maiores que zero.")
        }
        enquanto(nome != "PARE")
            {
                escreva("Qual o nome do hóspede? (Para para digite: 'PARE'.)\n")
                leia(nome)
                limpa()
                
                se(nome == "PARE" ou nome == "pare" ou nome == "Pare")
                    pare
                
                escreva("Qual a idade de ", nome, "?\n")
                leia(idade)
                limpa()
                
                se (idade < 4)
                {
                escreva(nome, " possui gratuidade. (0.00)\n")
                contador_gratuidade++
                }
                senao se (idade >= 80)
                {
                escreva(nome, " paga meia. (", valor_diaria/2, ")\n")
                contador_meia++
                }
                senao
                {
                escreva(nome, " paga inteira. (", valor_diaria, ")\n")
                contador_inteira++
                }
            }
        se (contador_inteira >=1 e contador_gratuidade >= 1 e contador_meia >= 1)
        {
            escreva("Valor total em diárias: ", valor_diaria*(contador_inteira + (contador_meia/2)), ".\nSendo elas\n\t\t", contador_inteira, " inteira(s)\n\t\t", contador_gratuidade, "gratuidade(s) e \n\t\t", contador_meia, "meia(s).")
	    }
	    senao se (contador_inteira >=1 e contador_gratuidade >= 1 e contador_meia == 0)
	    {
	        escreva("Valor total em diárias: ", valor_diaria*(contador_inteira), ".\nSendo elas\n\t\t", contador_inteira, " inteira(s) e\n\t\t", contador_gratuidade, " gratuidade(s).")
	    }
	    senao se (contador_inteira >=1 e contador_gratuidade == 0 e contador_meia >= 1)
	    {
	        escreva("Valor total em diárias: ", valor_diaria*(contador_inteira + (contador_meia/2)), ".\nSendo elas\n\t\t", contador_inteira, " inteira(s) e\n\t\t", contador_meia, " meia(s)")
	    }
	    senao se (contador_inteira >=1 e contador_gratuidade == 0 e contador_meia == 0)
	    {
	        escreva("Valor total em diárias: ", valor_diaria*(contador_inteira), ".\nSendo elas\n\t\t", contador_inteira, " inteira(s).")
        }
	}
}