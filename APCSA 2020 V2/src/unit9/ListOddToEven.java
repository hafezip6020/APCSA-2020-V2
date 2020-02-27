package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddIndex = 0;
		int evenIndex = 0;
		int size = ray.size()-1;
		int distance = 0;
		
		for (int i = 0; i<size; i++) {
			if (ray.get(i) % 2 == 1) {
				oddIndex = i+1;
				break;
			}
		}
		
		for (int i = oddIndex; i<size; i++) {
			if (ray.get(i) % 2 == 0) {
				evenIndex = i+1;
				break;
			}
		}
		
		
		
		distance = Math.abs(oddIndex-evenIndex);
		if (oddIndex == 0 || evenIndex == 0) {
			return -1;
		} else {
			return distance;
		}
		
	}
}