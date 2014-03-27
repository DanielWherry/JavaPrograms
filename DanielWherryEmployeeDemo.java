//Daniel Wherry
//CSCI 2070W
//Assignment 3, Q3
//3/18/14

public class DanielWherryEmployeeDemo
{
	public static void main(String[] args)
	{
		// Create 3 DanielWherryEmployee objects, and set the information from the book in them
		DanielWherryEmployee first = new DanielWherryEmployee("Susan Meyers", 47899, "Accounting", "Vice President");
		DanielWherryEmployee second = new DanielWherryEmployee("Mark Jones", 39119, "IT", "Programmer");
		DanielWherryEmployee third = new DanielWherryEmployee("Joy Rogers", 81774, "Manufacturing", "Engineer");
	
	
		System.out.println("Employee name: " + first.getName());
		System.out.println("ID Number: " + first.getID());
		System.out.println("Department: " + first.getDept());	// Uses the information given in first as arguments in methods in DanielWherryEmployee class
		System.out.println("Position: " + first.getPos());

		System.out.println("Employee name: " + second.getName());
		System.out.println("ID Number: " + second.getID());
		System.out.println("Department: " + second.getDept());	// Uses the information given in second as arguments in methods in DanielWherryEmployee class
		System.out.println("Position: " + second.getPos());	
	
		System.out.println("Employee name: " + third.getName());
		System.out.println("ID Number: " + third.getID());
		System.out.println("Department: " + third.getDept());	// Uses the information given in third as arguments in methods in DanielWherryEmployee class
		System.out.println("Position: " + third.getPos());
	
	
	
	
	}
	
}