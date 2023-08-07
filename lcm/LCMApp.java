package lcm;

//Importing the Scanner class to read user input
import java.util.Scanner;

//Public class named LCMApp
public class LCMApp 
{
	// The main method where the program execution starts
	public static void main(String args[])  
	{  
		int x, y;      
		Scanner scan = new Scanner(System.in);    
		System.out.print("Enter the first number: ");    
		x = scan.nextInt();    
		System.out.print("Enter the second number: ");   
		y = scan.nextInt();    

		// Creating an instance of the LCM class
		LCM pr = new LCM();

		// Calling the 'Lcm' method of the LCM class and passing the user-input numbers as arguments
		System.out.println("LCM of " + x + " and " + y + " is " + pr.Lcm(x, y));  
		
		// Closing the scanner to free up resources
		scan.close();
	}  
}
