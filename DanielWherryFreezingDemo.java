//Daniel Wherry
//CSCI 2070W
//Assignment 4, Q1
//3/21/14

import java.util.Scanner;

public class DanielWherryFreezingDemo
{
	public static void main(String[] args)
	{
		double temp;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a temperature, in Farenheit: ");
		temp = keyboard.nextFloat();
		
		DanielWherryFreezing tempTest = new DanielWherryFreezing(temp);
		
		if(tempTest.isEthylFreezing() == true)
		{
			System.out.println("Ethyl is frozen at this temperature.");
		}
		if(tempTest.isEthylBoiling() == true)
		{
			System.out.println("Ethyl is boiling at this temperature.");
		}
		if(tempTest.isOxygenFreezing() == true)
		{
			System.out.println("Oxygen is frozen at this temperature");
		}
		if(tempTest.isOxygenBoiling() == true)
		{
			System.out.println("Oxygen is boiling at this temperature");
		}
		if(tempTest.isWaterFreezing() == true)
		{
			System.out.println("Water is frozen at this temperature");
		}
		if(tempTest.isWaterBoiling() == true)
		{
			System.out.println("Water is boiling at this temperature");
		}
		
	}
}