//Daniel Wherry
//CSCI 2070W
//Assignment 2, Q5
//2/15/14

import java.util.Scanner;

public class DanielWherrySquare
{
	public static void main(String[] args) 
	{
	
	int i;// only used in first loop. Other variables are declared in the for statements
	Scanner keyboard = new Scanner(System.in);
	
	do{
		System.out.println();
		System.out.print("Enter a positive integer that is no greater than 15: ");
		i = keyboard.nextInt();
	
	
		if(i < 1 || i > 15)
		{
			System.out.println("Number not in accepted range (Positive AND less than or equal to 15)");   // This first loop just makes the user enter the right value
		}
	
	
		}while(i < 1 || i > 15);
	
	System.out.println();
	
	for(int x = 1; x <= i; x++)
	{	
		for(int y = 1; y <= i; y++)  // Nested for-loop was easiest to construct, in my opinion. Others didn't look so concise
		{
			System.out.print("X");
		}
		
		System.out.println();
	}
	
	}
}