programa {
	funcao inicio() {
	    /*Faça um algoritmo que receba o valor do salário mínimo, o número de horas trabalhadas, o número de dependentes do funcionário
	    e a quantidade horas extras trabalhadas. Calcule e mostre o salário a receber do funcionário seguindo as regras a seguir:
	        * O valor da hora trabalhada é igual a 1/5 do salário mínimo.
	        * O salário do mês é igual ao número de horas trabalhadas vezes o valor da hora trabalhada.
	        * Para cada dependente, acrescentar 32 reais.
	        * Para cada hora extra trabalhada, calcular o valor da hora trabalhada acrescida de 50%.
	        * O salário bruto é igual ao salário do mês mais o valor dos dependentes e mais o valor das horas extras.*/
        
        real salario_min, horas_trabalhadas, horas_extras, valor_hora, salario
        inteiro dependentes
        
        escreva("Qual o valor do salário mínimo?\n")
        leia(salario_min)
        limpa()
        
        escreva("Qual a quantidade de horas trabalhadas no mês?\n")
        leia(horas_trabalhadas)
        limpa()
        
        escreva("Qual a quantidade de horas extras mensais?\n")
        leia(horas_extras)
        limpa()
        
        escreva("Quantos dependentes o funcionário tem?\n")
        leia(dependentes)
        limpa()
        
        valor_hora = salario_min/5
        salario = horas_trabalhadas*valor_hora + (32*dependentes) + (horas_extras/0.5)
        
        escreva("Total a ser pago: ", salario)
        }
	}