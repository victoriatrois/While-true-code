programa {
	funcao inicio() {
		
		/*Com base na situação anterior, considere que o hotel calcula a necessidade de 1 garçom para cada 20 participantes do evento. Assim, monte um algoritmo, baseado no anterior,
		 *em que, ao invés de receber o número de garçons, receba a quantidade de convidados do evento, além da quantidade de horas do evento. Calcule e mostre na tela o número de 
		 *garçons necessários e o custo total. Quando o número de participantes for menor que 20, considere apenas um garçom. Não deixe de aplicar a regra do coordenador, enunciada no
		 *item anterior.
         *                  Exemplo:
         *                          Entradas: 200 pessoas; 10 horas
         *                          Saídas: “Serão necessários 10 garçons”; “Custo total: R$ 1065.0”
         */
		
		inteiro num_convidados, num_garcons
		real duracao_evento, hr_garcons, extra_gracom_coord, custo_garcons, custo_garcom_coord, custo_total_evento
		
		escreva("Quantos convidados o seu evento receberá? \n")
		leia(num_convidados)
		limpa()
		
		escreva("Quantas horas o seu evento durará? \n")
		leia(duracao_evento)
		limpa()
		
		num_garcons = num_convidados / 20.0
		
		se (num_garcons == 1)
	    escreva("Você precisará de 1 garçom.")
	    senao escreva("Você precisará de ", num_garcons, " garçons e ")
	    
	    hr_garcons = 10.50
	    extra_gracom_coord = 1.50
	
	    custo_garcons = hr_garcons * duracao_evento
	    custo_garcom_coord = extra_gracom_coord * duracao_evento
	    custo_total_evento = custo_garcons * num_garcons + custo_garcom_coord
	
	    escreva ("o custo total do evento será de ", custo_total_evento, " reais.")

//rever com %
	}
}
