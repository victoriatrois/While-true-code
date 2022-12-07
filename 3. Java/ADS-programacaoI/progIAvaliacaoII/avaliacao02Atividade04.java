public class avaliacao02Atividade04 {
    public static void main(String[] args) {
        int numeroAVerificar;
        int divisor;
        int temDivisor;
        
        for (numeroAVerificar = 10; numeroAVerificar < 101; numeroAVerificar++) { // aumenta o valor a ser testado
            temDivisor = 0;
            for (divisor = 1; divisor < 101; divisor++) { // aumenta o valor da variável teste
                if ((numeroAVerificar % divisor) == 0) {
                    temDivisor++;
                }
            }
            if (temDivisor == 2) {
                System.out.println(numeroAVerificar);
            }
            temDivisor = 0;
        }
    }
}