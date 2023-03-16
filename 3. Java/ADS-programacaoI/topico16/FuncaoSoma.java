import java.util.Scanner;

public class FuncaoSoma {
    
    public static int soma(int primeiraParcela, int segundaParcela) {
        int total = 0;
        
        total = primeiraParcela + segundaParcela;
        
        return total;
    }
    
    public static int leitor(int valor) {
        valor = valor;
        
        return valor;
    }
    
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiroValor = 0;
        int segundoValor = 0;
        
        primeiroValor = leitor(entrada.nextInt());
        segundoValor = leitor(entrada.nextInt());
        
        System.out.println(soma(primeiroValor, segundoValor));
    }
}