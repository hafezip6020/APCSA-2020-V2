package Discrete_4;

import java.util.Scanner;
import java.util.ArrayList;

public class fib
{
	public static void main( String[] args )
	{ 
		//the main 
		int index=0;
		System.out.println("Which digit of Fibonacci number do you want");
		Scanner input = new Scanner(System.in);
		index = input.nextInt()-2; // set the amount in purse with scanner 
		// intiazes a list with the two starting Fibonacci terms 1 and 1 
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(1);
		fib.add(1);
		// Recursive formula adds the previous two terms. 
		for(int i=0; i<index;i++) { 
			fib.add(fib.get(i)+fib.get(i+1));
		}
		// prints all the entire sequence
		for(int i = 0; i<fib.size();i++ ) { // print statement
			System.out.print(fib.get(i) + " ");
		}
		// prints the digit desired. 
		System.out.println("\nthe: "+fib.size()+" digit of fibonnaci sequence is:" + fib.get(fib.size()-1));
	}
}