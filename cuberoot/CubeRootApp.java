package cuberoot;

// Importing the Scanner class to read user input
import java.util.Scanner;

// Public class named CubeRootApp
public class CubeRootApp 
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
		
		// Creating an instance of the CubeRoot class
		CubeRoot pr = new CubeRoot();
		
		// Calling the 'method' of the CubeRoot class and passing the user-input number as an argument
		pr.method(a);
		
		// Closing the scanner to free up resources
		scan.close();
	}
}
