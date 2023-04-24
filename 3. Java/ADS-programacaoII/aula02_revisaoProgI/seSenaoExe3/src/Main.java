import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float saldo;

        System.out.print("Digite a quantia disponível na sua carteira/conta corrente: ");
        saldo = entrada.nextFloat();

        if (saldo > 29) {
            System.out.println("Você pode ir ao cinema.");
        } else {
            System.out.println("Melhor ficar em casa assistindo TV.");
        }
    }
}