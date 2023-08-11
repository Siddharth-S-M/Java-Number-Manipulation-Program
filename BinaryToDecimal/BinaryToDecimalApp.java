package BinaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimalApp 
{
	// The main method where the program execution starts
	public static void main(String[] args) 
	{
		// Creating a Scanner object to read user input
		Scanner scan = new Scanner(System.in);
		
		// Asking the user to enter a binary number
		System.out.print("Enter the binary number: ");
		
		// Reading and storing the user input in variable 'a'
		int binaryNumber = scan.nextInt();
		
		// Creating an instance of the BinaryToDecimal class
		BinaryToDecimal converter = new BinaryToDecimal();
		
		// Calling the 'method' of the BinaryToDecimal class and passing the user-input binary number as an argument
		converter.method(binaryNumber);
		
		// Closing the scanner to free up resources
		scan.close();
	}
}
