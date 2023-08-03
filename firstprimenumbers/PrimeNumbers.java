package firstprimenumbers;

// Public class named PrimeNumbers
public class PrimeNumbers 
{
	// A static method that calculates and prints the prime numbers up to the given number 'n'
	public static void method(int n)
	{	
		System.out.println("Prime Numbers till " + n + " are: ");
		for (int i = 2; i <= n; i++)
		{
			// Check if the number 'i' is prime
			if (i % 2 != 0 && i % 3 != 0 || i == 2 || i == 3)
			{
				System.out.print(i + " ");
			}
		}
	}
}
