/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesaulauc06;

import java.util.Scanner;

/**
 * Sabendo que a conversão de uma temperatura (T) de Celsius para Farenheit é calculada por (TºC x 1,8) + 32
 * e que a conversão para Kelvin se dá por TºC + 273,15, monte a aplicação Java que converta graus Celsius em Farenheit e Kelvin.
 * @author v3gc
 */
public class ConversorCeciusFarenheitKelvin {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celcius: ");
        float temperaturaCelcius = entrada.nextFloat();
        
        float temperaturaFarenheit = (temperaturaCelcius * 1.8f + 32.0f);
        float temperaturaKelvin = temperaturaCelcius + 273.15f;
        
        System.out.println(temperaturaCelcius + "ºC são " + temperaturaFarenheit + "ºF e " + temperaturaKelvin + "ºK.");
        
    }
}
