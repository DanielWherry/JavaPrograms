//Daniel Wherry
//CSCI 2070W
//Assignment 3, Q2
//2/27/14

import java.util.Scanner;
import java.text.DecimalFormat;

public class DanielWherryFallingDistance
{
	public static void main(String[] args)
	{
		double time, gravity;
		
		// Read in the gravitational constant and fall-time from user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a gravitational constant, in m/sec^2: ");
		gravity = keyboard.nextFloat();
		System.out.print("Enter the amount of time that the object fell, in seconds: ");
		time = keyboard.nextFloat();
		
		//Calls function fallingDistance() and sets return value equal to x
		double x = fallingDistance(time, gravity);
		
		//Format only because I wanted to, not necessary
		DecimalFormat formatter = new DecimalFormat("#0.000000");
		System.out.println("The object fell " + formatter.format(x) + " meters.");
		
		
	
	
	}

	//Calculates the distance an object fell , given the fall time and gravitational constant
public static double fallingDistance(double t, double g)
{
	double distance = 0.5 * g * t * t;
	
	return distance;
}
}

