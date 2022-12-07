import java.util.Scanner;

public class MediaDeQuatroNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float primeiroValor, segundoValor, terceiroValor, quartoValor;
        
        primeiroValor = entrada.nextFloat();
        segundoValor = entrada.nextFloat();
        terceiroValor = entrada.nextFloat();
        quartoValor = entrada.nextFloat();
            
        float media = (primeiroValor + segundoValor + terceiroValor + quartoValor) / 4;
        
        System.out.print(media);
    }
}