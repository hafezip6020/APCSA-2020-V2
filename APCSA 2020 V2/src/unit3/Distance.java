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

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0.0;
		
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = x2;
		xTwo = y1;
		yTwo = y2;
		distance = 0.0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = x2;
		xTwo = y1;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt( Math.pow( (xOne - xTwo), 2) + Math.pow( (yOne - yTwo), 2) ) ; 
	}
	
	public double getDistance()
	{
		this.calcDistance();
		return distance;
	}
	

	public String toString()
	{
		return "x1: "  + xOne + " y1: "  + yOne + "\nx2: " + xTwo + " y2: "  + yTwo + "\nTotal distance :" + distance;
	}
}