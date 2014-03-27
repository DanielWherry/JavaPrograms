//Daniel Wherry
//CSCI 2070W
//Assignment 1, Q6
//1/30/14

import java.util.Scanner;  // Import so can create Scanner object
import java.text.DecimalFormat; // Import so can create DecimalFormat object

public class DanielWherryTestScore  // Class name matches file name
{
	public static void main(String[] args)
	{	
		double score1, score2, score3;               // Using three scores and an average
		double averageScore;
		
		Scanner keyboard = new Scanner(System.in);   //Creates scanner object so program will accept input
		System.out.print("\n");                      // Only for formatting, puts an extra line between the command line prompt and the start of the program
		System.out.print("What is the first test score: ");
		score1 = keyboard.nextFloat();
		System.out.print("What is the second test score: ");               
		score2 = keyboard.nextFloat();
		System.out.print("What is the third test score: ");
		score3 = keyboard.nextFloat();
		System.out.print("\n");                      // Same as the first, only for aesthetics
		
		averageScore = ((score1 + score2 + score3)/3);       //Calculations
		
		DecimalFormat formatter = new DecimalFormat("#0.00");      //Creates DecimalFormat object that makes output numbers stop after 2 decimal places 
		
		System.out.println("Your average score is a(n) " + formatter.format(averageScore) + "%");  // Applies DecimalFormat object to my variable 
		
		if(averageScore < 60)
			System.out.println("That is a(n) F.");
		else if(averageScore < 70)
			System.out.println("That is a(n) D.");
		else if(averageScore < 80)
			System.out.println("That is a(n) C.");            //Using the If-ElseIf-Else loop lets me tell user different outputs depending on input
		else if(averageScore < 90)
			System.out.println("That is a(n) B.");
		else
			System.out.println("That is an(n) A. Great Job!!");	
		
		//Since I only have 1 class in this file, I shouldn't need System.exit() ... hopefully
	}
}       // Close brackets!!