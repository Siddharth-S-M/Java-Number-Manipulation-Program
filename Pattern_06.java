//			print a pattern

//			* * * * * 
//			* * * * 
//			* * * 
//			* * 
//			* 


package Patterns;

import java.util.Scanner;

public class Pattern_06 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		
		System.out.print("Enter the height of the pyramid : "); // Asking user to input 
		int r = scan.nextInt(); // Reading and storing input
		
		// Using a for loop to create the pattern
		System.out.println("Using for loop");
		for (int i = 1; i <= r; i++) // Loop for columns
		{
			for (int j = 1; j <= r - i + 1; j++) // Loop for rows
			{
				System.out.print("* "); // Printing the stars
			}
			System.out.println(""); // Moving to the next line after each row
		}
		System.out.println("\n");

		int i = 1;
		// Using a while loop to create the pattern
		System.out.println("Using while loop");
		while (i <= r) // Loop for columns
		{
			for (int j = 1; j <= r - i + 1; j++) // Loop for rows
			{
				System.out.print("* "); // Printing the stars
			}
			System.out.println(""); // Moving to the next line after each row
			i++; // Incrementing column counter
		}
		System.out.println("\n");

		int d = 1;
		// Using a do-while loop to create the pattern
		System.out.println("Using do-while loop");
		do
		{
			for (int j = 1; j <= r - d + 1; j++) // Loop for rows
			{
				System.out.print("* "); // Printing the stars
			}
			System.out.println(""); // Moving to the next line after each row
			d++; // Incrementing column counter
		}
		while (d <= r); // Loop condition for columns
		System.out.println("\n");
	}
}
