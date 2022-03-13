programa {
	funcao inicio() {
	    
	    inteiro ano_nasc, ano_atual, mes_nasc, mes_atual, idade
		
		escreva("Qual o ano que você nasceu? ")
		leia(ano_nasc)
	    limpa()
	    
	    escreva("Qual o ano em que estamos? ")
		leia(ano_atual)
		limpa()
		
		escreva("Qual o mês em que você nasceu? (em números) ")
		leia(mes_nasc)
	    limpa()
	    
	    escreva("Qual o mês em que estamos? (em números) ")
		leia(mes_atual)
		limpa()
		
		idade = ano_atual - ano_nasc
		se(mes_nasc <= mes_atual){
		escreva("Você tem ", idade, " anos.")
		}senao{
		escreva("Você tem ", idade - 1, " anos.")
	}
}

}