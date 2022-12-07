/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progiavaliacaoi;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class ProgIAvaliacaoI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int diaPrimeiraData;
        int mesPrimeiraData;
        int diaSegundaData;
        int mesSegundaData;
        
        diaPrimeiraData = entrada.nextInt();
        mesPrimeiraData = entrada.nextInt();
        diaSegundaData = entrada.nextInt();
        mesSegundaData = entrada.nextInt();
        
        if (mesPrimeiraData == mesSegundaData) {
            int mes = mesPrimeiraData;
            if (diaPrimeiraData < diaSegundaData) {
                System.out.println(diaPrimeiraData + "/" + mes + diaSegundaData + "/" + mes);
            } else {
                System.out.println(diaSegundaData + "/" + mes + diaPrimeiraData + "/" + mes);
            }
        } else if (mesPrimeiraData < mesSegundaData) {
            if (diaPrimeiraData < diaSegundaData) {
                System.out.println(diaPrimeiraData + "/" + mesPrimeiraData + diaSegundaData + "/" + mesSegundaData);
            } else {
                System.out.println(diaSegundaData + "/" + mesSegundaData + diaPrimeiraData + "/" + mesPrimeiraData);
            }
        } else {
            System.out.println(diaSegundaData + "/" + mesSegundaData + diaPrimeiraData + "/" + mesPrimeiraData);
        }
    }
    
}
