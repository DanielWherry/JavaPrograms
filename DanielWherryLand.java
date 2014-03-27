//Daniel Wherry
//CSCI 2070W
//Assignment 1, Q2
//1/21/2014

import java.util.Scanner;    //Import this so program can accept input from user

public class DanielWherryLand       // Make sure class name is same as file name
{
	public static void main(String[] args)
	{
		float squareFeet;          // Use float so that program is more accurate
		float acre;
		
		
		Scanner keyboard = new Scanner(System.in);     //Initialize keyboard as Scanner object, so program will accept input    
		System.out.print("Enter the size of Daniel Wherry's tract of land in square feet: ");
		squareFeet = keyboard.nextFloat();             //Program uses ".nextFloat" to read the float-type variable that is entered
		
		acre = squareFeet/43560;   // Perform Calculation
		
		System.out.print("The number of acres of Daniel Wherry's tract of land is ..." + acre);    // Give answer
		
	}
}          // Close off brackets!!