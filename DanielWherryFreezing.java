//Daniel Wherry
//CSCI 2070W
//Assignment 4, Q1
//3/21/14

public class DanielWherryFreezing
{
	private double temperature;
	
	public DanielWherryFreezing(double temp)
	{
		temperature = temp;
	}
	
	public void setTemp(double temp)
	{
		temperature = temp;
	}
	public double getTemp()
	{
		return temperature;
	}
	public boolean isEthylFreezing()
	{
		if(temperature <= -173)
		{
			return true;
		} else
		{
			return false;
		}
	}
	public boolean isEthylBoiling()
	{
		if(temperature >= 172)
		{
			return true;
		} else
		{
			return false;
		}
	}
	public boolean isOxygenFreezing()
	{
		if(temperature <= -362)
		{
			return true;
		} else
		{
			return false;
		}
	}
	public boolean isOxygenBoiling()
	{
		if(temperature >= -306)
		{
			return true;
		} else
		{
			return false;
		}
	}
	public boolean isWaterFreezing()
	{
		if(temperature <= 32)
		{
			return true;
		} else
		{
			return false;
		}
	}
	public boolean isWaterBoiling()
	{
		if(temperature >= 212)
		{
			return true;
		} else
		{
			return false;
		}
	}
}