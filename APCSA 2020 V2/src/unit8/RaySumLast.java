package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int size = ray.length-1;
		int total = 0;
		for (int i = 0; i<size; i++) {
			if (ray[i]>ray[size]) {
				total += ray[i];
			}
			
		}
		if (total > 0) {
			return total;
		} else {
			return -1;
		}
	}
}