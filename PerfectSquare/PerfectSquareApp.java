package PerfectSquare;

import java.util.Scanner;

public class PerfectSquareApp 
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
		
		// Creating an instance of the PerfectSquare class
		PerfectSquare pr = new PerfectSquare();
		
		// Calling the 'method' of the PerfectSquare class and passing the user-input number as an argument
		pr.method(a);
		
		// Closing the scanner to free up resources
		scan.close();
	}
}
