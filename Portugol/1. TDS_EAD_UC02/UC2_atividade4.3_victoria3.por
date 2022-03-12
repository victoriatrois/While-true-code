/*
		 * A depreciação de bens é o cálculo que se faz sobre o valor original de um item e o quanto se perde desse valor com o passar do tempo. O hotel calcula
		 * depreciação anual da seguinte maneira:
		 * DA = (valor original – valor residual) / vida útil
		 * Valor original é o valor de compra de um item e valor residual é a taxa anual de depreciação aplicada ao valor original. Taxa anual e vida útil
		 * obedecem a seguinte tabela:
		 * Categoria        Taxa anual  Vida útil
		 * Móveis           10%         10 anos
		 * Aparelhos        10%         10 anos
		 * Ferramentas      15%         6 anos
		 * Equipamentos TI  20%         5 anos
		 * Considerando essas categorias (móveis – “M”; aparelhos – “A”; ferramentas – “F”; informática – “I”) e o valor original, monte uma função ou procedi-
		 * mento que calcule a depreciação anual de um item. Em seguida, monte outra função ou procedimento que receba o nome do item, a categoria, o valor ori-
		 * ginal e o ano de aquisição, assim como calcule e mostre na tela quanto se depreciou até o ano atual e quanto se depreciará ano a ano até o fim da
		 * vida útil do item (para cálculo da idade do item, considere ano atual fixo, ignorando mês e dia; caso o item já tenha ultrapassado sua vida útil,
		 * mostre apenas o valor atual). Por fim, monte um algoritmo que permita que o usuário informe esses dados e realize o cálculo ano a ano de um item.
		 *          Exemplo:
		 *                Entradas: Cadeira, categoria “M” (móveis), valor original R$ 250, comprada em 2020
		 *                Saídas: Valor ao final de 2022: R$ 205
		 *                        Valor projetado para 2023: R$ 182,5
		 *                        Valor projetado para 2024: R$ 160
		 *                        Valor projetado para 2025: R$ 137,5
		 *                        Valor projetado para 2026: R$ 115
		 *                        Valor projetado para 2027: R$ 92,5
		 *                        Valor projetado para 2028: R$ 70
		 *                        Valor projetado para 2029: R$ 47,5
		 *                        Valor projetado para 2030: R$ 25
		 */

programa
{
    cadeia item
    caracter categoria = ' '
	real valorOriginal = 0
	inteiro anoAquisicao = 0, anoAtual = 0
	
	funcao vazio entrarBem()
	{
	    escreva ("Digite o item:\n")
	    leia(item)
	    limpa()
	    
	    enquanto (categoria == ' ')
	    {
    	    escreva("Digite a categoria do bem.\nDigite \"M\" para móveis, \"A\" para aparelhos, \"F\" para ferramentas e \"I\" para equipamentos de informática:\n")
    	    leia(categoria)
    	    limpa()
    	    se (categoria != 'M' e categoria != 'A' e categoria != 'F' e categoria != 'I' e categoria != 'm' e  categoria != 'a' e categoria != 'f' e categoria != 'i')
    	    {
    	        escreva("Entrada inválida.\n Digite \"M\" para móveis, \"A\" para aparelhos, \"F\" para ferramentas e \"I\" para equipamentos de informática:\n")
    	    }
	    }
	    
	    enquanto (valorOriginal == 0)
	    {
    	    escreva("Digite o valor pago pelo bem:\n")
    	    leia(valorOriginal)
    	    se (valorOriginal <= 0)
    	    {
    	        escreva("Entrada inválida.\n Digite um valor maior que zero.\n")
    	    }
	    }
	    
	    enquanto (anoAquisicao == 0)
	    {
    	    escreva("Digite o ano em que este bem foi adquirido:\n")
    	    leia(anoAquisicao)
    	    se (anoAquisicao <= 0)
    	    {
    	        escreva("Entrada inválida.\n Digite um valor maior que zero.\n")
    	    }
	    }
	    
	    enquanto (anoAtual == 0)
	    {
	        escreva("Digite o ano atual:\n")
    		leia(anoAtual)
    		limpa()
    		se (anoAtual <= 0)
    	    {
    	        escreva("Entrada inválida.\nDigite um valor maior que zero.\n")
    	    }
	    }
	    
	    calculaDepreciacao()
	}
	
	funcao vazio calculaDepreciacao()
	{
	    //variáveis
	    // DA = (valor original – valor residual) / vida útil
	    inteiro vidaUtil = 0
	    real valorResidual = 0, depreciacaoAnual = 0, depreciacaoPorAno = 0
		 
		 se (categoria == 'M' ou categoria == 'm' ou categoria == 'A' ou categoria == 'a')
		 {
		     vidaUtil = 10
		     valorResidual = valorOriginal*0.1
		     depreciacaoAnual = (valorOriginal-valorResidual)/vidaUtil
		     
		     escreva("Valor ao final de ", anoAtual, ": ", valorOriginal - (depreciacaoAnual*(anoAtual - anoAquisicao)), "\n")
		     depreciacaoPorAno = valorOriginal - (depreciacaoAnual*(anoAtual - anoAquisicao))
		     para (inteiro i = anoAtual+1; i <= anoAquisicao+vidaUtil; i++)
		     {
		         escreva("Valor projetado para ", i, ": R$", depreciacaoPorAno - depreciacaoAnual, "\n")
		         depreciacaoPorAno -= depreciacaoAnual
		     }
		 }
		 senao se (categoria == 'F' ou categoria == 'f')
		 {
		     vidaUtil = 6
		     valorResidual = valorOriginal*0.15
		     depreciacaoAnual = (valorOriginal-valorResidual)/vidaUtil
		     
		     escreva("Valor ao final de ", anoAtual, ": ", valorOriginal - (depreciacaoAnual*(anoAtual - anoAquisicao)), "\n")
		     depreciacaoPorAno = valorOriginal - (depreciacaoAnual*(anoAtual - anoAquisicao))
		     para (inteiro i = anoAtual+1; i <= anoAquisicao+vidaUtil; i++)
		     {
		         escreva("Valor projetado para ", i, ": R$", depreciacaoPorAno - depreciacaoAnual, "\n")
		         depreciacaoPorAno -= depreciacaoAnual
		     }
		 }
		 senao
		 {
		     vidaUtil = 5
		     valorResidual = valorOriginal*0.2
		     depreciacaoAnual = (valorOriginal-valorResidual)/vidaUtil
		     
		     escreva("Valor ao final de ", anoAtual, ": ", valorOriginal - (depreciacaoAnual*(anoAtual - anoAquisicao)), "\n")
		     depreciacaoPorAno = valorOriginal - (depreciacaoAnual*(anoAtual - anoAquisicao))
		     para (inteiro i = anoAtual+1; i <= anoAquisicao+vidaUtil; i++)
		     {
		         escreva("Valor projetado para ", i, ": R$", depreciacaoPorAno - depreciacaoAnual, "\n")
		         depreciacaoPorAno -= depreciacaoAnual
		     }
		 }
	}
	
	funcao inicio()
	{
		entrarBem()
	}
}
