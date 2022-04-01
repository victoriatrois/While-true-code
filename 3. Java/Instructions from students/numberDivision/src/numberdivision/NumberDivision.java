/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberdivision;

import java.util.Scanner;

/**
 *
 * @author v3gc
 */
public class NumberDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a scanner object to enter data:
        Scanner input = new Scanner (System.in);
        
        //print message to insert the first value:
        System.out.println("enter the dividend value:");
        
        //store the input:
        float dividend = input.nextInt();
        
        //print the message for the second value:
        System.out.println("enter the divisor value:");
        
        //store the input:
        float divisor = input.nextInt(); //write "double divisor __equals to__ ..."
        
            //verify if the divisor value is equal to zero:
            if(divisor == 0){ // if divisor is equals to zero
                //print the value minus one if the divisor __is equal to__ zero:
                System.out.println("-1");
            }
            //verify if the result of the division is negative:
            else if(dividend/divisor < 0){
                //print the value zero if the result of the division is negative:
                System.out.println("retrieved value: 0");
            }
            else{
                //if a divisor is not zero and the result is not negative, print the result of the division:
                System.out.println("retrieved value: " + dividend/divisor); //dividend divided by divisor
            }
    }
}