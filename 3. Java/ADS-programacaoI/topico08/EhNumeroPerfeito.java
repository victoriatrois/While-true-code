import java.util.Scanner;

public class EhNumeroPerfeito {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeroATestar;
        int soma;
        
        numeroATestar = entrada.nextInt();
        soma = 0;
        
        for(int i = 1; i <= numeroATestar / 2; i++){
            if(numeroATestar % i == 0) {
                soma += i;
            }
        }
        if (soma == numeroATestar) {
            System.out.print("sim");
        } else {
            System.out.print("não");
        }
    }
}