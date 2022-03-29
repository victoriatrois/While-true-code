programa {
    inteiro i=1, pontuacaoEquipe[3], numVitorias, numEmpates
    cadeia nomeEquipe[3]
    
    
    funcao inteiro calculaPontosEquipe(inteiro vitorias, inteiro empates)
    {
        escreva("Digite o nome da ", i+1, "ª equipe?\n")
		leia(nomeEquipe[i])
		escreva ("Digite o número de vitórias que esta equipe teve?\n")
		leia(numVitorias)
		escreva ("Agora digite o número de empates?\n")
		leia(numEmpates)
        limpa()
        
        pontuacaoEquipe[i] = (numVitorias*3) + numEmpates
        retorne pontuacaoEquipe[i]
        
    }
    
    funcao vazio exibeEquipeEPontuacao(cadeia equipe, inteiro potuacao)
    {
      escreva("A equipe ", nomeEquipe[i], " obteve a pontuação de ", pontuacaoEquipe[i], " pontos.\n")  
    }
    
	funcao inicio() {
		
		para (i=0; i<=2; i++)
		{
		    calculaPontosEquipe(numVitorias, numEmpates)
		}
		para (i=0; i<=2; i++)
		{
		    exibeEquipeEPontuacao(nomeEquipe[i], pontuacaoEquipe[i])
		}
	}
}
