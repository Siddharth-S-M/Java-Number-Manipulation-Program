//			print a pattern
//			 1 
//			 2  3 
//			 4  5  6 
//			 7  8  9 10 
//		    11 12 13 14 15 

package Patterns;

import java.util.Scanner;

public class PatternNum_09 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		
		System.out.print("Enter the number of rows: "); // Asking user to input 
		int r = scan.nextInt(); // Reading and storing input
		
		int k = 1; // Initial value for printing
		
		System.out.println("Using for loop");
		for (int i = 1; i <= r; i++) // Loop for rows
		{
			for (int j = 1; j <= i; j++) // Loop for columns
			{
				System.out.print(k + " "); // Printing the number with a space
				k++; // Increment the value for the next iteration
			}
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}

