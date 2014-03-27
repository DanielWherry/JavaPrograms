//Daniel Wherry
//CSCI 2070W
//Assignment 1, Q3
//1/29/14

import java.util.Scanner;          // So I can use Scanner object to read input

public class DanielWherryWord      // Class name same as file name 
{
	public static void main(String[] args)
	{
	   
	    String name,age,city,college,profession,animal,petName; /* Only using String, cause won't be taking
	                                                             any numbers that I will calculate with */
		Scanner keyboard = new Scanner(System.in);              // Declares and assigns my Scanner object so I can input
	
		System.out.println("We are going to play a little game.");
		System.out.println("What is your name?");
		name = keyboard.nextLine();
		System.out.println("How old are you?");
		age = keyboard.nextLine();
		System.out.println("Name a city.");
		city = keyboard.nextLine();                             // Asks user questions, accepts input
		System.out.println("Name a college.");                          
		college = keyboard.nextLine();
		System.out.println("Name a profession.");
		profession = keyboard.nextLine();
		System.out.println("Name an animal.");
		animal = keyboard.nextLine();
		System.out.println("What is the animal's name?");
		petName = keyboard.nextLine();
		System.out.println(); // Extra space, to separate questions and story
	
		System.out.print("There once was a person named " + name + " who lived in " + city + ".\n");
		System.out.print("At the age of " + age + ", " + name + " went to college at " + college + ".\n");    //Tells the story
		System.out.print(name + " graduated and went to work as a(n) " + profession + ".\n");
		System.out.print("Then, " + name + " adopted a(n) " + animal + " named " + petName + ".\n");
		System.out.println( "They both lived happily ever after!");
	
	}
}		// Close out the brackets!