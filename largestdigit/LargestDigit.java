package largestdigit;

//Public class named LargestDigit
public class LargestDigit 
{
	// A static method that finds and prints the largest digit of the number 'n' and calculates the sum of all its digits
	public static void method(int n)
	{	
		int res = 0; // Variable to store the current digit
		int larg = 0; // Variable to store the largest digit
		int temp; // Temporary variable to store the current digit
		System.out.print("Largest Digits Of a Number " + n + " is: ");  
		
		while (n > 0)
		{
			res = n % 10; // Extract the last digit of 'n'
			n = n / 10; // Remove the last digit from 'n'
			temp = res; // Store the current digit in a temporary variable
			
			// Check if the current digit is larger than the current largest digit
			if (larg < temp)
				larg = temp; // Update the largest digit to the current digit
			
			System.out.print(res + " "); // Print the current digit
		}
		
		System.out.print("\nLargest Digit is: " + larg); // Print the largest digit
	}
}

