//Daniel Wherry
//CSCI 2070W
//Assignment 1,Q5
//1/29/14

import java.text.DecimalFormat;            // Need to import in order to use DecimalFormat type

public class DanielWherryStock             // Same as file name
{
	public static void main(String[] args)
	{
		int numOfShares;                  // Shares will only be integer values, the rest can be decimal
		double initialCostPerShare, initialCostOfTransaction, initialCommission;
		double finalCostPerShare, finalCostOfTransaction, finalCommission;
		double profit;
		
		numOfShares = 1000;
		initialCostPerShare = 32.87;
		initialCostOfTransaction = numOfShares*initialCostPerShare;           // Calculations, set up to where it would be easy to change values if needed
		initialCommission = initialCostOfTransaction * .02;
		finalCostPerShare = 33.92;
		finalCostOfTransaction = numOfShares*finalCostPerShare;
		finalCommission = finalCostOfTransaction * .02;
		profit = (finalCostOfTransaction - initialCostOfTransaction) - (initialCommission + finalCommission);
	
	    DecimalFormat formatter = new DecimalFormat("#0.00");          //Create the object "formatter" so I can tell it how many decimal points to use
		
		System.out.println("Joe paid $" + formatter.format(initialCostOfTransaction) + " for his stock.");
		System.out.println("Joe gave his stockbroker $" + formatter.format(initialCommission) + ", or 2%, for helping him.");
		System.out.println("Joe sold his stock for $" + formatter.format(finalCostOfTransaction) + ".");                     // Output, using formatter.format() makes variables 
		System.out.println("Joe gave his broker $" + formatter.format(finalCommission) + ", 2% again, for helping him.");    // obey DecimalFormat object
		System.out.println("Joe's total profit was $" + formatter.format(profit) + ".");
	
	}   // Close out brackets!
}