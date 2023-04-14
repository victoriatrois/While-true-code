import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada;
        int[] lista;

        entrada = new Scanner(System.in);
        lista = new int[11];

        for (int i = 0; i < lista.length - 1; i++) {
            System.out.print("Digite o " + (i + 1) + "º número:");
            lista[i] = entrada.nextInt();

            if (lista[i] < 40) {
                lista[10] += lista[i];
            }
        }
        System.out.print("O soma dos números menores que 40 é de: " + lista[10]);
    }
}