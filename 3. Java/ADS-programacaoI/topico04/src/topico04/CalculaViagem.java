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

public class CalculaViagem {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float KmPorLitro = entrada.nextFloat();
        float valorPorLitroDeGasolina = entrada.nextFloat();
        float distanciaPercorrida = entrada.nextFloat();
        int totalDePedagios = entrada.nextInt();
        float precoPorPedagio = entrada.nextFloat();
        
        float gastoComGasolina = ((distanciaPercorrida / KmPorLitro) * valorPorLitroDeGasolina);
        float gastoComPedagios = (float)totalDePedagios * precoPorPedagio;
        float gastosTotais = gastoComGasolina + gastoComPedagios;
        
        System.out.printf("%.2f", gastosTotais);
    }
}
