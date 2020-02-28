package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int size = ray.size()-1;
		int total = 0;
		for (int i = 0; i<=size; i++) {
			if (ray.get(i)>ray.get(0)) {
				total += ray.get(i);
			}
			
		}
		if (total > 0) {
			return total;
		} else {
			return -1;
		}
	}
}