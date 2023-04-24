import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] times = new String[2];
        int[] gols = new int[2];

        for (int i = 0; i < times.length; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º time: ");
            times[i] = entrada.nextLine();
            System.out.print("Digite a pontuação do " + (i + 1) + "º time: ");
            gols[i] = entrada.nextInt();
            entrada.nextLine();
        }
        
        if (gols[0] == gols[1]) {
            System.out.println("EMPATE");
        } else if (gols[0] > gols[1]) {
            System.out.print("VENCEDOR: "+ times[0]);
        } else {
            System.out.print("VENCEDOR: " + times[1]);
        }
    }
}