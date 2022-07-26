/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a Java program to sort a numeric array and a String array.
 * 
 * @author v3gc
 */
public class Exercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> numericList = new ArrayList<>();
        
        System.out.println("Enter as many integer numbers as you want. If you wish to stop, enter something other than an integer.");
        
        while (input.hasNextInt()) {
            int no = input.nextInt();
            numericList.add(no);

        }
        
        System.out.println("Original list: " + numericList + ".");
        
        Collections.sort(numericList);
        
        System.out.println("After sorting: " + numericList + ".");
        
        
        System.out.println("Now let's do the same with Strings. To stop entering, write \"stop\".");
        
        ArrayList<String> stringList = new ArrayList<>();
        
        while (input.hasNextLine()) {
            String str = input.nextLine();
            if (str.equals("stop") || str.equals("STOP")){
                break;
            } else {
                stringList.add(str);
            }
            
        }
        
        System.out.println("Original list: " + stringList + ".");
        
        Collections.sort(stringList);
        
        System.out.println("After sorting: " + stringList + ".");
        
    }
    
}
