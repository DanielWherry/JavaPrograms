//Daniel Wherry
//CSCI 2070W
//Assignment 4, Q4
//4/15/14

import java.util.Scanner;


public class DanielWherryProfitDemo
{
	public static void main(String[] args){
	
	double profit;
	
	Scanner keyboard = new Scanner(System.in);
	
	DanielWherryProfit p = new DanielWherryProfit();
	
	System.out.println();
	System.out.println("Daniel Wherry's Space Travel Company");
	System.out.println("  -------------------------------   ");
	System.out.println();
	do{
	System.out.print("Enter profit for January: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setJanuary(profit);
	do{
	System.out.print("Enter profit for February: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setFebruary(profit);
	do{
	System.out.print("Enter profit for March: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setMarch(profit);
	do{
	System.out.print("Enter profit for April: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setApril(profit);
	do{
	System.out.print("Enter profit for May: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setMay(profit);
	do{
	System.out.print("Enter profit for June: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setJune(profit);
	do{
	System.out.print("Enter profit for July: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setJuly(profit);
	do{
	System.out.print("Enter profit for August: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setAugust(profit);
	do{
	System.out.print("Enter profit for September: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setSeptember(profit);
	do{
	System.out.print("Enter profit for October: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setOctober(profit);
	do{
	System.out.print("Enter profit for November: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setNovember(profit);
	do{
	System.out.print("Enter profit for December: ");
	profit = keyboard.nextFloat();
	}while(profit < 0);
	p.setDecember(profit);
	
	
	System.out.println("  -------------------------------   ");
	System.out.println();
	
	System.out.println("January: " + p.getJanuary() + " dollars.");
	System.out.println("February: " + p.getFebruary() + " dollars.");
	System.out.println("March: " + p.getMarch() + " dollars.");
	System.out.println("April: " + p.getApril() + " dollars.");
	System.out.println("May: " + p.getMay() + " dollars.");
	System.out.println("June: " + p.getJune() + " dollars.");
	System.out.println("July: " + p.getJuly() + " dollars.");
	System.out.println("August: " + p.getAugust() + " dollars.");
	System.out.println("September: " + p.getSeptember() + " dollars.");
	System.out.println("October: " + p.getOctober() + " dollars.");
	System.out.println("November: " + p.getNovember() + " dollars.");
	System.out.println("December: " + p.getDecember() + " dollars.");
	
	System.out.println();
	
	System.out.println("Total profit for the year: " + p.totalProfit() + " dollars.");
	System.out.println("The average profit for the year: " + p.averageProfit() + " dollars.");
	System.out.println("Month with highest earnings: " + p.highMonth() + "." );
	System.out.println("Month with lowest earnings: " + p.lowMonth() + "." );
	
	}
	
	
}