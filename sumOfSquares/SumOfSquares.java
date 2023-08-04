package sumOfSquares;

//Public class named SumOfSquares
public class SumOfSquares
{
	// A static method that calculates and prints the sum of squares of natural numbers from 1 to 'n'
	public static void method(int n)
	{	
		System.out.print("Sum Of Squares from 1 to " + n + " is : "); // Display the expression for sum calculation
		int res = 1; // Variable to store the square of the current number
		int sum = 0; // Variable to store the sum of squares
		
		// Loop through each number from 1 to 'n'
		for (int i = 1; i <= n; i++)
		{
			res = i * i; // Calculate the square of the current number 'i'
			sum = sum + res; // Update the sum with the square of 'i'
			System.out.print(res + " "); // Print the square of the current number 'i'
		}
		
		System.out.print("\nSum = " + sum); // Print the sum of squares
	}
}

