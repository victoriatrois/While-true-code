programa {
	funcao inicio() {
	    /*Desenvolva um algoritmo em que é solicitado ao usuário digitar em qual país ele nasceu. Caso o usuário digite “Brasil” ou “brasil”, exibirá na tela
	    a seguinte mensagem: “Você é brasileiro”.*/
        
        cadeia pais = ""
        
        escreva("Digite seu país de nascimento:\n")
        leia(pais)
        
        se (pais == "Brasil" ou pais == "BRASIL" ou pais == "brasil")
        {
            escreva("Você é brasileire!\n")
        }
        senao
        {
            escreva("Você não é do Brasil.")
        }
        
	}
}
