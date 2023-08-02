// Package named cuberoot
package cuberoot;

// Public class named CubeRoot
public class CubeRoot 
{
	// A static method that calculates the cube root of the given parameter 'n'
	public static void method(int n) // Accepting the parameter 'n'
	{	
		// Printing a message indicating that we are calculating the cube root of 'n'
		System.out.print("Cube Root Of a Number " + n + " is : ");  

		// Calculating and printing the cube root of 'n' using the Math.cbrt() method
		System.out.print(Math.cbrt(n));
	}
}
