programa {
	funcao inicio() {
	    real peso, altura, IMC
	    
	    escreva("Qual o seu peso? (em quilos) ")
	    leia(peso)
	    
	    escreva("Qual a sua altura? (em metros) ")
	    leia(altura)
	    
	    IMC = peso/(altura*altura)
	    
	    escreva("Seu IMC é de ", IMC, ".")
	}
}