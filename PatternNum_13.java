//			print a pattern	
//			     1 
//			    1 1 
//			   1 2 1 
//			  1 3 3 1 
//			 1 4 6 4 1 

package Patterns;

public class PatternNum_13 
{
	public static void main(String[] args) 
	{
		int n = 5;
		System.out.println("Using for loop");
		for (int i = 1; i <= n; i++) // Loop for rows
		{
            for (int j = 1; j <= n - i + 1; j++) // Loop for spaces
            {
                System.out.print(" ");
            }
            int x = 1;
            for (int k = 1; k <= i; k++) // Loop to generate numbers using Pascal's Triangle logic
            {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println(); // Move to the next line after each row
        }
		System.out.println("\n"); // Print an empty line after the pattern
	}
}
