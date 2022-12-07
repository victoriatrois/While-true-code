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

public class FahrenheitParaCelcius {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float temperaturaEmFahrenheit = entrada.nextFloat();
        float temperaturaEmCelcius = (temperaturaEmFahrenheit - 32) / 1.8f;
        
        System.out.printf("%.1f", temperaturaEmCelcius);
    }
}
