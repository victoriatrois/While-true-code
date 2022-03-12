programa
{
	funcao inicio()
	{
		/*Monte um algoritmo que receba uma quantidade indeterminada de números inteiros representando os quartos do hotel. Para cada quarto,
		 *informe se ele está ocupado (“S” ou “N”). Em caso positivo, informe se está limpo (“S” ou “N”) e quantos dias ficará ocupado.
		 *Interrompa as entradas ao informar -1 para o número do quarto. Ao final, mostre quantos quartos ocupados ainda precisam de limpeza,
		 *qual quarto ficará ocupado por mais tempo e por quantos dias.
		 *      Exemplo
		 *              Entradas: Quarto 10, ocupado “S”, limpo “S”, ocupado por 10 dias
		 *              Entradas: Quarto 12, ocupado “N”
		 *              Entradas: Quarto 14, ocupado “S”, limpo “N”, ocupado por 15 dias
		 *              Entradas: Quarto 16, ocupado “S”, limpo “N”, ocupado por 7 dias
		 *              Entradas: Quarto -1
		 *              Saídas: 2 quartos necessitam limpeza; O quarto 14 ficará ocupado por mais tempo: 15 dias
		 */
		 
		inteiro num_quarto = 1, dias_ocupado = 0, contador_precisa_limp = 0, mais_dias_ocupado = 0, quarto_mais_dias_ocupado = 0, finalizar = 0
		caracter limpo = ' ', ocupado = ' '
		
		//Início da repetição do programa
		enquanto(num_quarto >= 1)
		{
		    escreva("Para interromper a inserção digite '-1'.\n")
		    escreva("Digite o número do quarto:\n")
		    leia(num_quarto)
		    
		enquanto(num_quarto < -1 ou num_quarto == 0) //Validação do número do quarto: refuta-se números menores que -1 ou 0
		     {
		        escreva("Número inválido. Digite um número maior que zero.\nPara interromper a inserção digite '-1'.\n")
		        leia(num_quarto)
		     }
		     
		se (num_quarto >= 1) //Continuação da repetição: pede-se detalhes ao usuário
		     {
		        escreva("O quarto ", num_quarto, " está ocupado? (Digite 'S' para 'sim' e 'N' para 'não'.\n")
                leia(ocupado)
		        limpa()
		        //
		        se(ocupado == 'S')
		        {
		            escreva("O quarto ", num_quarto, " está limpo? (Digite 'S' para 'sim' e 'N' para 'não'.\n")
                    leia(limpo)
		            limpa()
		            
		            se(limpo == 'N')
		            {
		                contador_precisa_limp++
		            }
		            
		            escreva("Por quantos dias o quarto ", num_quarto, " ficará ocupado?\n")
                    leia(dias_ocupado)
                    limpa()
                    
                    se (dias_ocupado > mais_dias_ocupado)
                    {
                        quarto_mais_dias_ocupado = num_quarto
                        mais_dias_ocupado = dias_ocupado    
                    }
		        }
		    }
		se(num_quarto == -1)
		{
            escreva(contador_precisa_limp, " quarto(s) precisa(m) de limpeza; O quarto ", quarto_mais_dias_ocupado, " ficará mais dias ocupado: ", mais_dias_ocupado, ".\n")
		}
	    } //Fim do escopo da repetição
    }
}
