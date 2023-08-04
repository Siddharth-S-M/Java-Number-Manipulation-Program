package sumFirstNaturalNumbers;

//Public class named SumOfFirstNaturalnNumbers
public class SumOfFirstNaturalnNumbers
{
	// A static method that calculates and prints the sum of all natural numbers from 1 to 'n'
	public static void method(int n)
	{	
		int sum = 0; // Variable to store the sum
		System.out.println("All natural numbers till " + n + " are: ");
		
		// Loop through numbers from 1 to 'n'
		for (int i = 1; i <= n; i++)
		{
			sum = sum + i; // Update the sum with the current number 'i'
			System.out.print(i + " "); // Print the current number
		}
		
		System.out.println("\nSum of all natural numbers = " + sum); // Print the sum of all natural numbers
	}
}
