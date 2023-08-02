package armstrongnumbersrange;

//Importing the Scanner class to read user input
import java.util.Scanner;

//Public class named ArmstrongNumbersRangeApp
public class ArmstrongNumbersRangeApp 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); // Creating a Scanner object to read user input

        // Asking the user to enter the start number of the range
        System.out.print("Enter the start number: ");
        int s = scan.nextInt(); // Reading and storing the start number

        // Asking the user to enter the end number of the range
        System.out.print("Enter the end number: ");
        int e = scan.nextInt(); // Reading and storing the end number

        // Creating an instance of the ArmstrongNumbersRange class
        ArmstrongNumbersRange pr = new ArmstrongNumbersRange();

        // Calling the 'method' of the ArmstrongNumbersRange class and passing the start and end numbers as arguments
        pr.method(s, e);

        // Closing the scanner to free up resources
        scan.close();
    }
}
