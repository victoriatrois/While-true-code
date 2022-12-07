import java.util.Scanner;

public class MaiorMenorOuIguais {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int primeiroValor;
        int segundoValor;
        
        primeiroValor = entrada.nextInt();
        segundoValor = entrada.nextInt();
        
        if ((primeiroValor <= 0) || (segundoValor <= 0)) {
            System.out.print("inválido");
            
        } else {
        
            if (primeiroValor == segundoValor) {
                System.out.print("iguais");
                
            } else if (primeiroValor > segundoValor) {
                System.out.print("primeiro");
                
            } else {
                System.out.print("segundo");
            }
        }
    }
}