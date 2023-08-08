//			print a pattern
//			  * 
//			    * * 
//			      * * * 
//			        * * * * 
//			          * * * * * 


package Patterns;

import java.util.Scanner;

public class Pattern_08
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		
		System.out.print("Enter the height of the Right-Aligned Triangle : "); // Asking user to input 
		int r = scan.nextInt(); // Reading and storing input
		
		// Using a for loop to create the pattern
		System.out.println("Using for loop");
		for (int i = 1; i <= r; i++) // Loop for rows
		{
			for (int j = 1; j <= i + i; j++) // Loop for columns
			{
				if (j <= i)
				{
					System.out.print("  "); // Printing spaces for the left half of the pattern
				}
				else
				{
					System.out.print("* "); // Printing the stars for the right half of the pattern
				}
			}
			System.out.println(""); // Moving to the next line after each row
		}
		System.out.println("\n");

		int i = 1;
		// Using a while loop to create the pattern
		System.out.println("Using while loop");
		while (i <= r) // Loop for rows
		{
			for (int j = 1; j <= i + i; j++) // Loop for columns
			{
				if (j <= i)
				{
					System.out.print("  "); // Printing spaces for the left half of the pattern
				}
				else
				{
					System.out.print("* "); // Printing the stars for the right half of the pattern
				}
			}
			System.out.println(""); // Moving to the next line after each row
			i++; // Incrementing row counter
		}
		System.out.println("\n");

		int d = 1;
		// Using a do-while loop to create the pattern
		System.out.println("Using do-while loop");
		do
		{
			for (int j = 1; j <= d + d; j++) // Loop for columns
			{
				if (j <= d)
				{
					System.out.print("  "); // Printing spaces for the left half of the pattern
				}
				else
				{
					System.out.print("* "); // Printing the stars for the right half of the pattern
				}
			}
			System.out.println(""); // Moving to the next line after each row
			d++; // Incrementing row counter
		}
		while (d <= r); // Loop condition for rows
		System.out.println("\n");
	}
}
