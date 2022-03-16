/***********************
 * O INSERTION SORT é um algoritmo de ordenação que normalmente é comparado com
 * a ordenação de cartas de baralho na mão de um jogador: ao se capturar uma nova carta, 
 * se busca a posição adequada para ela.
 * Assim, a partir de um vetor com N elementos desordenados, percorremos item a item,
 * comparamos com os itens anteriores (já ordenados) e trocamos a posição de um com 
 * o outro caso o item analisado seja menor que o anterior.
 * 
 * Este vídeo mostra de maneira divertida como o algoritmo funciona 
 * https://www.youtube.com/watch?v=ROalU379l3U
 * 
 * O código abaixo pretende implementar o INSERTION SORT sobre um vetor de 10 posições.
 * Exemplo de entrada:
 * 	11 13 25 31 45 2 12 26 36 37 
 * Exemplo de saída:
 * 	2 11 12 13 25 26 31 36 37 45 
 *
 */

programa
{
	inclua biblioteca Util --> utl

	
	funcao inicio()
	{
		inteiro vetor[10] 

		informaVetor(vetor)
		
		exibeVetor(vetor)

		ordena(vetor)

		exibeVetor(vetor)
	}
	
	//l� valores do usu�rio para o vetor
	funcao informaVetor(inteiro v[])
	{
		inteiro tamanho = utl.numero_elementos(v)

		escreva("\n")
		para(inteiro i = 0; i< tamanho; i++)
		{
			escreva("\nInforme o valor ", i, ": ")
			leia(v[i])
		}
	}
	
	//percorre o vetor exibindo na tela os valores
	funcao exibeVetor (inteiro v[]) 
	{
		inteiro tamanho = utl.numero_elementos(v)
		para(inteiro i = 0; i < tamanho; i++)
		{
			escreva (v[i], " ")
		}
		escreva("\n")
	}
	
    // trocando quando necessário deixando o valor do item no local correto
	funcao troca (inteiro v[], inteiro a, inteiro b)
	{
		inteiro c = v[a]
		
		v[a] = v[b]
		v[b] = c
	}
	
	/*ordena utilizando insertion sort*/
	//parte do segundo item em diante; para cada item, compara com os anteriores
	funcao ordena (inteiro v[])
	{
		para (inteiro i = 0; i < 10; i++)
		{
			para (inteiro j = 0; j < 9; j++)
			{
				se (v [j] > v[j+1])
				{
					troca (v, j, j+1)
				}
			}
		}
	}
}