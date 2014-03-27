//Daniel Wherry
//CSCI 2070W
//Assignment 3, Q4
//3/18/14

import java.util.Scanner;

public class DanielWherryCubeDemo
{
	public static void main(String[] args)
	{
		double edgeLength;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the edge length of a cube: ");  // This isn't necessary for testing, but I like to ask the user 
		edgeLength = keyboard.nextFloat();
		
		// Makes DanielWherryCube object, cube
		DanielWherryCube cube = new DanielWherryCube(edgeLength);
		
		System.out.println("The edge length is: " + cube.getEdgeLength());
		System.out.println("The surface area is: " + cube.getSurfaceArea());   // These fuor lines use the edgeLength that is given by the user as arguments in the methods in the DanielWherryCube class
		System.out.println("The volume is: " + cube.getVolume());
		System.out.println("The diagonal length of each face is: " + cube.getFaceDiagonal());
	
	// Formatting could help accuracy in this program, as it becomes inaccurate after a certain amount of decimal places
	}
}