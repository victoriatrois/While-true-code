package atividade01;

import java.util.Scanner;
import java.text.Normalizer;

/*
 * Ainda em relação aos eventos, o hotel oferece reserva de seu restaurante caso o contratante
 * necessite. O restaurante está disponível para reservas de segunda a sexta, das 7h às 23h e
 * aos sábados e domingos apenas das 7h às 15h.
 * 
 * Monte um algoritmo que receba o dia da semana (em texto) e a hora (número inteiro) e diga se
 * o restaurante está disponível ou indisponível - e, neste caso, receba ainda o nome da empresa
 * e mostre na tela a mensagem: "Restaurante reservado para (nome da empresa): (dia da semana) às
 * (horário)h.
 * 
 * 	Exemplo: 
 * 
 * @author v3gc
 */

public class CalcGarcons04 {
	
	public static String removeDiac(String s) {
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Para qual dia você precisa de uma reserva?");
		String dia = in.next();
		dia = removeDiac(dia.toLowerCase());
		
		System.out.println(dia + ", a qual horário você tem preferência?");
		int hora = in.nextInt();

		if (hora < 7 || hora > 23) {
			System.out.println("Restaurante indisponível.");
			System.out.println("Reservas disponíveis de segunda a sexta das 7h às 23h e sábados e domingos das 7h às 15h");

		} else if ((dia == "sabado" || dia == "sab" || dia == "domingo" || dia == "dom") && (hora <7 || hora > 15)) {
			System.out.println("Restaurante indisponível.");
			System.out.println("Aos sábados e domingos, reservas disponíveis das 7h às 15h");

		} else {
			System.out.println("Qual o nome da empresa?");
			String nomeEmpresa = in.next();

			System.out.println("Reserva efetuada com sucesso para " + dia + " às " + hora + "h para " + nomeEmpresa + ".");
		}
	}
}
