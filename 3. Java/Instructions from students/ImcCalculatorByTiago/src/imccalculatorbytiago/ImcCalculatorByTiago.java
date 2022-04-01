/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imccalculatorbytiago;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class ImcCalculatorByTiago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a scanner:
        Scanner read = new Scanner(System.in);
        
        //declaring variables
        double weight, height, result;
        
        //get entry from user
        System.out.println("What's your weight? ");
        weight = read.nextDouble();
        
        System.out.println("How tall are you? ");
        height = read.nextDouble();
        
        //setting the formula for the result:
        result = weight/Math.pow(height, 2);
        
        //printing the user's BMI:
        System.out.println(result);
    }
    
}
