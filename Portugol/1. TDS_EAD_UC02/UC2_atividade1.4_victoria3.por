programa {
	funcao inicio() {
		
		cadeia dia, empresa
		inteiro hora
		
		escreva("Para qual dia você precisa de uma reserva?\n")
		leia(dia)
		
		escreva(dia, ", a qual horário você tem preferência?\n")
		leia(hora)
		limpa()
		
		se(hora <7 ou hora > 23){
		    escreva("Restaurante indisponível.\nReservas disponíveis de segunda a sexta das 7h às 23h e sábados e domingos das 7h às 15h.")
		    escreva(dia, ", a qual horário você tem preferência?\n")
		    leia(hora)
		    limpa()
		    
		}senao se((dia == "Sábado" ou dia == "Sabado" ou dia == "SABADO" ou dia == "SÁBADO" ou dia == "SAB" ou dia == "SÁB" ou dia == "sabado" ou dia == "sábado" ou dia == "Domingo" ou dia == "DOMINGO" ou dia == "domingo" ou dia == "dom" ou dia == "DOM" ou dia == "Dom") e (hora < 7 ou hora > 15)){
		     escreva("Restaurante indisponível.\nReservas disponíveis de segunda a sexta das 7h às 23h e sábados e domingos das 7h às 15h.")
		     escreva(dia, ", a qual horário você tem preferência?\n")
		     leia(hora)
		     limpa()
		}senao{
		    escreva("Qual o nome da sua empresa?\n")
		    leia(empresa)
		    limpa()
		    
	    	escreva("Reserva efetuada com sucesso para ", dia, " às ", hora, "h para ", empresa, ".")
		}
	}
}