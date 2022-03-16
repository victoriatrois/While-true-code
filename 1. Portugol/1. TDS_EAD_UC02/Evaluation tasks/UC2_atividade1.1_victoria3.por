programa {
	funcao inicio() {
		/*Quando uma empresa contrata o hotel para abrigar eventos, o hotel oferece garçons para servir os convidados. Cada garçom custa R$ 10,50 por hora. Um dos garçons da equipe
		 *coordena os demais e, por isso, recebe R$ 12,00 por hora. Considerando essas informações, escreva um algoritmo que recebe o número de garçons necessários e o total de
		 *horas do evento e calcule o custo total que o hotel terá com a contratação desses profissionais. Considere que serão informados sempre valores maiores ou iguais a 1 para
		 *as entradas do algoritmo. Ao final, mostre o custo total em tela.
         *Exemplo
         *Entradas: 4 garçons; 8 horas
         *Saída: “Custo total: R$ 348.0”
         */
         
		real duracao_evento, hr_garcons, extra_gracom_coord, custo_garcons, custo_garcom_coord, custo_total_evento
		inteiro num_garcons
		
        hr_garcons = 10.50
		extra_gracom_coord = 1.50
		
		escreva("Digite a duração do evento em horas: " )
		leia(duracao_evento)
		se(duracao_evento < 1)
		{
		    escreva("Valor inválido. Os eventos devem durar ao menos uma hora.")
		    leia(duracao_evento)
		}
		escreva("Digite o número de garçons que trabalharão: ")
		leia(num_garcons)
		se(num_garcons < 1)
		{
		    escreva("Valor inválido. Você precisará de no mínimo 01 garçon.")
		    leia(num_garcons)
		}
		
		custo_garcons = hr_garcons * duracao_evento
		custo_garcom_coord = extra_gracom_coord * duracao_evento
		custo_total_evento = custo_garcons * num_garcons + custo_garcom_coord
		
		escreva ("O custo total do evento será de ", custo_total_evento, " reais.")
	}
}
