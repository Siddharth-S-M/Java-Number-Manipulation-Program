// Package named armstrongnumbers
package armstrongnumbers;

// Public class named ArmstrongNumbers
public class ArmstrongNumbers 
{
	// A static method that checks if the given number 'n' is an Armstrong number
	public static void method(int n)
	{  
		int temp, digits = 0, last = 0, sum = 0;   
		
		// Calculate the number of digits in the input number 'n'
		temp = n;
		while (temp > 0)    
		{   
			temp = temp / 10;   
			digits++;   
		}
		
		temp = n; // Reset temp to the original number

		// Calculate the sum of each digit raised to the power of 'digits'
		while (temp > 0)   
		{        
			last = temp % 10;   
			sum +=  (Math.pow(last, digits));   
			temp = temp / 10;   
		}  

		// Check if the number is an Armstrong number and print the result
		if (n == sum)   
		{
			System.out.println("\n" + n + " is equal to " + sum);
			System.out.println(n + " is an Armstrong Number.");
		}     
		else 
		{
			System.out.println(n + " is not equal to " + sum);
			System.out.println(n + " is not an Armstrong Number.");
		}  	
	}
}
