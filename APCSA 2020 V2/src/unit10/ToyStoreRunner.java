package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore1 ts = new ToyStore1("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(ts);
		
		ToyStore1 sto = new ToyStore1();
		System.out.println( sto );
		sto.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball" );
		System.out.println( sto );	
		System.out.println( "max == " + sto.getMostFrequentToy() );	
	}
}
//train train teddy teddy ball ball