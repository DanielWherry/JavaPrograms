//Daniel Wherry
//CSCI 2070W
//Assignment 2, Q2
//2/5/14

import java.util.Scanner;

public class DanielWherryHorseRace
{
	public static void main(String[] args)
	{
	
	String name1, name2, name3;
	double time1, time2, time3;
	
	Scanner keyboard1 = new Scanner(System.in);
	Scanner keyboard2 = new Scanner(System.in);  // Only needed 1 Scanner object, but had trouble with getting just 1 to work. Will look at it more, but for now hope this is acceptable!!
	Scanner keyboard3 = new Scanner(System.in);
	
	System.out.print("What is the name of the first horse: ");
	name1 = keyboard1.nextLine();
	System.out.print("What is the first horse's time, in seconds: ");
	time1 = keyboard1.nextFloat();
	System.out.print("What is the name of the second horse: ");
	name2 = keyboard2.nextLine();
	System.out.print("What is the second horse's time, in seconds: ");   
	time2 = keyboard2.nextFloat();
	System.out.print("What is the name of the third horse: ");
	name3 = keyboard3.nextLine();
	System.out.print("What is the third horse's time, in seconds: ");
	time3 = keyboard3.nextFloat();
	System.out.println();
	
	if(time1 > time2 && time2 > time3) {// Went through every possible outcome(assuming they all actually finish) by hand.Probably a quicker, more efficient way. This is a long way to do it though, and it works.
	
	System.out.println(name3);
	System.out.println(name2);
	System.out.println(name1);
	
	}else if(time1 > time3 && time3 > time2) {
	
	System.out.println(name2);
	System.out.println(name3);
	System.out.println(name1);
	
	}else if(time2 > time1 && time1 > time3) {
	
	System.out.println(name3);
	System.out.println(name1);
	System.out.println(name2);
	
	}else if(time2 > time3 && time3 > time1) {
	
	System.out.println(name1);
	System.out.println(name3);
	System.out.println(name2);
	
	}else if(time3 > time2 && time2 > time1) {
	
	System.out.println(name1);
	System.out.println(name2);
	System.out.println(name3);
	
	}else if(time3 > time1 && time1 > time2) {
	
	System.out.println(name2);
	System.out.println(name1);
	System.out.println(name3);
	
	}else if(time1 == time2 && time1 > time3) {
	
	System.out.println(name3);
	System.out.println(name1 + " tied with " + name2);// changes from the previous because of a tie
	
	}else if(time1 == time3 && time1 > time2) {
	
	System.out.println(name2);	
	System.out.println(name1 + " tied with " + name3);

	}else if(time2 == time3 && time2 > time1) {
	
	System.out.println(name1);
	System.out.println(name2 + " tied with " + name3);
	
	}else if(time1 == time2 && time1 == time3) {   // No need to include third condition time2 == time3, we know this to be true through the transitive property
	
	System.out.println(name1 + " tied with " + name2 + " and " + name3);
	
	}
	
	}
}