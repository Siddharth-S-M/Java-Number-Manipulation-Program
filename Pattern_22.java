//			print a pattern
//			  *
//			    **
//			      * *
//			        *  *
//			          *****

package Patterns;

import java.util.Scanner;

public class Pattern_22 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class

		System.out.print("Enter the number of rows: "); // Asking user to input 
		int r = scan.nextInt(); // Reading and storing input

		System.out.println("Using for loop");
		for (int i = 1; i <= r; i++) // Loop for rows
		{
			for (int j = 1; j <= i + i; j++) // Loop for columns
			{
				if (j <= i) // Print spaces for the first part of the row
				{
					System.out.print("  ");
				}
				else // Print asterisks and spaces for the second part of the row
				{
					if (j == i + 1 || i == r || j == i + i) 
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
