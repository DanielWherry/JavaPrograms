//Daniel Wherry
//CSCI 2070W
//Assignment 2, Q4
//12/12/14

import java.util.Scanner;
import java.io.*; // For reading and writing to files

public class DanielWherryUpperFile
{
	public static void main(String[] args) throws IOException
		{
		
			String filename, line;
			
			Scanner keyboard =  new Scanner(System.in);
			
			System.out.print("Enter the name of the file you will read from: " );
			filename = keyboard.nextLine();
			File file = new File(filename); //Creates a file object that allows me to read from a specified file
			
			Scanner inputFile = new Scanner(file);   // Allows me to read from file I chose
			
			System.out.print("Enter the name of the file you will write too: ");
			filename = keyboard.nextLine();
		
			File myfile = new File(filename); // Creates a new file for me to write too
			
			if (myfile.exists())
			{
				System.out.println("The file "+filename+ " already exists.");   // Tells me if the file name I chose exists or not.
				System.exit(0);
			}
			
			PrintWriter outputFile = new PrintWriter(myfile); // Let's me write to file I have chosen for writing
			
			while (inputFile.hasNext())
			{
				String myLine = inputFile.nextLine();// Reads line and stores it
				String upper = myLine.toUpperCase(); // Uppercases the lines
				outputFile.println(upper); // puts line in output file
			}
			
			outputFile.close();
			inputFile.close();   //Closes both files
			System.out.println("Data written to the file.");
		}
}
			