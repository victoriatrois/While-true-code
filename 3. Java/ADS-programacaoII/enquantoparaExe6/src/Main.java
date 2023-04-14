import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada;
        int[] lista;
        int contador;

        entrada = new Scanner(System.in);
        lista = new int[10];
        contador = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            lista[i] = entrada.nextInt();

            if(lista[i] < 0) {
                contador++;
            }
        }
        System.out.println(contador + " números são NEGATIVOS.");
    }
}