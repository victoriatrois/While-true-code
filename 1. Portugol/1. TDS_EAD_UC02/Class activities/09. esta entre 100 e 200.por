programa {
	funcao inicio() {
	    //Desenvolva um algoritmo em que é solicitado ao usuário digitar um número e mostre a mensagem caso esse número esteja no intervalo entre 100 e 200.
        
        inteiro num
        
        escreva("Digite um número\n")
        leia(num)
        
        se (num >= 100 e num <= 200)
        {
            escreva(num, " está entre 100 e 200.\n")
        }
        senao
        {
            escreva(num, " não está entre 100 e 200.\n")
        }
	}
}
