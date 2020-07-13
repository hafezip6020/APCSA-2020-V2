package Discrete_2;

import java.util.Scanner;

public class CoinRuuner
{
	public static void main( String[] args )
	{ 
		//the main 
		Coin[] purse = Coin.coinRay(); // we initialized our purse
		double total;
		System.out.println("How much money is in your wallet");
		Scanner input = new Scanner(System.in);
		total = input.nextDouble(); // set the amount in purse with scanner 
		
		
		for(int i=0; i<purse.length;i++) { 
			Coin.calcQuantity(purse[i], total);
			total = Math.round((total - (purse[i].getQuantity() * purse[i].getValue() ))*100)/100.0;
		}
		
		/* A for loop that calculates the quantity of a coin then subtract the monetary value from the total 
		 * for example if we had 16 cents and were dealing with nickels it would find it need to get 3 
		 * Nickels then subtract 15 cents from the total to leave one penny. */
		
		for(Coin c: purse) { // print statement
			System.out.println(c);
		}
	}
}
