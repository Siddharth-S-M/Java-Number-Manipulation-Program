package raisedToPower;

//Importing the Scanner class to read user input
import java.util.Scanner;

//Public class named PowerApp
public class PowerApp 
{
	// The main method where the program execution starts
	public static void main(String[] args) 
	{
		// Creating a Scanner object to read user input
		Scanner scan = new Scanner(System.in);
		
		// Asking the user to enter a number
		System.out.print("Enter the number: ");
		
		// Reading and storing the user input in variable 'a'
		int a = scan.nextInt();
		
		// Asking the user to enter the exponent
		System.out.print("Enter its power: ");
		
		// Reading and storing the user input for the exponent in variable 'b'
		int b = scan.nextInt();
		
		// Creating an instance of the Power class
		Power pr = new Power();
		
		// Calling the 'method' of the Power class and passing the user-input numbers as arguments
		pr.method(a, b);
		
		// Closing the scanner to free up resources
		scan.close();
	}
}
