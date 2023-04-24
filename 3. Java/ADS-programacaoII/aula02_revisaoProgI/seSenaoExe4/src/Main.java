import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float consumoEmQuilowhats;
        float limite;
        float taxaQuilowhatHora;
        float multa;
        float subtotal;
        float valorTotal;

        limite = 100;
        taxaQuilowhatHora = 1.5f;
        multa = 0;

        System.out.print("Digite o seu consumo total em quilowhats: ");
        consumoEmQuilowhats = entrada.nextFloat();

        subtotal = consumoEmQuilowhats * taxaQuilowhatHora;

        if (consumoEmQuilowhats > limite) {
            multa = subtotal * 0.1f;
            valorTotal = multa + subtotal;
        } else {
            valorTotal = subtotal;
        }

        System.out.printf("Valor total: %.2f", valorTotal);
    }
}