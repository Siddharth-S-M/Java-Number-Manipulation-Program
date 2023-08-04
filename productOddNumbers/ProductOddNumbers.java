package productOddNumbers;

//Public class named ProductOddNumbers
public class ProductOddNumbers 
{
	// A static method that calculates and prints the product of all odd numbers from 1 to 'n'
	public static void method(int n)
	{	
		int prod = 1; // Variable to store the product
		System.out.println("All odd numbers till " + n + " are: ");
		
		// Loop through numbers from 1 to 'n'
		for (int i = 1; i <= n; i++)
		{
			// Check if the current number 'i' is odd
			if (i % 2 != 0)
			{
				prod = prod * i; // Update the product with the current odd number
				System.out.print(i + " "); // Print the current odd number
			}
		}
		
		System.out.println("\nProduct of all odd numbers = " + prod); // Print the product of all odd numbers
	}
}
