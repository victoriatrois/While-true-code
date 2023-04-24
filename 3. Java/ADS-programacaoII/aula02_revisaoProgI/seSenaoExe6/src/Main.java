import java.util.Scanner;
public class Main {
    static boolean ehPar (int numero) {
        boolean ehPar;
        if (numero == 0) {
            return true;
        } else if (numero == 1) {
            return false;
        } else if (numero < 0) {
            return ehPar(-numero);
        } else {
            return ehPar(numero - 2);
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorAConferir;
        String par;
        String impar;

        par = " é par ";
        impar = " é ímpar ";

        System.out.print("Digite o valor a conferir: ");
        valorAConferir = entrada.nextInt();

        if(valorAConferir < 0) {
            if (ehPar(valorAConferir)) {
                System.out.println(valorAConferir + par + "e negativo.");
            } else {
                System.out.println(valorAConferir + impar + "e negativo.");
            }
        } else if (valorAConferir == 0) {
            System.out.println("O valor é zero.");
        } else {
            if (ehPar(valorAConferir)) {
                System.out.println(valorAConferir + par + "e positivo.");
            } else {
                System.out.println(valorAConferir + impar + "e positivo.");
            }
        }
    }
}