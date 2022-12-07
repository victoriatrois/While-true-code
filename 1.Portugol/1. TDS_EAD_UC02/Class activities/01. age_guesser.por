programa {
	funcao inicio() {
	    
		inteiro anoDeNascimento
		inteiro anoAtual
		inteiro mesDeNascimento
		inteiro mesAatual
		inteiro idade

		escreva("Qual o ano que você nasceu? ")
		leia(anoDeNascimento)
		limpa()
	    
		escreva("Qual o ano em que estamos? ")
		leia(anoAtual)
		limpa()

		escreva("Qual o mês em que você nasceu? (em números) ")
		leia(mesDeNascimento)
		limpa()
	    
		escreva("Qual o mês em que estamos? (em números) ")
		leia(mesAtual)
		limpa()

		idade = anoAtual - anoDeNascimento
		se(mesDeNascimento <= mesAtual){
			escreva("Você tem ", idade, " anos.")
		}senao{
			escreva("Você tem ", idade - 1, " anos.")
		}
	}
}