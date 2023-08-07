package reverseNumber;

//Public class named ReverseNumber
public class ReverseNumber 
{
	// A static method that finds and prints the reverse of the given number 'n'
	public static void method(int n)
	{	
		int res = 0; // Variable to store the current digit
		int rev = 0; // Temporary variable to store the reverse of the number
		
		// Loop through each digit of the number 'n'
		while (n > 0)
		{
			res = n % 10; // Extract the last digit of 'n'
			n = n / 10; // Remove the last digit from 'n'
			rev = (rev * 10) + res; // Build the reverse number by appending the current digit
		}
		
		System.out.print("\nReverse Number is: " + rev); // Print the reverse of the number
	}
}
