// Package named fibonacciseries
package fibonacciseries;

// Public class named FibonacciSeries
public class FibonacciSeries 
{
	// A static method that calculates and prints the Fibonacci series up to the given number 'n'
	public static void method(int n)
	{	
		int n1 = 0; // Initialize the first number of the Fibonacci series
		int n2 = 1; // Initialize the second number of the Fibonacci series
		int res = 0; // Initialize a variable to store the current result
		
		// Print the first two numbers of the Fibonacci series (0 and 1)
		System.out.println("Fibonacci Series till " + n + " is: ");
		System.out.print(n1 + " " + n2);
		
		// Calculate and print the remaining Fibonacci numbers using a loop
		for (int i = 2; i <= n; i++)
		{
			res = n1 + n2; // Calculate the next Fibonacci number
			System.out.print(" " + res); // Print the result
			n1 = n2; // Update n1 with the previous n2
			n2 = res; // Update n2 with the current result
		}
	}
}
