//		print a pattern
//		 1  2  3  4  5 
//		 6  7  8  9 10 
//		11 12 13 14 15 
//		16 17 18 19 20 
//		21 22 23 24 25   

package Patterns;

public class PatternNum_05 
{
	public static void main(String[] args) 
	{
		int k = 1; // Initial value
		
		System.out.println("Using for loop");
		for (int i = 1; i <= 5; i++) // Loop for rows
		{
			for (int j = 1; j <= 5; j++) // Loop for columns
			{	
				System.out.print(k); // Print the current value of 'k'
				System.out.print(" ");
				k++; // Increase the value of 'k' for the next iteration
			}
			
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
