package BinaryToDecimal;

//Public class named BinaryToDecimal
public class BinaryToDecimal 
{
	// A static method that converts a binary number to decimal
	public static void method(int n)
	{	
		double sum = 0;
		int res = 0; // Variable to store the current digit
		int p = 0; 
		
		while (n > 0)
		{
			res = n % 10; // Extract the last digit of 'n'
			sum += res * Math.pow(2, p);  
			n = n / 10; // Remove the last digit from 'n'
			p++;
		}

		System.out.print("\nDecimal Equivalent is: " + sum); // Print the decimal equivalent
	}
}
