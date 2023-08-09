//			print a pattern
//			
//			*****
//			*   *
//			*   *
//			*   *
//			*****

package Patterns;

import java.util.Scanner;

public class Pattern_14 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); // Creating a scanner class
        
        System.out.print("Enter the height : "); // Asking user to input the number of columns
        int n = scan.nextInt(); // Reading and storing input
        
        System.out.println("Pattern using for loop");
        for (int i = 0; i < n; i++) // Loop for iterating through rows
        {
            for (int j = 0; j < n; j++) // Loop for iterating through columns
            {        
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) 
                {
                    // If it's the first row, first column, last row, or last column, print an asterisk
                    System.out.print("*");
                }
                else 
                {
                    // Otherwise, print a space
                    System.out.print(" ");
                }
            }
            System.out.println(); // Moving to the next line after completing a row
        }
    }
}
