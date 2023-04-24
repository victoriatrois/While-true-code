import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner entrada;
        int[] idade;
        
        entrada = new Scanner(System.in);
        idade = new int[5];

        for (int i = 0; i < idade.length; i++) {
            idade[i] = entrada.nextInt();

            while (idade[i] < 0 || idade[i] > 120) {
                System.out.println("Digite um número MAIOR que zero e menor que 120.");
                entrada.nextInt();
            }
            if (idade[i] < 18) {
                System.out.println("menor de idade.");
            } else {
                System.out.println("MAIOR de idade.");
            }
        }
    }
}