import java.util.Scanner;

public class DuracaoEmHoras {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int horaInicial;
        int horaFinal;
        int duracaoTotal;
        
        duracaoTotal = 0;
        
        horaInicial = entrada.nextInt();
        horaFinal = entrada.nextInt();
        
        if (horaInicial < 0 || horaFinal < 0) {
            System.out.print("-");
        } else {
            if (horaFinal == 0) {
                horaFinal +=24;
                duracaoTotal = horaFinal - horaInicial;
                
            } else if (horaInicial == horaFinal) {
                duracaoTotal += 24;
            } else if (horaInicial == 0) {
                duracaoTotal += horaFinal;
            } else if (horaInicial < horaFinal) {
                duracaoTotal = horaFinal - horaInicial;
            } else {
                duracaoTotal = 24 - horaInicial + horaFinal;
            }
        }
        System.out.print(duracaoTotal);
    }
}