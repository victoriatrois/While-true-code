programa {
	funcao inicio() {
		//Crie um algoritmo que calcule a área da circunferência a partir do raio informado pelo usuário.
		real raio, circunf
		const real PI = 3.14159265359
		
		escreva("Qual o raio do círculo?\n*use o formato 0.15 (15cm)\n*meça o raio de um círculo começando pelo seu meio e traçando uma linha reta até a sua extremidade\n*ou, trace uma linha reta de uma extremidade a outra meça-a e divida o valor pela metade \n")
		leia(raio)
		limpa()
		
		circunf = raio/(2*PI)
		
		escreva("A circunferência do de um círculo com raio de ", raio, " é de ", circunf, ".")
	}
}
