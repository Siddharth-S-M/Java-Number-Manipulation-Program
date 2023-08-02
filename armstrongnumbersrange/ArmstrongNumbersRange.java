// Package named armstrongnumbersrange
package armstrongnumbersrange;

// Public class named ArmstrongNumbersRange
public class ArmstrongNumbersRange 
{
	// A static method that finds and prints Armstrong numbers within the range [s, e]
	public static void method(int s, int e)
	{
		for (int i = s; i <= e; i++)
		{
			int check, rem, sum = 0;
			check = i;
			
			// Calculate the sum of cubes of the digits of 'i'
			while (check != 0) 
			{
				rem = check % 10;
				sum = sum + (rem * rem * rem);
				check = check / 10;
			}
			
			// Check if the number is an Armstrong number and print the result
			if (sum == i)
			{
				System.out.println(i + " is an Armstrong number");
			}
			else 
			{
				System.out.println(i + " is not an Armstrong number");
			}
		}
	}
}
