import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valorDaMulta;
        int pontosNaCarteira;

        System.out.print("Digite o valor da multa que você recebeu: ");
        valorDaMulta = entrada.nextFloat();

        System.out.print("Digite quantos pontos você já tem vinculados à sua carteira: ");
        pontosNaCarteira = entrada.nextInt();

        if (pontosNaCarteira > 10) {
            valorDaMulta += valorDaMulta * 0.15f;
        }

        System.out.printf("Voce devera pagar um total de R$%.2f reais", valorDaMulta);

    }
}