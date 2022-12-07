import java.util.Scanner;

public class CalculadoraDuracaoPartida {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int horaInicial;
        int minutoInicial;
        int horaFinal;
        int minutoFinal;
        
        int tempoInicialEmMinutos;
        int tempoFinalEmMinutos;
        
        int horasTotais;
        int minutosTotais;
        
        int duracaoEmMinutos;
        int duracaoTotal;
        
        minutosTotais = 0;
        duracaoEmMinutos = 0;
        duracaoTotal = 0;
        
        horaInicial = entrada.nextInt();
        minutoInicial = entrada.nextInt();
        horaFinal = entrada.nextInt();
        minutoFinal = entrada.nextInt();
        
        tempoInicialEmMinutos = horaInicial * 60 + minutoInicial;
        tempoFinalEmMinutos = horaFinal * 60 + minutoFinal;
        
        if ((horaInicial > 24 || horaInicial < 0) || (horaFinal > 24 || horaFinal < 0) || (minutoFinal > 60 || minutoFinal < 0) || (minutoInicial > 60 || minutoInicial < 0)) {
            System.out.print("-");

        } else {
            if (tempoInicialEmMinutos < tempoFinalEmMinutos) {
            duracaoEmMinutos = tempoFinalEmMinutos - tempoInicialEmMinutos;

            } else {
                duracaoEmMinutos = (24 * 60 - tempoInicialEmMinutos) + tempoFinalEmMinutos;
            }
        }
        horasTotais = duracaoEmMinutos / 60;
        minutosTotais = duracaoEmMinutos % 60;
        
        System.out.printf("%d:%02d", horasTotais, minutosTotais);
    }
}