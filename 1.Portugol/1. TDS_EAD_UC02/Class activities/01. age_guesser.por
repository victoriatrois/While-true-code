programa {
	funcao inicio() {
	    
		inteiro anoDeNascimento
		inteiro anoAtual
		inteiro mesDeNascimento
		inteiro mesAatual
		inteiro idade

		escreva("Qual o ano que voc� nasceu? ")
		leia(anoDeNascimento)
		limpa()
	    
		escreva("Qual o ano em que estamos? ")
		leia(anoAtual)
		limpa()

		escreva("Qual o m�s em que voc� nasceu? (em n�meros) ")
		leia(mesDeNascimento)
		limpa()
	    
		escreva("Qual o m�s em que estamos? (em n�meros) ")
		leia(mesAtual)
		limpa()

		idade = anoAtual - anoDeNascimento
		se(mesDeNascimento <= mesAtual){
			escreva("Voc� tem ", idade, " anos.")
		}senao{
			escreva("Voc� tem ", idade - 1, " anos.")
		}
	}
}