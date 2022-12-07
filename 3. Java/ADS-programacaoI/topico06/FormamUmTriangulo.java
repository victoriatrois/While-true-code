import java.util.Scanner;

public class FormamUmTriangulo { //public class
    public static void main (String[] args) { // main
        Scanner entrada = new Scanner(System.in);
        // a soma de dois lados é sempre menor que o terceiro lado;
        // soma dos lados menores e compará-la com o lado maior
        // um triângulo cuja soma dos lados menores é igual à medida do lado maior também não pode existir.
        
        int primeiraReta;
        int segundaReta;
        int terceiraReta;
        
        primeiraReta = entrada.nextInt();
        segundaReta = entrada.nextInt();
        terceiraReta = entrada.nextInt();
        
        int somaDeAB = primeiraReta + segundaReta;
        int somaDeBC = segundaReta + terceiraReta;
        int somaDeCA = terceiraReta + primeiraReta;
        
        if (primeiraReta < 1 || segundaReta < 1 || terceiraReta < 1) {
            System.out.print("inválido");
            
        } else {
            if (primeiraReta < somaDeBC && segundaReta < somaDeCA && terceiraReta < somaDeAB) {
                System.out.print("sim");
            } else {
                System.out.print("não");
            }
        }
    }
}