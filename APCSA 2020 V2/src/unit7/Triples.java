package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		
	}

	public void setNum(int num)
	{


	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;



		return 1;
	}

	public String toString()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 1 ; i<=number ; i++) {
			a = i;
			for (int x = 1 ; x<=number ; x++) {
				b = x; 
				for (int z = 1 ; z<=number ; z++) {
					c = x; 
					if ( Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
						if (a%2!=0 && b%2==0 || a%2==0 && b%2!=0) {
							
						}
						
					}
				}
			}
		}

		String output="";






		return output+"\n";
	}
}