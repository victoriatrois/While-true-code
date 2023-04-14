import java.util.Scanner;

public class SerieFibonacci {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;
        int numeroAnterior;
        int fibonacci;
        int proximoNumero;
        
        numeroAnterior = 0;
        fibonacci = 0;
        proximoNumero = 1;
        
        for (contador = 0; contador < 10; contador++) {
            System.out.print (numeroAnterior + " ");
            fibonacci += 1;

            fibonacci = numeroAnterior + proximoNumero;
            numeroAnterior = proximoNumero;
            proximoNumero = fibonacci;
        }
    }
}