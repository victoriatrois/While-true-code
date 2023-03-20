import java.util.Scanner;

public class EstahAcimaDaMedia {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int totalDeAlunos;
        int alunosAcimaDaMedia;
        float notaAcumulada;
        float media;
        float percentualAcimaDaMedia;
        
        totalDeAlunos = 0;
        notaAcumulada = 0;
        alunosAcimaDaMedia = 0;
        media = 0;
        percentualAcimaDaMedia = 0.0f;
        
        totalDeAlunos = entrada.nextInt();
        float[] nota = new float[totalDeAlunos];
        
        for (int i = 0; i < totalDeAlunos; i++) {
            nota[i] = entrada.nextFloat();
            notaAcumulada += nota[i];
        }
        
        media = notaAcumulada / totalDeAlunos;
        System.out.println("media" + media);

        for (int i = 0; i < totalDeAlunos; i++) {
            if (nota[i] > media) {
                alunosAcimaDaMedia++;
            }
        }
        System.out.println("alunosAcimaDaMedia: " + alunosAcimaDaMedia);
        
        percentualAcimaDaMedia = (100*alunosAcimaDaMedia) / (float)totalDeAlunos;
        
        System.out.printf("%.1f%%", percentualAcimaDaMedia);
        
    }
}