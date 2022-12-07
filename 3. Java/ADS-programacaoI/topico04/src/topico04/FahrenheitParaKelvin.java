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

public class FahrenheitParaKelvin {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float temperaturaEmFahrenheit = entrada.nextFloat();
        float temperaturaEmKelvin = (temperaturaEmFahrenheit + 459.4f) * (5/9f);
        
        System.out.printf("%.1f", temperaturaEmKelvin);
    }
}
