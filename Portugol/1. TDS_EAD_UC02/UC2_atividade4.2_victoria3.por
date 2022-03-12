programa
{
    /* Modifique o algoritmo anterior para que seja possível obter os diferentes valores orçados e verificar o menor valor. Mostre, ao final, a mensagem:
	“O orçamento de menor valor é o de (nome da empresa) por R$ (menor valor)”.
	Exemplo:
	         Entradas: “Empresa 1”; R$ 100,00 por aparelho; 15 aparelhos, 20% de desconto; mínimo de 10 unidades para desconto
	         Saída: O serviço com empresa 1 custará R$ 1200.0
	         Saída: Deseja informar novos dados? (S/N)
	         Entrada: “S”
	         Entradas: “Empresa 2”; R$ 90,00 por aparelho; 15 aparelhos, 0% de desconto; 0 unidades (pois não oferece desconto)
	         Saída: O serviço com a empresa 1 custará R$ 1350.0
	         Saída: Deseja informar novos dados? (S/N)
	         Entrada: “N”
	         Saída: O orçamento de menor valor é o da “empresa 1” por R$ 1200.0*/
    
    const inteiro maxEmpresas = 10
    const inteiro maxColunas = 4
    
    funcao vazio cadastro(cadeia ne[], real m[][], inteiro idx)
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
    				escreva("Entrada inválida.\nDigite um valor maior que zero.\n\n")
    			}
    		}
    		
    		enquanto(qnt_aparelhos < 1.0)
    		{
    			escreva("Digite a quantidade de aparelhos para manutenção:\n")
    			leia (qnt_aparelhos)
    			limpa()
    			se (qnt_aparelhos < 1.0)
    			{
    				escreva("Entrada inválida.\nDigite um valor maior zero.\n")
    			}
    		}
    		
    		enquanto(desconto < 0.0 ou desconto > 100.0)
    		{
    			escreva("Digite o percentual de desconto:\n")
    			leia (desconto)
    			se (desconto < 0.0 ou desconto > 100.0)
    			{
    				escreva("Entrada inválida.\nDigite um valor entre 0 e 100\n")
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
    					escreva("Entrada inválida.\nDigite uma quantidade maior ou igual a zero,\n")
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

	funcao real calculaOrc(real m[][], inteiro idx)
	{
		real preco_por_aparelho = m[idx][0]
		real qnt_aparelhos = m[idx][1]
		real desconto = m[idx][2]
		real qnt_min = m[idx][3]

		se (desconto == 0)
		{
			retorne preco_por_aparelho * qnt_aparelhos
		}
		senao se (qnt_aparelhos >= qnt_min)
		{
			desconto = 1 - (desconto / 100)
			retorne preco_por_aparelho * qnt_aparelhos * desconto
		}

		retorne -1.0 // Caso dÃª erro, retorna -1.0
	}

	funcao inteiro menor_orcamento(real v[], inteiro qnt)
	{
		real menor = v[0]
		inteiro idx_do_menor = 0
		
		para (inteiro i = 0; i < qnt; i++)
		{
			se (menor > v[i])
			{
				menor = v[i]
				idx_do_menor = i		
			}
		}
		retorne idx_do_menor
	}
    
	funcao inicio()
	{
		cadeia empresa[maxEmpresas]			// Vetor para cadastrar os nomes das empresas
		real matriz[maxEmpresas][maxColunas]
		inteiro indice = 0
		caracter opcao = 'S'
		real orcamento[maxEmpresas]
		inteiro indice_menor_orcamento = 0

		enquanto (opcao != 'n' ou opcao != 'N')
		{
			
			cadastro(empresa, matriz, indice)
			orcamento[indice] = calculaOrc(matriz, indice)
			
			escreva("O serviço da ", empresa[indice], " custará R$ ", orcamento[indice], ".\n\n")
			indice++
			
			escreva("Deseja informar novos dados?\n")
			leia (opcao)
				
			enquanto (opcao != 'S' e opcao != 's' e opcao != 'N' e opcao != 'n')
			{
				
				se (opcao != 'S' e opcao != 's' e opcao != 'N' e opcao != 'n')
				{
					escreva("Entrada inválida.\nDigite \"S\" ou \"N\".\n")
				}
				senao se (opcao == 'N' ou opcao == 'n')
				{
					pare
				}
			}
			se(opcao == 'N' ou opcao == 'n')
			{
				pare
			}
		}
		indice_menor_orcamento = menor_orcamento(orcamento, indice)
		escreva("O orçamento de menor valor é o da ", empresa[indice_menor_orcamento], " por R$ ", orcamento[indice_menor_orcamento], ".\n\n")
	}
}