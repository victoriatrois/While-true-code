
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author v3gc
 */
public class exercise02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the quantity of numbers you would like to sum: ");
        int arraySize = in.nextInt();
        in.nextLine();
        
        int numbers[] = new int[arraySize];
        int sum = 0;
        
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = in.nextInt();
            
        }
        
        for (int number : numbers) { 
            sum += number;
        }
        System.out.println("The sum of elements is " + sum + ".");
    }
}
