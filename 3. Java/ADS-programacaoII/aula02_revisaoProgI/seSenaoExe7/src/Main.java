import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorAConferir;

        System.out.print("Digite o valor que deseja conferir: ");
        valorAConferir = entrada.nextInt();

        if(valorAConferir > 4 && valorAConferir < 101) {
            System.out.println("O número informado está entre 5 e 100.");
        } else {
            System.out.println("O número informado não está entre 5 e 100.");
        }
    }
}