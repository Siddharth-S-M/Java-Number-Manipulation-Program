//			print a pattern
//			 *********
//			  *     *
//			   *   *
//			    * *
//			     *
     
package Patterns;

import java.util.Scanner;

public class Pattern_17 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		
		System.out.print("Enter the height : "); // Asking user to input the number of rows
		int r = scan.nextInt(); // Reading and storing input
		
		System.out.println("Pattern using for loop");
		
		for(int i = 1; i <= r; i++) // Loop for iterating through rows
		{
			for(int j = 1; j <= i; j++) // Loop for printing spaces
			{
				System.out.print(" "); // Printing spaces
			}
			for(int j = 1; j <= 11 - (2 * i); j++) // Loop for printing stars
			{
				if (j == 1 || i == 1 || j == 11 - (2 * i)) 
				{
					// If it's the first column, first row, or last column, print an asterisk
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println(); // Moving to the next line after completing a row
		}
		System.out.println("\n");
	}
}
