import java.util.Scanner;

public class contabilizaGraos {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tipoDeGrao;
        int quantidadeDeGraos;
        int totalDeTrigo;
        int totalDeArroz;
        int totalDeCevada;
        int totalDeMilho;
        int totalDeGraos;
        double percentualDeTrigo;
        double percentualDeArroz;
        double percentualDeCevada;
        double percentualDeMilho;
        
        tipoDeGrao = 1;
        quantidadeDeGraos =0;
        totalDeTrigo = 0;
        totalDeArroz = 0;
        totalDeCevada = 0;
        totalDeMilho = 0;
        totalDeGraos = 0;
        
        while (tipoDeGrao != 0 ) {
            tipoDeGrao = entrada.nextInt();
            if (tipoDeGrao < 0 || tipoDeGrao > 4) {
                System.out.print("Inválido.");
            } else if (tipoDeGrao == 1) {
                quantidadeDeGraos = entrada.nextInt();
                totalDeTrigo += quantidadeDeGraos;
            } else if (tipoDeGrao == 2) {
                quantidadeDeGraos = entrada.nextInt();
                totalDeArroz += quantidadeDeGraos;
            } else if (tipoDeGrao == 3) {
                quantidadeDeGraos = entrada.nextInt();
                totalDeCevada += quantidadeDeGraos;
            } else if (tipoDeGrao == 4) {
                quantidadeDeGraos = entrada.nextInt();
                totalDeMilho += quantidadeDeGraos;
            } else {
                break;
            }
        }
        totalDeGraos = totalDeTrigo + totalDeArroz + totalDeCevada + totalDeMilho;
        percentualDeTrigo = (100*totalDeTrigo)/totalDeGraos;
        percentualDeArroz = (100*totalDeArroz)/totalDeGraos; 
        percentualDeCevada = (100*totalDeCevada)/totalDeGraos;
        percentualDeMilho = (100*totalDeMilho)/totalDeGraos;
        
        System.out.printf("1 %d %.2f %n", totalDeTrigo, percentualDeTrigo);
        System.out.printf("2 %d %.2f %n", totalDeArroz, percentualDeArroz);
        System.out.printf("3 %d %.2f %n", totalDeCevada, percentualDeCevada);
        System.out.printf("4 %d %.2f %n", totalDeMilho, percentualDeMilho);
    }
}