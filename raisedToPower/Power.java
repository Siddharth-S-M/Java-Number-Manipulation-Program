package raisedToPower;

//Public class named Power
public class Power 
{
	// A static method that calculates and prints the power of 'n' raised to the exponent 'pow'
	public static void method(int n, int pow)
	{	
		System.out.println(n + "^" + pow + " : "); // Display the expression for power calculation
		System.out.print(Math.pow(n, pow)); // Calculate and print the result of 'n' raised to the power 'pow'
	}
}
