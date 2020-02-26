package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
		distance = 0;
		hours = 0;
		minutes = 0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		mph=0.0;
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		mph=0.0;
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = (float)distance / (hours + (float)minutes/60);
	}
	
	public String toString()
	{
		return (distance + " miles in " + hours + " hours and " + minutes + " minutes = " + mph + "MPH");
	}
}