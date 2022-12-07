import java.util.Scanner;

public class ParOuImpar {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valorATestar;
        int moduloPorDois;
        
        valorATestar = entrada.nextInt();
        moduloPorDois = valorATestar%2;
        
        if (moduloPorDois == 0) {
            System.out.print("par");
        } else {
            System.out.print("impar");
        }
    }
}