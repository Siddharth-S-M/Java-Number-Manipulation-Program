package lcm;

//Public class named LCM
public class LCM 
{
	// A static method that calculates the greatest common divisor (GCD) of two numbers 'x' and 'y'
	public static int Gcd(int x, int y)  
	{  
		if (x == 0)  
		{
			// If 'x' is 0, return 'y' as the GCD
			return y;  
		}
		// Recursively call the function with 'y % x' and 'x' to find the GCD
		return Gcd(y % x, x);  
	}  

	// A static method that calculates the least common multiple (LCM) of two numbers 'x' and 'y'
	public static int Lcm(int x, int y)  
	{  
		// Calculate the LCM using the formula: LCM(x, y) = (x / GCD(x, y)) * y
		return (x / Gcd(x, y)) * y;  
	}  
}
