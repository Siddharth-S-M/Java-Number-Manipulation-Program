package palindrome;

//Importing the Scanner class to read user input
import java.util.Scanner;

//Public class named PalindromeApp
public class PalindromeApp 
{
	// The main method where the program execution starts
	public static void main(String[] args) 
	{
		// Creating a Scanner object to read user input
		Scanner scan = new Scanner(System.in);
		
		// Asking the user to enter a number
		System.out.print("Enter the number: ");
		
		// Reading and storing the user input in variable 'n'
		int n = scan.nextInt();
		
		// Creating an instance of the Palindrome class
		Palindrome pr = new Palindrome();
		
		// Calling the 'method' of the Palindrome class and passing the user-input number as an argument
		pr.method(n);
		
		// Closing the scanner to free up resources
		scan.close();
	}
}
