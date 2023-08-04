package squareRoot;

//Importing the Scanner class to read user input
import java.util.Scanner;

//Public class named SquareRootApp
public class SquareRootApp 
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
		
		// Creating an instance of the SquareRoot class
		SquareRoot pr = new SquareRoot();
		
		// Calling the 'method' of the SquareRoot class and passing the user-input number as an argument
		pr.method(a);
		
		// Closing the scanner to free up resources
		scan.close();
	}
}

