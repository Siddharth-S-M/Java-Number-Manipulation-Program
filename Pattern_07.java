//				print a pattern

//		          * * * * * 
//		          * * * * * 
//		          * * * * * 
//		          * * * * * 
//		          * * * * * 


package Patterns;

public class Pattern_07 
{
	public static void main(String[] args) 
	{
		System.out.println("Using for loop");
		for (int i = 1; i <= 5; i++) // Loop for rows
		{
			for (int j = 1; j <= 10; j++) // Loop for columns
			{
				if (j <= 5)
				{
					System.out.print("  "); // Printing spaces for the left half of the pattern
				}
				else
				{
					System.out.print("* "); // Printing the stars for the right half of the pattern
				}
			}
			System.out.println(""); // Moving to the next line after each row
		}
		System.out.println("\n");

		int i = 1;
		System.out.println("Using while loop");
		while (i <= 5) // Loop for rows
		{
			for (int j = 1; j <= 10; j++) // Loop for columns
			{
				if (j <= 5)
				{
					System.out.print("  "); // Printing spaces for the left half of the pattern
				}
				else
				{
					System.out.print("* "); // Printing the stars for the right half of the pattern
				}
			}
			System.out.println(""); // Moving to the next line after each row
			i++;
		}
		System.out.println("\n");

		int d = 1;
		System.out.println("Using do-while loop");
		do
		{
			for (int j = 1; j <= 10; j++) // Loop for columns
			{
				if (j <= 5)
				{
					System.out.print("  "); // Printing spaces for the left half of the pattern
				}
				else
				{
					System.out.print("* "); // Printing the stars for the right half of the pattern
				}
			}
			System.out.println(""); // Moving to the next line after each row
			d++;
		}
		while (d <= 5); // Loop condition for rows
		System.out.println("\n");
	}
}
