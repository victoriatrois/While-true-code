programa {
	
    	const inteiro maxEmpresas = 10
    	const inteiro maxColunas = 4
    
    /*A manutenção dos condicionadores de ar do hotel é© realizada por empresas terceirizadas que, em alguns casos, oferecem desconto quando o
		 serviço é feito em uma quantidade determinada de aparelhos. Assim, crie uma função ou um procedimento que receba o nome da empresa,
		 o valor do serviço por aparelho, a quantidade de aparelho em manutenção, o percentual de desconto (que pode ser zero) e a quantidade
		 mínima de aparelhos para que o desconto seja dado. Calcule o valor total do serviço, a partir do valor unitário e da quantidade de 
		 aparelhos, aplicando o desconto, caso seja  cabível, e mostre a mensagem "O serviço com (nome  da  empresa) custará R$(total calculado)".
		 Monte um algoritmo que permita que o usuário informe repetidas vezes os dados necessários para o cálculo e use a função/procedimento
		 para mostrar o total orçado. Termine o algoritmo quando o usuário responder "N" para a mensagem "Deseja informar novos dados? (S/N)".
		           Exemplo:
		                   Entradas:"Empresa 1"; R$  100,00  por  aparelho;  15  aparelhos, 20% de desconto; mínimo de 10 unidades para desconto
		                   Saída: O serviço com empresa 1 custará R$ 1200.0
		                   Saída: Deseja informar novos dados? (S/N)
		                   Entrada: "S"
		                   Entradas: "Empresa 2"; R$ 90,00 por aparelho; 15 aparelhos, 0% de desconto; 0 unidades (pois nãoo oferece desconto)
		                   Saída: O serviÃ§o com a empresa 1 custarÃ¡ R$ 1350.0
		                   Saída: Deseja informar novos dados? (S/N)
		                   Entrada: "N*/

 	/*m[0][0] - Empresa de indice 0, preÃ§o por aparelho
 	  m[0][1] - Empresa de indice 0, quantidade de aparelhos
 	  m[0][2] - Empresa de indice 0, desconto
 	  m[0][3] - Empresa de indice 0, num min de aparelhos para desconto*/
 	 
	funcao vazio cadastro(cadeia ne[], real m[][], inteiro idx) //função para cadastro das empresas, ne[] = Vetor para armazenar os nomes das empresas cadastradas e m[][] = Matriz para armazenar os dados
	{
		// idx = 0
		limpa()
		escreva("Digite o nome da empresa:\n")
		leia(ne[idx])
		limpa()
		
		real preco_por_aparelho = -1.0
		real qnt_aparelhos = -1.0
		real desconto = -1.0
		real qnt_min = -1.0
		enquanto(preco_por_aparelho < 1.0)
		{
			escreva("Digite o valor do serviço por aparelho:\n")
			leia (preco_por_aparelho)
			limpa()
			se (preco_por_aparelho < 1.0)
			{
				escreva("Entrada inválida.\nDigite um valor maior ou igual a 1.\n\n")
			}
		}
		
		enquanto(qnt_aparelhos < 1.0)
		{
			escreva("Digite a quantidade de aparelhos para manutenção?\n")
			leia (qnt_aparelhos)
			limpa()
			se (qnt_aparelhos < 1.0)
			{
				escreva("Entrada inválida.\nDigite uma quantidade maior que zero.\n")
			}
		}
		
		enquanto(desconto < 0.0 ou desconto > 100.0)
		{
			escreva("Digite o percentual de desconto:\n")
			leia (desconto)
			se (desconto < 0.0 ou desconto > 100.0)
			{
				escreva("Entrada inválida.\nDigite um percentual de desconto entre 0 e 100\n")
			}
		}

		se (desconto > 0)
		{
			enquanto(qnt_min < 0.0)
			{
				escreva("Digite a quantidade minima de aparelhos para desconto:\n")
				leia (qnt_min)
				limpa()
				se (qnt_min < 0.0)
				{
					escreva("Entrada inválida.\nDigite um valor maior ou igual a 0\n\n")
				}
			}
		}
		senao
		{
			qnt_min = 0.0
		}
		
		m[idx][0] = preco_por_aparelho
		m[idx][1] = qnt_aparelhos
		m[idx][2] = desconto
		m[idx][3] = qnt_min
	}
	 
	funcao real calculaOrc(real m[][], inteiro idx) //m[][] é a matriz que recebe os dados entrados , idx é o contador usado para acessar os dados da empresa que se deseja calcular o orçamento
	{
		real preco_por_aparelho = m[idx][0]
		real qnt_aparelhos = m[idx][1]
		real desconto = m[idx][2]
		real qnt_min = m[idx][3]

		se (desconto == 0)
		{
			retorne preco_por_aparelho * qnt_aparelhos
		}
		senao
		{
			desconto = 1 - (desconto / 100)
			retorne preco_por_aparelho * qnt_aparelhos * desconto
		}
	}
    
	funcao inicio()
	{
		cadeia empresa[maxEmpresas]			// Vetor para aarmazenar os nomes das empresas
		real matriz[maxEmpresas][maxColunas]// Matriz para armazenar preço, quantidade, desconto, quantidade mínima
		inteiro indice = 0					// Indice para identificar a posição da empresa cadastrada, acessada ou impressa
		caracter opcao = 'S'				// VariÃ¡variável para receber a opcao e inicializar o laço enquanto
		real orcamento[maxEmpresas]			// Vetor para armazenar os orçamentos
		
		enquanto (opcao == 'S' ou opcao == 's')
		{
			cadastro(empresa, matriz, indice)
			orcamento[indice] = calculaOrc(matriz, indice)

			escreva("O serviço de ", empresa[indice], " custará R$", orcamento[indice], ".\n\n")
		    indice++
		    
		    escreva("Deseja informar novos dados?\n")
			leia (opcao)
		
			enquanto (opcao == 'S' ou opcao == 's')
			{
				se (opcao != 'S' e opcao != 's' e opcao != 'N' e opcao != 'n')
				{
					escreva("Entrada inválida.\nDigite \"S\" ou \"N\".\n")
				}
				senao
				{
					pare
				}
			}
		}
	}
}