package palindrome;

//Public class named Palindrome
public class Palindrome 
{
	// A static method that checks whether the number 'n' is a palindrome or not
	public static void method(int n)
	{	
		int res; // Variable to store the current digit
		int sum = 0; // Variable to store the reversed number
		int temp; // Temporary variable to store the original number
		System.out.println("Palindrome Of a Number " + n + " is : ");  
		
		temp = n; // Store the original number in a temporary variable
		
		// Reverse the number 'n'
		while (n > 0)
		{
			res = n % 10; // Extract the last digit of 'n'
			sum = (sum * 10) + res; // Build the reversed number
			n = n / 10; // Remove the last digit from 'n'
		}
		
		System.out.println("Original number: " + temp);
		
		// Check if the original number is equal to the reversed number
		if (temp == sum)    
			System.out.println("Palindrome number");    
		else    
			System.out.println("Not a palindrome");    
	}
}
