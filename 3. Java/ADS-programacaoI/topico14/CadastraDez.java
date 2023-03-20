import java.util.Scanner;

public class CadastraDez {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        
        int[] valor = new int[10];
        int maisRepetido = 0;
        int frequencia = 0;
        
        // TODO: ler 10 valores
        for (int i = 0; i < valor.length; i++) { // 1 comando antes de entrar no for, que ocorre uma vez unica vez, 2 while dentro do for, 3 ultimo comando do bloco
            valor[i] = entrada.nextInt();
        // TODO: sair do laço ao ler zero
            if (valor[i] == 0) {
                i = valor.length; // escapa do primeiro for
            } else {
                for (int j = 0; j < i; j++) { // percorre os elementos já preenchidos para testar se o novo valor é válido
                    if (valor[i] == valor[j]) {
                        frequencia++;
                        
                        i--;
                        j = i; // escapa do segundo for
                    } 
                }
            }
        }
        
        for (int i = 0; i < valor.length; i++) {
            valor[i] = entrada.nextInt();
            if (valor[i] == 0) {
                i = 9;
            } 
        
            for (int j = 0; j < valor.length; j++) {
        // TODO: identificar o valor que repete mais
                if (valor[j] == valor[i]) {
                    frequencia++;
                    maisRepetido = valor[i];
                }
            }
        }
        // TODO: exibir 0 se nào houver repetido
        if (frequencia == 0) {
            System.out.print(frequencia);
        } else {
        // TODO: exibir o valor que mais aparece e o numero de ocorrências
            System.out.print(maisRepetido + frequencia);
            
        }
        
        
    }
}