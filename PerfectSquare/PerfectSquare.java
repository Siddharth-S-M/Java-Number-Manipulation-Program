package PerfectSquare;

//Public class named PerfectSquare
public class PerfectSquare 
{
	// A static method that checks if a number 'n' is a perfect square
	public static void method(int n)
	{	
		int sqrt = (int) Math.sqrt(n);   // Calculate the square root of 'n'
		if (sqrt * sqrt == n)
		{
			System.out.print("It is a perfect square.");   
		}
		else  
		{
			System.out.print("It is not a perfect square.");   
		}   
	}   
}

