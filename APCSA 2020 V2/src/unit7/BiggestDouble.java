package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double large = 0;
		if (one > two){
			large = one;
		} else {
			large = two;
		}
		if (three > large) {
			large = three;
		}
		if (four > large) {
			large = four;
		}
		return large;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + "\nbiggest : " + this.getBiggest();
	}
}