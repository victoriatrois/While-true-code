programa
{
	funcao inicio()
	{
		/*Monte  um  algoritmo  em  que  o  usuário  poderá  cadastrar  e  pesquisar hóspedes.  O algoritmo  deve  oferecer  um  menu  com
		 *três  opções  ao usuário: 1–Cadastrar; 2-Pesquisar; 3-Sair. A opção “cadastrar” deve permitir  que  o  usuário  informe  um  nome
		 *de  hóspede,  gravando-o  em memória (com  um máximo  de  15  cadastros,  mostrando  a  mensagem “Máximo  de  cadastros  atingido”
		 *quando  isso  acontecer).   A   opção “pesquisar” deve permitir que o usuário informe um nome e, caso seja encontrado um nome 
		 *exatamente igual, mostre a mensagem “Hóspede (nome) foi  encontrado  no  índice (índice no qual foicadastrado)”. Se  o nome não
		 *for encontrado, mostre “Hóspede  não  encontrado”. O algoritmo deve permitir que o usuário realize essas operações repetidas vezes,
		 *até que use a opção “3”, que encerra o algoritmo.
		 *      Exemplo:
		 *              Saída: Digite 1-Cadastrar; 2-Pesquisar; 3-Sair
		 *              Entrada: 1
		 *              Entrada: Maria da Silva
		 *              Saída: Digite 1-Cadastrar; 2-Pesquisar; 3-Sair
		 *              Entrada: 1
		 *              Entrada: José Freitas
		 *              Saída: Digite 1-Cadastrar; 2-Pesquisar; 3-Sair
		 *              Entrada: 2
		 *              Entrada: José Freitas
		 *              Saída: Hóspede José Freitas foi encontrado no índice 1
		 *              Saída: Digite 1-Cadastrar; 2-Pesquisar; 3-Sair
		 *              Entrada: 3
	     */
	
	cadeia hospede[15], consulta = " "
	inteiro opcao = 0, i = 0
	
	    //início repetição do menu
	
    para (i = 0; i<= 14; i++)
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
    	                
            caso 2: escreva("Digite o nome do hóspede que você deseja pesquisar.\n")
            leia(consulta)
            
            para (i = 0; i<= 14; i++)
            {
                se(consulta == hospede[i])
                {
    	            escreva("Hóspede ", hospede[i], " foi encontrado no índice ", i, ".\n")
                }
            }

            se (consulta != hospede[0] e consulta != hospede[1] e consulta != hospede[2] e consulta != hospede[3] e consulta != hospede[4] e consulta != hospede[5] e consulta != hospede[6] e consulta != hospede[7] e consulta != hospede[8] e consulta != hospede[9] e consulta != hospede[10] e consulta != hospede[11] e consulta != hospede[12] e consulta != hospede[13] e consulta != hospede[14])
            {
                escreva("Hóspede não encontrado(a).\n")
            }
            pare
        
            caso 3:i=50
            pare
            
    	}
    }
    }
}