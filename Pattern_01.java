//			print a pattern
//			* * * * * 

package Patterns;

import java.util.Scanner;

public class Pattern_01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Creating a scanner class
		System.out.print("Enter the length: "); // Asking user to input 
		int n = scan.nextInt(); // Reading and storing input
		
		// Using a for loop to create the pattern
		System.out.println("Using for loop");
		for (int i = 1; i <= n; i++) // Loop for iterating n times
		{
			System.out.print("* "); // Printing an asterisk followed by a space
		}
		System.out.println("\n");
		
		int i = 1;
		// Using a while loop to create the pattern
		System.out.println("Using while loop");
		while (i <= n) // Loop until i reaches n
		{
			System.out.print("* "); // Printing an asterisk followed by a space
			i++; // Incrementing i
		}
		System.out.println("\n");	
		
		int d = 1;
		// Using a do-while loop to create the pattern
		System.out.println("Using do-while loop");
		do
		{
			System.out.print("* "); // Printing an asterisk followed by a space
			d++; // Incrementing d
		}
		while (d <= n); // Loop until d reaches n
		System.out.println("\n");	
	}
}
