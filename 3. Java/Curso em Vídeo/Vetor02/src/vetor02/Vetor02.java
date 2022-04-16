/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author v3gc
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mes [] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int totalDias [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int contador = 0; contador<mes.length; contador++){
            System.out.println(mes[contador] + " tem " + totalDias[contador] + " dias.");
        
        }
    }
    
}
