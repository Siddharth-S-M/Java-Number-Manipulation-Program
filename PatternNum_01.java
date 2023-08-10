//		print a pattern
//		11111
//		22222
//		33333
//		44444
//		55555

package Patterns;

public class PatternNum_01 
{
	public static void main(String[] args) 
	{
		System.out.println("Using for loop");
		for (int i = 1; i <= 5; i++) // Loop for rows
		{
			for (int j = 1; j <= 5; j++) // Loop for columns
			{
				System.out.print(i); // Printing the row number
			}
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
