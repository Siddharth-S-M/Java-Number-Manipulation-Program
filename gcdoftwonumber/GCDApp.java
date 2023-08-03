package gcdoftwonumber;

//Importing the Scanner class to read user input
import java.util.Scanner;

//Public class named GCDApp
public class GCDApp 
{
	// The main method where the program execution starts
	public static void main(String[] args) 
	{
		// Creating a Scanner object to read user input
		Scanner scan = new Scanner(System.in);
		
		// Asking the user to enter the first number
		System.out.print("Enter the first number: ");
		
		// Reading and storing the user input in variable 'a'
		int a = scan.nextInt();
		
		// Asking the user to enter the second number
		System.out.print("Enter the second number: ");
		
		// Reading and storing the user input in variable 'b'
		int b = scan.nextInt();
		
		// Creating an instance of the GCD class
		GCD pr = new GCD();
		
		// Calling the 'method' of the GCD class and passing the user-input numbers as arguments
		pr.method(a, b);
		
		// Closing the scanner to free up resources
		scan.close();
	}
}
