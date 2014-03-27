//Daniel Wherry
//Daniel Wherry
//CSCI 2070W
//Assignment 3, Q3
//3/18/14

public class DanielWherryEmployee
{
	// Fields, all private so can't be changed by outside program
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	
	// First Constructor
	public DanielWherryEmployee(String nam, int id, String dept, String pos)
	{
		name = nam;
		idNumber = id;
		department = dept;
		position = pos;
	
	}
	// Overloaded Constructor, accepts 2 arguments versus all 4
	public DanielWherryEmployee(String nam, int id)
	{
		name = nam;
		idNumber = id;
		department = "";
		position = "";
	
	}
	// Overloaded Constructor, accepts no arguments
	public DanielWherryEmployee()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	
	}
	// Mutator Method, changes information
	public void setName(String nam)
	{
		name = nam;
	}
	// Mutator Method
	public void setID(int id)
	{
		idNumber = id;
	}
	// Mutator Method
	public void setDept(String dept)
	{
		department = dept;
	}
	// Mutator Method
	public void setPos(String pos)
	{
		position = pos;
	}
	// Accessor Method, retrieves information
	public String getName()
	{
		return name;
	}
	// Accessor Method
	public int getID()
	{
		return idNumber;
	}
	// Accessor Method
	public String getDept()
	{
		return department;
	}
	// Accessor Method
	public String getPos()
	{
		return position;
	}
	 

}
