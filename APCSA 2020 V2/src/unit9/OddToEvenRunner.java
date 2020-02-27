package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		Integer [] Array1 = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.println(ListOddToEven.go(Arrays.asList(Array1)));
		
		Integer[] Array2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(ListOddToEven.go(Arrays.asList(Array2)));
		
		Integer[] Array3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(ListOddToEven.go(Arrays.asList(Array3)));
		
		Integer[] Array4 = {32767};
		System.out.println(ListOddToEven.go(Arrays.asList(Array4)));
		
		Integer[] Array5 = {255,255};
		System.out.println(ListOddToEven.go(Arrays.asList(Array5)));
		
		Integer[] Array6 = {9,10,-88,100,-555,1000};
		System.out.println(ListOddToEven.go(Arrays.asList(Array6)));
		
		Integer[] Array7 = {10,10,10,11,456};
		System.out.println(ListOddToEven.go(Arrays.asList(Array7)));
		
		Integer[] Array8 = {-111,1,2,3,9,11,20,30};
		System.out.println(ListOddToEven.go(Arrays.asList(Array8)));
		
		Integer[] Array9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(ListOddToEven.go(Arrays.asList(Array9)));
		
		Integer[] Array10 = {12,15,18,21,23,1000};
		System.out.println(ListOddToEven.go(Arrays.asList(Array10)));
		
		Integer[] Array11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(ListOddToEven.go(Arrays.asList(Array11)));
		
		Integer[] Array12 = {9,10,-8,10000,-5000,1000};
		System.out.println(ListOddToEven.go(Arrays.asList(Array12)));
		
	}
}