/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico04;

/**
 *
 * @author v3gc
 */
import java.util.Scanner;

public class TempoEmSegundos {
    public static void main (String[]args) {
        Scanner entrada = new Scanner(System.in);
        
        int horasPercorridas = entrada.nextInt();
        int minutosPercorridos = entrada.nextInt();
        int segundosPercorridos = entrada.nextInt();
        
        int totalDeHorasEmSegundos = horasPercorridas * 3600;
        int totalDeMinutosEmSegundos = minutosPercorridos * 60;
        
        int segundosTotais = totalDeHorasEmSegundos + totalDeMinutosEmSegundos + segundosPercorridos;
        
        System.out.print(segundosTotais);
    }
}
