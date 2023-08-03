// Package named factorialofgivennumber
package factorialofgivennumber;

// Public class named FactorialOfGivenNumber
public class FactorialOfGivenNumber 
{
	// A static method that calculates and prints the factorial of the given number 'n'
	public static void method(int n)
	{	
		int fact = 1; // Initialize a variable to store the factorial value
		
		// Calculate the factorial by multiplying all numbers from 1 to 'n'
		System.out.print("Factorial of Given Number is: ");
		for (int i = 1; i <= n; i++)
		{
			fact = fact * i;
			System.out.print(i + " ");
		}
		
		// Print the factorial value
		System.out.print("= " + fact);
	}
}
