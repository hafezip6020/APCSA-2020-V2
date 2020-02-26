package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{ 
		double num = 0;
	
		if ( a > b ) {
			num = a - b;	
		} else if( b > a ) {
			num = b - a;
		} else {
			num = a*b;
		}
		return num;
	}
}