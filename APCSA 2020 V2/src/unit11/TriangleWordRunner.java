package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		TriangleWord T = new TriangleWord();
		Scanner keyboard = new Scanner(System.in);
		String input = "y";
		
		while("y".equalsIgnoreCase(input)) {
			System.out.print("Enter a word :: ");
			String word = keyboard.next();
			T.printTriangle(word);
			
			System.out.print("\nDo you want to enter more sample input? ");
			input = keyboard.next();
			System.out.print("\n");
		}
		
	}
}