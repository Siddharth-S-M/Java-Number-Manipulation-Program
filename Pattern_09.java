//			print a pattern
//			        * 
//			      * * 
//			    * * * 
//			  * * * * 
//			* * * * * 


package Patterns;

import java.util.Scanner;

public class Pattern_09 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		
		System.out.print("Enter the height of the pyramid : "); // Asking user to input 
		int r = scan.nextInt(); // Reading and storing input
		
		// Using a for loop to create the pattern
		System.out.println("Using for loop");
		for (int i = r; i >= 1; i--) // Loop for rows (from top to bottom)
		{
			for (int j = 1; j < i; j++) // Loop for printing leading spaces
			{
				System.out.print("  "); // Printing two spaces
			}
			for (int j = 0; j <= r - i; j++) // Loop for printing asterisks
			{
				System.out.print("* "); // Printing the stars with a space after each
			}
			System.out.println(""); // Moving to the next line after each row
		}
		System.out.println("\n");
	}
}
