package Discrete_2;


public class Greedy
{
	public static void main( String args[] )
	{
		double total = 2.69;
		int tmp, quarter, dime, nickle, penny;
		System.out.println((int)(total/.25));
		System.out.println(total);
		
		quarter = (int)(total/.25);
		total = Math.round((total - (quarter * .25))*100)/100.0;
		System.out.println(total);
		
		dime = (int)(total/.10);
		total = Math.round((total - (dime * .10))*100)/100.0;
		System.out.println(total);
		
		nickle = (int)(total/.05);
		total = Math.round((total - (nickle * .05))*100)/100.0;
		System.out.println(total);
		
		penny = (int)(total/.01);
		total = Math.round((total - (penny * .01))*100)/100.0;
		System.out.println(total);
		
		System.out.print("Quarter :"+quarter +" Dime :"+dime +" Nickle :"+ nickle +" Penny :"+ penny);
		
		
		
		
	}
}