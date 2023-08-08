//			print a pattern
//			* * * 
//			* * * 
//			* * * 
//			* * * 
//			* * * 

package Patterns;

import java.util.Scanner;

public class pattern_04
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		
		System.out.print("Enter the number of hight: "); // Asking user to input hight 
		int r = scan.nextInt(); // Reading and storing input
		
		System.out.print("Enter the number of width: "); // Asking user to input width
		int c = scan.nextInt(); // Reading and storing input
		
		// Using a for loop to create the pattern
		System.out.println("Using for loop");
		for (int i = 1; i <= r; i++) // Loop for rows
		{
			for (int j = 1; j <= c; j++) // Loop for columns
			{
				System.out.print("* "); // Printing an asterisk followed by a space
			}
			System.out.println(""); // Moving to the next line after each row
		}
		System.out.println("\n");

		int i = 1;
		// Using a while loop to create the pattern
		System.out.println("Using while loop");
		while (i <= r) // Loop for rows
		{
			for (int j = 1; j <= c; j++) // Loop for columns
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
			for (int j = 1; j <= c; j++) // Loop for columns
			{
				System.out.print("* "); // Printing an asterisk followed by a space
			}
			System.out.println(""); // Moving to the next line after each row
			d++;
		}
		while (d <= r); // Loop condition for rows
		System.out.println("\n");
	}
}
