import java.util.Scanner;

public class EhMaior {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valorAComparar;
        
        valorAComparar = entrada.nextInt();
        
        if (valorAComparar > 100) {
            System.out.print("sim");
            
        } else {
            System.out.print("não");
        }
    }
}