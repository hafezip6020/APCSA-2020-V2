package Discrete_2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Arrays;

public class Coin
{ 	// defining characteristics of a coin
	private double value;
	private int quantity;
	private String name;

	// constructors 
	public Coin()
	{
		name = null;
		quantity =0;
		value = 0;
	}
	public Coin(String n, double v)
	{
		name = n; 
		value = v;
		quantity = 0;
	}
	
	public Coin(String n, double v, int q)
	{
		name = n; 
		value = v;
		quantity = q;
	}
	// accessory methods
	public double getValue() {
		return value;
		
	}
	
	public double getQuantity() {
		return quantity;
		
	}
	
	public void setQuantity(int q)
	{
		quantity = q;
	}
	// generates an Array of possible coins 
	// with each having the quantity of zero
	public static Coin[] coinRay() {
		Coin[] purse = new Coin[4];
		purse[0] = new Coin("Quarter", .25);
		purse[1] = new Coin("Dime", .10);
		purse[2] = new Coin("Nickle", .05); 
		purse[3] = new Coin("Penny", .01); 
		return purse;
		
	}
	
	// Calculates how many coin are need to add up the total or less 
	// if total is 16 cents and we are using nickles it would say 3 nickles are needed
	public static void calcQuantity(Coin c, double total) {
		
		c.setQuantity((int)(total/c.getValue()));
		
	}
// to string method that defines what our object the coin is 
 	public String toString()
 	{
 		return "Coin :" + name + " value :" + value +" Quantity :" + quantity;
	}
}