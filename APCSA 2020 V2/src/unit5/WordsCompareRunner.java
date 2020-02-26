package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare C = new WordsCompare("A","B");
		
		C.setWords("abe", "ape");
		C.compare();
		System.out.println(C.toString());
		
		C.setWords("giraffe", "gorilla");
		C.compare();
		System.out.println(C.toString());
		

		C.setWords("one", "two");
		C.compare();
		System.out.println(C.toString());
		
		C.setWords("fun", "funny");
		C.compare();
		System.out.println(C.toString());
		
		C.setWords("123", "19");
		C.compare();
		System.out.println(C.toString());
		
		C.setWords("193", "1910");
		C.compare();
		System.out.println(C.toString());
		
		C.setWords("goofy", "godfather");
		C.compare();
		System.out.println(C.toString());
		
		C.setWords("funnel", "fun");
		C.compare();
		System.out.println(C.toString());


	}
}