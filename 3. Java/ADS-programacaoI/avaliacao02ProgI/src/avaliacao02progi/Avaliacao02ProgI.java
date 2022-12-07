/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliacao02progi;

/**
 *
 * @author v3gc
 */
public class Avaliacao02ProgI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroAVerificar;
        int temDivisor;
        numeroAVerificar = 10;
        temDivisor = 0;
        
        for (int i = 1; i < 101; i++) {
            if ((numeroAVerificar % i) == 0) {
                temDivisor++;
            }
            
            if (temDivisor == 2) {
                System.out.println(numeroAVerificar + " ");
            }
            numeroAVerificar++;
        }
    }
    
}
