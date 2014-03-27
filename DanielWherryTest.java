//Daniel Wherry
//CSCI 2070W
//Assignment 3, Q1
//3/11/14

import java.util.Scanner;

public class DanielWherryTest
{
	public static void main(String[] args)
	{
	double score1, score2, score3, score4, score5;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter 5 test scores: ");
	score1 = keyboard.nextFloat();
	score2 = keyboard.nextFloat();
	score3 = keyboard.nextFloat(); // Read in the test scores
	score4 = keyboard.nextFloat();
	score5 = keyboard.nextFloat();
	
	System.out.println("The first score was a(n): " + determineGrade(score1));
	System.out.println("The second score was a(n): " + determineGrade(score2));
	System.out.println("The third score was a(n): " + determineGrade(score3)); // determineGrade() called by using the different scores input by the user as arguments in the function 
	System.out.println("The fourth score was a(n): " + determineGrade(score4));
	System.out.println("The fifth score was a(n): " + determineGrade(score5));

	System.out.println("The average score was a(n): " + calcAverage(score1,score2,score3,score4,score5)); //calcAverage called by using all the test scores as arguments

	}
	
	//Calculates the average score of 5 test scores 
	public static double calcAverage(double s1, double s2, double s3, double s4, double s5)  // the s1...s5 stand for score1...score5 
	{
	
	double average = (s1+s2+s3+s4+s5)/5;
	return average;
	
	}
	// Tells grade of any given score
	public static char determineGrade(double s) // s is for score, I reused my way to find the grade from the earlier assignment TestScore
	{
	
		if(s < 60)
			return 'F';
		else if(s < 70)
			return 'D';
		else if(s < 80)
			return 'C';            
		else if(s < 90)
			return 'B';
		else
			return 'A';
	
	}
}