//Daniel Wherry
//CSCI 2070W
//Assignment 3, Q4
//3/18/14

public class DanielWherryCube
{
	// Only one field
	private double edgeLength;

	// First Constructor
	public DanielWherryCube(double edge)
	{
		edgeLength = edge;
	}
	// Overloaded Constructor, no argument
	public DanielWherryCube()
	{
		edgeLength = 0.0;
	}
	// Mutator method
	public void setEdgeLength(double edge)
	{
		edgeLength = edge;
	}
	// The rest are accessor methods
	public double getEdgeLength()
	{
		return edgeLength;
	}
	public double getSurfaceArea()
	{
		double surfaceArea = 6 * edgeLength * edgeLength;
		return surfaceArea;
	}
	public double getVolume()
	{
		double volume = edgeLength * edgeLength * edgeLength;
		return volume;
	}
	public double getFaceDiagonal()
	{
	
		double faceDiagonal = Math.sqrt(2) * edgeLength; // Math.sqrt() is the way I know how to do sqrt, are there others?
		return faceDiagonal;
	}
	
	
}