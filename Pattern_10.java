//			print a pattern
//		     *****
//		    ****
//		   ***
//		  **
//		 *


package Patterns;

import java.util.Scanner;

public class Pattern_10 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		
		System.out.print("Enter the height : "); // Asking user to input 
		int r = scan.nextInt(); // Reading and storing input
		
		// Using a for loop to create the pattern
		System.out.println("Using for loop");
		for (int i = 1; i <= r; i++) // Loop for rows
		{
			for (int j = 1; j <= 5 - i + 1; j++) // Loop for leading spaces
			{
				System.out.print(" "); // Printing a space
			}
			for (int j = 1; j <= 5 - i + 1; j++) // Loop for asterisks
			{
				System.out.print("*"); // Printing an asterisk
			}
			System.out.println(""); // Moving to the next line after each row
		}
		System.out.println("\n");
	}
}
