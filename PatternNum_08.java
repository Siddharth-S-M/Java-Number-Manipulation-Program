//		print a pattern
//		25 24 23 22 21 
//		20 19 18 17 16 
//		15 14 13 12 11 
//		10 09 08 07 06 
//		05 04 03 02 01 

package Patterns;

public class PatternNum_08 
{
	public static void main(String[] args) 
	{
		int k = 25; // Initial value for printing
		
		System.out.println("Using for loop");
		for (int i = 1; i <= 5; i++) // Loop for rows
		{
			for (int j = 1; j <= 5; j++) // Loop for columns
			{	
				if (k <= 9)
				{
					System.out.print("0" + k); // Print the number with a leading zero
					System.out.print(" ");
				}
				else
				{
					System.out.print(k); // Printing the number
					System.out.print(" ");
				}
				k--; // Decrement the value for the next iteration
			}
			
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
