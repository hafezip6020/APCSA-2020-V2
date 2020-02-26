package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
//

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner // all test cases test and correct output was returned.
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);		 
		
		int xValue1,xValue2, yValue1, yValue2; 
		
		System.out.print("Enter side x1 ::  ");
		xValue1 = keyboard.nextInt();

		System.out.print("Enter side y1 ::  ");
		yValue1 = keyboard.nextInt();

		System.out.print("Enter side x2 ::  ");
		xValue2 = keyboard.nextInt();
		
		System.out.print("Enter side y2 ::  ");
		yValue2 = keyboard.nextInt();
		
	    Distance D = new Distance(xValue1,xValue2, yValue1, yValue2);
	    System.out.println("Distance Calculations");
	    D.toString();
	    System.out.println("\n");
	    D.calcDistance();
	    System.out.println(D);
	    		
	}
}