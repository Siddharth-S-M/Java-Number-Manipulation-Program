package gcdoftwonumber;

//Public class named GCD
public class GCD 
{
	// A static method that calculates and prints the GCD of two numbers 'n1' and 'n2'
	public static void method(int n1, int n2)
	{	
		System.out.println("GCD of two numbers " + n1 + " & " + n2 + " is: ");   
		while (n1 != n2)   
		{  
			if (n1 > n2)  
				n1 = n1 - n2;  
			else  
				n2 = n2 - n1;  
		}  
		System.out.print(n2);
	}
}
