//			print a pattern
//			     *
//			    * *
//			   *   *
//			  *     *
//			 *       *
//			  *     *
//			   *   *
//			    * *
//			     *
package Patterns;

import java.util.Scanner;

public class Pattern_16 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class

		System.out.print("Enter the height : "); // Asking user to input the number of rows
		int r = scan.nextInt(); // Reading and storing input

		System.out.println("Pattern using for loop");

		// Loop for upper half of the pattern
		for(int i = 1; i <= r; i++) // Loop for iterating through rows
		{
			for(int j = 1; j <= 5 - i + 1; j++) // Loop for printing spaces
			{
				System.out.print(" "); // Printing spaces
			}
			for(int j = 1; j <= (2 * i) - 1; j++) // Loop for printing stars
			{
				if (j == 1 || j == (2 * i) - 1) 
				{
					// If it's the first column or last column, print an asterisk
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

		// Loop for lower half of the pattern
		for(int i = 2; i <= r; i++) // Loop for iterating through rows
		{
			for(int j = 1; j <= i; j++) // Loop for printing spaces
			{
				System.out.print(" "); // Printing spaces
			}
			for(int j = 1; j <= 11 - (2 * i); j++) // Loop for printing stars
			{
				if (j == 1 || i == r || j == 11 - (2 * i)) 
				{
					// If it's the first column, last row, or last column, print an asterisk
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
		System.out.println("\n");
		System.out.println("");
	}
}
