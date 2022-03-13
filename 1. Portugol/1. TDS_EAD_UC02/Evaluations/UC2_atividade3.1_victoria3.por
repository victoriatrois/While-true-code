programa
{
	funcao inicio()
	{
		/*Considerando  que  o  hotel  tenha  20  quartos,  desenvolva  um  algoritmo para  marcar  a  ocupação  de  cada  quarto. Inicie  todos  os  quartos
		 *como desocupados. Depois, o usuário informará o número do quarto (de 1 a 20) e, em seguida, se esse quarto está livre ou ocupado. Neste caso, se o
		 *quarto já estiver ocupado, mostre a mensagem “Quarto já ocupado”. Questione se o usuário quer informar outro quarto e, dessa forma, repita a operação.
		 *Ao fim, mostre o status de cada quarto.
		 *      Exemplo:
		 *              Entrada: 5
		 *              Entrada: Ocupado
		 *              Saída: Deseja continuar? (S/N)
		 *              Entrada: “S”
		 *              Entrada: 7
		 *              Entrada: Ocupado
		 *              Saída: Deseja continuar? (S/N)
		 *              Entrada: “S”
		 *              Entrada: 5
		 *              Entrada: Ocupado
		 *              Saída: Quarto já ocupado
		 *              Saída: Deseja continuar? (S/N)
		 *              Entrada: “S”
		 *              Entrada: 20
		 *              Entrada: Ocupado
		 *              Saída: Deseja continuar? (S/N)
		 *              Entrada: “N”
		 *              Saída:  1-livre; 2-livre; 3-livre; 4-livre; 5-ocupado; 6-livre; 7-ocupado; 8-livre; 9-livre; 10-livre; 11-livre;
		 *                      12-livre; 13-livre; 14-livre; 15-livre; 16-livre; 17-livre; 18-livre; 19-livre; 20-ocupado
		 */
		 
		//Declaração das variáveis
		inteiro num_quarto = 1, i = 0
		cadeia quarto[20], situacao_quarto = " ", continuar
		
		    //Parte em que o usuário informa se os quartos estão livres ou ocupados
		escreva("Bem vindo ao seu sistema de manutenção de ocupação de quartos.\nVamos começar?\n\n")
		escreva("Informe se o quarto está \"livre\", ou \"ocupado\":\n\n")
		
		
		            //repetição para preenchimento do vetor pelo usuário
        		para(i = 0; i<=19; i++)
        		{
        		    escreva("Quarto ", i+1, "\n")
        		    leia(quarto[i])
        		        
        		        //Opção de parar o programa
                	escreva("Deseja continuar?\n")
                	leia(continuar)
        		            
        		        //validação da entrado continuar
            		se (continuar != "S" e continuar != "N")
            		{
            		    escreva("Entrada inválida. Escreva \"S\" ou \"N\"\n")
            		    escreva("Deseja continuar?\n")
            		    leia(continuar)
            		}
            		senao se (continuar == "N")
            		{
            		    para(i = 0; i<19; i++)
            	        {
            		        escreva(num_quarto, "-", quarto[i], "; ")
            		        num_quarto++
                        }
                        para (i = 19; i<=19; i++)
                        {
                            escreva(num_quarto, "-", quarto[i])
                            num_quarto++
                        }
                    }
		        //final do escopo do laço "para"
                }
	//final o escopo da função início
	}
//final do escopo da função programa
}