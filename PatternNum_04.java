//		print a pattern
//		1
//		12
//		123
//		1234
//		12345

package Patterns;

import java.util.Scanner;

public class PatternNum_04 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner object
		
		System.out.print("Enter the number of rows : "); // Asking the user for input 
		int r = scan.nextInt(); // Reading and storing the user input
		
		System.out.println("Using for loop");
		for (int i = 1; i <= r; i++) // Loop for rows
		{
			for (int j = 1; j <= i; j++) // Loop for columns
			{
				System.out.print(j); // Printing the current column number
			}
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
