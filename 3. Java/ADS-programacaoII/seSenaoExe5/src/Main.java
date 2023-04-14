import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] notas = new float[5];
        float media;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i] = entrada.nextFloat();
            notas[4] += notas[i];
        }

        media = notas[4]/4;

        if(media < 5) {
            System.out.println("Conceito D");
        } else if (media < 7 && media > 5) {
            System.out.println("Conceito C");
        } else if (media < 8.5 && media > 7) {
            System.out.println("Conceito B");
        } else {
            System.out.println("Conceito A");
        }
    }
}