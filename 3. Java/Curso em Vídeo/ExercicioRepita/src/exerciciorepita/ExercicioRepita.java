/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author v3gc
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, soma=0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br>(digite <em>zero</em> para interromper)</html>"));
            soma += numero;
        } while(numero != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final<br>" + "<br>A soma dos valores é: " + soma + ". </html>");
    } 
    
}
