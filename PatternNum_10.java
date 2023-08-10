//		print a pattern
//		02 04 06 08 10 
//		12 14 16 18 20 
//		22 24 26 28 30 
//		32 34 36 38 40 
//		42 44 46 48 50 

package Patterns;

public class PatternNum_10 
{
	public static void main(String[] args) 
	{
		int n = 1; // Initial value for generating numbers
		
		System.out.println("Using for loop");
		for (int i = 1; i <= 5; i++) // Loop for rows
		{
			for (int j = 1; j <= 5; j++) // Loop for columns
			{	
				int k = n * 2; // Calculate the value to print
				
				if (k <= 9) // If the value is single-digit
				{
					System.out.print("0" + k); // Print the value with a leading zero
					System.out.print(" ");
				}
				else // If the value is double-digit
				{
					System.out.print(k); // Print the value without a leading zero
					System.out.print(" ");
				}
				n++; // Increment the base value for the next iteration
			}
			
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
