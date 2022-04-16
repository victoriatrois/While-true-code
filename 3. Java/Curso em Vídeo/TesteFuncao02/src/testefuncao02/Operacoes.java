/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author v3gc
 */
public class Operacoes {
    public static String contador(int inicio, int fim){
        String s = "";
        
        for(int c= inicio; c<= fim; c++){
            s += c + " ";
        }
        return s;
    }
}
