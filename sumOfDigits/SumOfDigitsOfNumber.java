package sumOfDigits;

//Public class named SumOfDigitsOfNumber
public class SumOfDigitsOfNumber 
{
	// A static method that calculates and prints the sum of the digits of the number 'n'
	public static void method(int n)
	{	
		int res = 0; // Variable to store the current digit
		int sum = 0; // Variable to store the sum of digits
		System.out.print("Sum Of Digits Of a Number " + n + " is : "); // Display the expression for sum calculation
		
		// Loop through each digit of 'n' until there are no digits left
		while (n > 0)
		{
			res = n % 10; // Extract the last digit of 'n'
			sum = sum + res; // Update the sum with the current digit
			n = n / 10; // Remove the last digit from 'n'
			System.out.print(res + " "); // Print the current digit
		}
		
		System.out.print("\nSum = " + sum); // Print the sum of digits
	}
}
