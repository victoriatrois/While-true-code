import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorAMultiplicar;


        System.out.print("Digite o valor que deseja identificar múltiplos: ");
        valorAMultiplicar = entrada.nextInt();

        for (int i = 1; i <= 50; i++) {
            if ((i % valorAMultiplicar) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}