programa
{
	funcao inicio()
	{
		/*Escreva  um algoritmo que receba os nomes e sexos de 10  hóspedes. Depois disso, mostre, separadamente: primeiro,todos os nomes dos hóspedesdo sexo
		 *masculino;depois,todos os nomes das hóspedes do sexo feminino.
		 *  Exemplo:
		 *           Entradas: Maria  Silva,  “F”;  Antônia  Oliveira,  “F”;  João  Siqueira, “M”; Joaquim Sá, “M”; José da Silva, “M”;
		 *           Mário Peres, “M”; Joana Assunção, “F”; Helena Sá, “F”; Marisa Tomás, “F”; Roberto Freire,“M”
		 *           
		 *           Saídas: João  Siqueira, Joaquim  Sá,  José  da  Silva,  Mário  Peres, Roberto Freire
		 *           Maria Silva, Antônia Oliveira,Joana Assunção, Helena Sá, Marisa Tomás
	     */
	
	cadeia hospede[10], sexo[10]
	inteiro i = 0, masc = 0, fem = 0
	
	para(i = 0; i<=9; i++)
    {
        escreva("Digite o nome do hóspede ", i+1, "\n")
        leia(hospede[i])
        escreva("Qual o sexo de ", hospede[i], " (digite \"M\" para masculino e \"F\" para feminino?\n")
        leia(sexo[i])
        limpa()
        
        se(sexo[i] != "M" e sexo[i] != "m" e sexo[i] != "F" e sexo[i] != "f")
        {
            escreva("Entrada inválida. Digite \"M\" para masculino e \"F\" para feminino?\n")
            leia(sexo[i])
        }
    }
    para(i = 0; i<=9; i++)
    {
        se (sexo[i] == "M" ou sexo[i] == "m")
        {
            masc++
            se (masc > 1)
            {
                escreva("; ", hospede[i])
            }
            senao
            {
                escreva(hospede[i])
            }
        }
    }
    escreva("\n\n")
    para(i = 0; i<=9; i++)
    {
        se (sexo[i] == "F" ou sexo[i] == "f")
        {
            fem++
            se (fem > 1)
            {
                escreva("; ", hospede[i])
            }
            senao
            {
                escreva(hospede[i])
            }
        }
    }
    
    }
}