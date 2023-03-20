import java.util.Scanner;


public class MaiorEMenorNotas{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double[] nota = new double [10];
        
        int maior;
        int menor;
        int matriculaMaiorNota;
        int matriculaMenorNota;
        
        matriculaMaiorNota = 0;
        matriculaMenorNota = 0;
        
        for (int i = 0; i < 10; i++){
            nota[i] = teclado.nextDouble();
        }
        
        maior = 0;
        menor = 0;
        
        for(int i = 1; i < 10; i++){
            if(nota[i] > nota[maior]){
                maior = i;
            }
            else if (nota[i] < nota[menor]){
                menor = i;
            }
        }
                matriculaMaiorNota = maior + 1;
                matriculaMenorNota = menor + 1;
        
        System.out.println(matriculaMenorNota + " " + nota[menor] + " " + matriculaMaiorNota + " " + nota[maior]);
    }
}