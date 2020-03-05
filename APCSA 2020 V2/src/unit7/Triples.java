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
		number = num;
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int q = 1;
		while (q < a && q < b && q < c) {
			if ( a % q == 0) {
				if ( b % q == 0) {
					if ( c % q == 0) {
						max = q;
					}
				}
			}
			q = q + 1;
		}



		return max;
	}

	public String toString()
	{
		
		String output="";
		for (int i = 1 ; i<number ; i++) 
			for (int x = i ; x<number ; x++) 
				for (int z = 1 ; z<number ; z++) { 
					if ( Math.pow(i, 2) + Math.pow(x, 2) == Math.pow(z, 2)) {
						if (i % 2 != x % 2 && this.greatestCommonFactor(i, x, z) <= 1) {
								output = output + i + " "+ x + " " + z +"\n";
						}
						
					}
				}
	
		return output+"\n";
	}
}