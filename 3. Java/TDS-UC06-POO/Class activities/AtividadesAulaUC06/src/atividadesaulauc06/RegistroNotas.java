/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesaulauc06;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author v3gc
 */
public class RegistroNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float NOTA[][] = new float[4][3];
        byte L, C;
        //DecimalFormat padraoDecimal = new DecimalFormat("0.00");
        
        for (L = 0; L < 4; L++) {
            System.out.println();
            System.out.println();
            System.out.println("Alune " + (L + 1));
            System.out.println();
            for (C = 0; C < 3; C++) {
                System.out.print((C+1) + "ª nota: ");
                NOTA[L][C] = entrada.nextFloat();
                
            }
            
        }
        System.out.println();
        System.out.println("Alune\tNota1\tNota2\tNota3");
        System.out.println("-------------------------------");
        
        for (L = 0; L < 4; L++) {
            System.out.print((L + 1) + "-->\t");
            
            for (C = 0; C < 3; C++) {
                System.out.print((NOTA[L][C] + "\t"));
                
            }
            System.out.println();
            
        }
        System.out.println();
    }
}
