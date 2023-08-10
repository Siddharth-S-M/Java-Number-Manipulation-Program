//		print a pattern
//		01 02 03 04 05 
//		06 07 08 09 10 
//		11 12 13 14 15 
//		16 17 18 19 20 
//		21 22 23 24 25 

package Patterns;

public class PatternNum_07 
{
	public static void main(String[] args) 
	{
		int k = 1; // Initial value for printing
		
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
				k++; // Increment the value for the next iteration
			}
			
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
