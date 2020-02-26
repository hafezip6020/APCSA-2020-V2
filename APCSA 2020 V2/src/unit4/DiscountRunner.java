package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

import unit3.MilesPerHour;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.println( String.format("%.1f", Discount.getDiscountedBill(amt)));
		System.out.println("\n Sample Data \n");
		System.out.println( String.format("%.1f", Discount.getDiscountedBill(500)));
		System.out.println( String.format("%.1f", Discount.getDiscountedBill(2500)));
		System.out.println( String.format("%.1f", Discount.getDiscountedBill(4000)));
		System.out.println( String.format("%.1f", Discount.getDiscountedBill(333.33)));
		System.out.println( String.format("%.1f", Discount.getDiscountedBill(95874.2154)));

		

		//System.out.println( Discount.getDiscountedBill(500) );	

	}
}