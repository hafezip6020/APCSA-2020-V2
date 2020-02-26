package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality A = new StringEquality("WordOne", "WordTwo");
		A.setWords( "hello", "goodbye");
		A.checkEquality();
		System.out.println(A.toString());	
		
		A.setWords( "one", "two");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "three", "four");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "TCEA", "UIL");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "State", "Championship");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "ABC", "ABC");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "ABC", "CBA");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "Same", "Same");
		A.checkEquality();
		System.out.println(A.toString());
		
		
	}
}