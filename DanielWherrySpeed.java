//Daniel Wherry
//CSCI 2070W
//Assignment 2, Q1
//2/5/14

import java.util.Scanner;
import java.text.DecimalFormat;

public class DanielWherrySpeed 
{
	public static void main(String[] args)
	{
		int option;
		double distance, speed, time;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.0000");
		
		System.out.println();
		System.out.println("Choose a medium through which a sound wave will travel");
		System.out.print("(1 = air, 2 = water, 3 = steel): "); 
		option = keyboard.nextInt();
		
		if(option < 1 || option > 3){
		
		System.out.println();
		System.out.println("You have to enter either a 1, 2, or 3. Try again.");  // This if statement just makes user enter correct value
		System.exit(0);
		
		}
		
		System.out.print("How far will the sound wave travel, in feet: ");
		distance = keyboard.nextFloat();
		System.out.println();
		
		if(option == 1){ // could have also used a switch statement...but I prefer this.
		
		time = distance/1100; // The if statements are same structure, they make one calculation then output
		
		System.out.println("The time it will take for the wave to travel " + formatter.format(distance)); // DecimalFormat not needed, and can lower accuracy, but 4 digits is plenty for this problem
		System.out.println("feet in air is about " + formatter.format(time) + " seconds.");
		
		} else if(option == 2){ // else if not necesary, if would work too, I just prefer else if
		
		time = distance/4900;
		
		System.out.println("The time it will take for the wave to travel " + formatter.format(distance));
		System.out.println("feet in water is about " + formatter.format(time) + " seconds.");
		
		} else if(option == 3){
		
		time = distance/16400;
		
		System.out.println("The time it will take for the wave to travel " + formatter.format(distance));
		System.out.println("feet in steel is about " + formatter.format(time) + " seconds.");
		
		} 
	}
}
		