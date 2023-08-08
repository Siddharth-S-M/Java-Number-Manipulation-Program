//		print a pattern
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
package Patterns;

import java.util.Scanner;

public class Pattern_03 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		System.out.print("Enter the size of square: "); // Asking user to input 
		int n = scan.nextInt(); // Reading and storing input
		
		// Using a for loop to create the pattern
		System.out.println("Using for loop");
		for (int i = 1; i <= n; i++) // Loop for rows
		{
			for (int j = 1; j <= n; j++) // Loop for columns
			{
				System.out.print("* "); // Printing an asterisk followed by a space
			}
			System.out.println(""); // Moving to the next line after each row
		}
		System.out.println("\n");

		int i = 1;
		// Using a while loop to create the pattern
		System.out.println("Using while loop");
		while (i <= n) // Loop for rows
		{
			for (int j = 1; j <= n; j++) // Loop for columns
			{
				System.out.print("* "); // Printing an asterisk followed by a space
			}
			System.out.println(""); // Moving to the next line after each row
			i++;
		}
		System.out.println("\n");
		
		int d = 1;
		// Using a do-while loop to create the pattern
		System.out.println("Using do-while loop");
		do
		{
			for (int j = 1; j <= n; j++) // Loop for columns
			{
				System.out.print("* "); // Printing an asterisk followed by a space
			}
			System.out.println(""); // Moving to the next line after each row
			d++;
		}
		while (d <= n); // Loop condition for rows
		System.out.println("\n");
	}
}
