package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{				
		int[] Array1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(RayDown.go(Array1));
		
		int[] Array2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RayDown.go(Array2));
		
		int[] Array3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RayDown.go(Array3));
		
		int[] Array4 = {32767};
		System.out.println(RayDown.go(Array4));
		
		int[] Array5 = {255,255};
		System.out.println(RayDown.go(Array5));
		
		int[] Array6 = {9,10,-88,100,-555,1000};
		System.out.println(RayDown.go(Array6));
		
		int[] Array7 = {10,10,10,11,456};
		System.out.println(RayDown.go(Array7));
		
		int[] Array8 = {-111,1,2,3,9,11,20,30};
		System.out.println(RayDown.go(Array8));
		
		int[] Array9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(RayDown.go(Array9));
		
		int[] Array10 = {12,15,18,21,23,1000};
		System.out.println(RayDown.go(Array10));
		
		int[] Array11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(RayDown.go(Array11));
		
		int[] Array12 = {9,10,-8,10000,-5000,1000};
		System.out.println(RayDown.go(Array12));
	}
}