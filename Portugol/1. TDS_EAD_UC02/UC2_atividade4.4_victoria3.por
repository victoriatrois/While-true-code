programa
{
    
    inclua biblioteca Texto --> tx
	funcao inicio()
	{
		/*Retome o algoritmo 3 da atividade 3. Aplique no código a biblioteca Texto de Portugol para permitir que o usuário pesquise por parte do nome do
		 hóspede, ao invés de ter que pesquisar o nome exato. Observe a seguir um exemplo de como usar a função posição_texto() da biblioteca.
		 programa
		 {
		     inclua biblioteca Texto --> tx
		     funcao inicio()
		     {
		          cadeia meutexto = "arara rara voa no ceu"
		          inteiro pos = tx.posicao_texto("rara", meutexto, 0)
		          se(pos < 0)
		          {
		              escreva("texto não encontrado")
		          }
		          senao
		          {
		              escreva("texto encontrado na posicao ", pos)
		          }
		     }
         }*/
		 
		cadeia hospede[15], consulta = " "
    	inteiro opcao = 0, i = 0
    	
        para (i = 0; i<= 14; i++) //início repetição do menu
        {
            escreva("Digite 1 para cadastar, 2 para pesquisar e 3 para sair.\n")
            leia(opcao)
            limpa()
            
            enquanto(opcao <1 ou opcao >3)
            {
                escreva("Entrada inválida. \nDigite 1 para cadastar, 2 para pesquisar e 3 para sair.\n")
                leia(opcao)
            }
        
            escolha(opcao)
            {
                caso 1: escreva("Digite o nome do(a) hóspede:\n")
                leia(hospede[i])
                pare
        	                
                caso 2: escreva("Digite o nome do hóspede que você deseja pesquisar:\n")
                leia(consulta)
                escreva("\n")

                para (i = 0; i<= 14; i++)
                {
                    inteiro pos = tx.posicao_texto(consulta, hospede[i], 0)
                    se(pos < 0)
		            {
		                escreva("texto não encontrado")
	                }
                    senao
		            {
                        escreva("texto encontrado no índice ", hospede[i], " na posicao ", pos, ".\n\n")
		            }
                }
                pare
            
                caso 3:i=50
                pare
        	}
        }
	}
}
