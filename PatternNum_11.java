
//			01 03 05 07 
//			09 11 13 15 
//			17 19 21 23 
//			25 27 29 31 
//			33 35 37 39 

package Patterns;

public class PatternNum_11 
{
	public static void main(String[] args) 
	{
		int k = 1;
		System.out.println("Using for loop");
		for (int i = 1; i <= 5; i++) // Loop for rows
		{
			for (int j = 1; j <= 8; j++) // Loop for columns
			{	
				if (k % 2 != 0) // Check if the number is odd
				{
					if (k <= 9)
					{
						System.out.print("0" + k); // Printing with a leading zero if less than 10
						System.out.print(" ");
					}
					else
					{
						System.out.print(k); // Printing odd number
						System.out.print(" ");
					}
				}
				k++;
			}
			
			System.out.println(""); // Move to the next line after each row
		}
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
