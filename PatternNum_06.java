//		print a pattern
//		25 24 23 22 21 
//		20 19 18 17 16 
//		15 14 13 12 11 
//		10  9  8  7  6 
//		 5  4  3  2  1 

package Patterns;

public class PatternNum_06 
{
	public static void main(String[] args) 
	{
		int k = 25; // Initial value
		
		System.out.println("Using for loop");
		for (int i = 1; i <= 5; i++) // Loop for rows
		{
			for (int j = 1; j <= 5; j++) // Loop for columns
			{	
				System.out.print(k); // Print the current value of 'k'
				System.out.print(" ");
				k--; // Decrease the value of 'k' for the next iteration
			}
			
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
