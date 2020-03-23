package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for(int i = 1; i<= word.length(); i++) {
			for(int x = 0; x<i; x++) {
				System.out.print(word.substring(0,i));
			}
			System.out.print("\n");
		}	
	}
}
/*Enter a word :: a
a
Do you want to enter more sample input? y
Enter a word :: it
i
itit
Do you want to enter more sample input? y
Enter a word :: box
b
bobo
boxboxbox
Do you want to enter more sample input? y
Enter a word :: toad
t
toto
toatoatoa
toadtoadtoadtoad
Do you want to enter more sample input? y
Enter a word :: fishy
f
fifi
fisfisfis
fishfishfishfish
fishyfishyfishyfishyfishy
Do you want to enter more sample input? y
Enter a word :: dog
d
dodo
dogdogdog
Do you want to enter more sample input? n*/