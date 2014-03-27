//Daniel Wherry
//CSCI 2070W
//Assignment 1, Q4
//1/22/14

import java.util.Scanner;      // Import so program can accept input

public class DanielWherryCents   // Class same as file name
{	
	public static void main(String[] args)
	{
		int numDimes, numQuarters, totalCents;             // Will only use integers
		
		Scanner keyboard = new Scanner(System.in);         // Declare Scanner variable
		System.out.println("Welcome to Daniel Wherry's cents calculator");
		System.out.println("Enter how many dimes you have: ");
		numDimes = keyboard.nextInt();                                     // Ask questions and accepts input
		System.out.println("Enter how many quarters you have: ");
		numQuarters = keyboard.nextInt();
		
		totalCents = (numDimes*10)+(numQuarters*25);        // Calculations with variable values that were input
		
		System.out.print("With " + numDimes + " dimes and " + numQuarters + " quarters, you have " + totalCents + " cents.");
	}
}	    // Give answer and close out brackets!
		