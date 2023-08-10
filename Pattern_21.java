//			print a pattern
//			*****
//			*  *
//			* *
//			**
//			*

package Patterns;

import java.util.Scanner;

public class Pattern_21 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		
		System.out.print("Enter the number of columns: "); // Asking user to input 
		int r = scan.nextInt(); // Reading and storing input
		
		System.out.println("Using for loop");
		for (int i = 1; i <= r; i++) // Loop for columns
		{
			for (int j = 1; j <= r - i + 1; j++) // Loop for rows
			{
				if (j == 1 || i == 1 || j == r - i + 1) 
				{
					// Print an asterisk for the first and last column, and the first row
					System.out.print("*");
				}
				else 
				{
					System.out.print(" "); // Print a space for other positions
				}
			}
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
