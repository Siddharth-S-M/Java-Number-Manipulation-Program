// Package named evennumbers
package evennumbers;

// Public class named EvenNumbers
public class EvenNumbers 
{
	// A static method that finds and prints all even numbers from 1 to 'n'
	public static void method(int n)
	{	
		System.out.print("All even numbers till " + n + " are: ");
		for (int i = 1; i <= n; i++)
		{
			// Checking if the number 'i' is even (divisible by 2)
			if (i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
	}
}
