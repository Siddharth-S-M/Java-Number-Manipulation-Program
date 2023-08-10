//		print a pattern
//		12345
//		12345
//		12345
//		12345
//		12345


package Patterns;

import java.util.Scanner;

public class PatternNum_02 
{
	public static void main(String[] args) 
	{
		System.out.println("Using for loop");
		for (int i = 1; i <= 5; i++) // Loop for rows
		{
			for (int j = 1; j <= 5; j++) // Loop for columns
			{
				System.out.print(j); // Printing the column number
			}
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
