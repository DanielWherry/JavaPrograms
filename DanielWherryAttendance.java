//Daniel Wherry
//CSCI 2070W
//Assignment 2,Q3
//2/6/14

import java.util.Scanner;
import java.text.DecimalFormat;

public class DanielWherryAttendance
{
	public static void main(String[] args)
	{
	// numStudentsTotal and numStudentsHere start as 0 so the loop starts correctly
	int numClasses, numStudentsClass, numStudentsToday, numStudentsNotHere;
	int numStudentsTotal = 0; // These two variables are just sums, so I want their 
	int numStudentsHere = 0;  // initial value to be 0
	double attendanceRate;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println();
	System.out.println("Daniel Wherry's middle school's attendance rate calculator.");
	System.out.print("How many classes are in the school: ");
	numClasses = keyboard.nextInt();
	System.out.println("-------------------------------------");// This line is only for aesthetics, it is not needed
	
	int i = 1;// My iteration variable, initialize this before my loop starts.
	
	do {
	
		System.out.print("How many students are supposed to be in class " + i + ": ");
		numStudentsClass = keyboard.nextInt();
		System.out.print("How many students are in this class today: ");
		numStudentsToday = keyboard.nextInt(); 
		System.out.println();
		
		numStudentsTotal += numStudentsClass; // These get a new value added to their old value each time, and the final value will be the answers I need
		numStudentsHere += numStudentsToday;
		
		i++;
		
		} while(i <= numClasses);
		
		numStudentsNotHere = numStudentsTotal - numStudentsHere;
		attendanceRate = 100 * (double)numStudentsHere / numStudentsTotal; // Casting one of these variables allows for the math not to be done "integer style". I could have also declared one of them as a floating point
	
	DecimalFormat formatter = new DecimalFormat("#0.00");
		
	System.out.println("Number of students that attend the school: " + numStudentsTotal);
	System.out.println("Number of students in school today: " + numStudentsHere);
	System.out.println("Number of students not in school today: " + numStudentsNotHere);
	System.out.print("The attendance rate of Daniel Wherry's Middle School is: ");
	System.out.println( formatter.format(attendanceRate) + "%");// Two decimal points seemed like a good place to stop the attendance rate. Anymore would be overkill
	System.out.println();
	
	}
}	
		
	
	