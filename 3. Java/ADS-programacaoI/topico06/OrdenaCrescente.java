import java.util.Scanner;

public class OrdenaCrescente {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int primeiroValor;
        int segundoValor;
        int terceiroValor;

        int menorValor;
        int valorIntermediario;
        int maiorValor;

        primeiroValor = entrada.nextInt();
        segundoValor = entrada.nextInt();
        terceiroValor = entrada.nextInt();

        if (primeiroValor < 1 || segundoValor < 1 || terceiroValor < 1) {
            System.out.print("-");

        } else {
            if (primeiroValor > segundoValor) {
                if (segundoValor > terceiroValor) {
                    maiorValor = primeiroValor;
                    valorIntermediario = segundoValor;
                    menorValor = terceiroValor;

                } else {
                    if (primeiroValor > terceiroValor) {
                        maiorValor = primeiroValor;
                        valorIntermediario = terceiroValor;
                        menorValor = segundoValor;

                    } else {
                        maiorValor = terceiroValor;
                        valorIntermediario = primeiroValor;
                        menorValor = segundoValor;
                    }
                }

            } else {
                if (segundoValor > terceiroValor) {
                    if (primeiroValor > terceiroValor) {
                        maiorValor = segundoValor;
                        valorIntermediario = primeiroValor;
                        menorValor = terceiroValor;

                    } else {
                        maiorValor = segundoValor;
                        valorIntermediario = terceiroValor;
                        menorValor = primeiroValor;
                    }

                } else {
                    maiorValor = terceiroValor;
                    valorIntermediario = segundoValor;
                    menorValor = primeiroValor;
                }
            }

            System.out.print(menorValor + " " + valorIntermediario + " " + maiorValor);

        }
    }
}